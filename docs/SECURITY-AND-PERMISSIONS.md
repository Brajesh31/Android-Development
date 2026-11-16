# 🔐 Android Security and Permission Guide

This guide describes security considerations for an Activity-based Android app. It is not a security certification and does not claim that every current screen has been audited.

## Manifest review

Review every component declared in `AndroidManifest.xml`: Activity name, intent filters, exported state, required permissions, hardware feature declarations, and backup/data-extraction settings.

Keep internal activities non-exported unless external invocation is a documented requirement. Use one intentional launcher activity for release.

## Runtime permissions

Request dangerous permissions only when a user activates a feature that needs them. Explain the need in context and handle denial and permanent denial gracefully. Do not repeatedly prompt users who have declined.

Prefer system intents or pickers when they can complete the task without broad permissions.

## Camera capability

The project contains an `OpenCamera.kt` screen. Inspect its exact implementation before adding or changing permission declarations.

There is a difference between launching a system camera application through an Intent and accessing camera hardware directly through CameraX/Camera2. The permission model and lifecycle handling differ. Do not add camera permission merely because a screen is named OpenCamera.

## Intent input

Treat values from Intent extras, deep links, and external activities as untrusted. Validate presence, type, range, and identifiers before using data. Avoid exposing internal Activities unnecessarily.

## Secrets and configuration

Never hardcode API keys, tokens, passwords, signing credentials, private endpoints, or sensitive personal data. A local `.env` file does not secure secrets inside an APK. Anything packaged in an app can potentially be extracted.

## Backup and data extraction

The project includes backup/data-extraction XML configuration. Review those rules when user information is stored. Exclude sensitive or transient data from backup where appropriate and document restore behaviour.

## Logging

Do not log credentials, tokens, private user content, or sensitive camera/media data. Remove verbose debug logging from release builds.

## Dependencies

Review library updates and known vulnerabilities. Keep dependencies necessary and confirm licences before introducing third-party SDKs.

## Release security checklist

- [ ] Only required permissions are declared.
- [ ] Runtime permissions are requested in context.
- [ ] Internal Activities are not unnecessarily exported.
- [ ] Intent extras and external input are validated.
- [ ] No secrets are embedded in source or resources.
- [ ] Backup rules are reviewed.
- [ ] Logs do not expose private data.
- [ ] Release signing keys remain outside the repository.
- [ ] Dependencies are reviewed.
