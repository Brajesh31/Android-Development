# 🔐 Security Policy

This repository is an Android learning application. It includes Activities, XML resources, images, fonts, and platform examples. Android applications can expose embedded resources and code to inspection, so secrets must never be packaged into the app.

## Supported Scope

This policy applies to Kotlin source, XML layouts, AndroidManifest.xml, Gradle configuration, dependencies, resources, backup rules, GitHub Actions, and release artifacts.

## Reporting a Vulnerability

Use GitHub private vulnerability reporting where enabled:

https://github.com/Brajesh31/Android-Development/security/advisories/new

If unavailable, contact the repository owner privately through GitHub. Do not publish exploit details, credentials, signing material, or private user data in public issues.

Include the affected file, commit, Android version/device, reproduction steps, impact, and sanitized evidence.

## Secrets and Signing

Never commit:
- Keystores or private signing keys.
- Keystore passwords.
- Play Console service-account credentials.
- API tokens or passwords.
- Private endpoints or sensitive configuration.
- Personal or sensitive user data.

Anything packaged in an APK may be extracted. A local `.env` file does not make an API key secret if it is bundled into the application. Use a trusted backend for secrets that must remain confidential.

## Manifest and Components

Review all exported components and intent filters. Keep internal Activities non-exported unless external access is a deliberate requirement. Validate incoming Intent actions, URIs, and extras.

## Permissions

Request only the permissions needed for a feature. Prefer system intents and pickers when they avoid broad permissions. Explain permission purpose in context and handle denial without crashing or coercing the user.

## Local Data and Backups

Review backup and data-extraction rules before storing user data. Do not log sensitive information. Avoid writing private data to external storage without a clear need and appropriate controls.

## Dependencies and Assets

Review dependency updates, source repositories, known advisories, and licence terms. Fonts, images, icons, and animation assets may have licences distinct from the root MIT licence.

## Release Security Checklist

- [ ] No signing keys or credentials are committed.
- [ ] Only required permissions are declared.
- [ ] Internal Activities are not unnecessarily exported.
- [ ] External Intent data is validated.
- [ ] Backup and extraction rules are reviewed.
- [ ] Sensitive data is not logged.
- [ ] Release build signing is configured outside Git.
- [ ] Third-party dependencies and assets are reviewed.
