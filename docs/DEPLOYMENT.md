# 🚀 Android Deployment and Distribution

This guide covers building and distributing the current Android project. It does not imply that the application is release-ready or published on Google Play.

## Debug deployment

Build a debug APK:

```bash
./gradlew assembleDebug
```

Install to a connected device:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Confirm the actual APK path if output naming or build variants have been customized.

## Device verification

Before sharing a build:
- Install on a clean emulator/device.
- Test each intended entry screen.
- Exercise navigation and back behaviour.
- Verify camera or other platform intents.
- Check permissions and denial handling.
- Test different API levels supported by the app.
- Verify day/night themes and larger text.
- Inspect Logcat for crashes.

## Production distribution

A production release requires one deliberate launcher Activity, reviewed application ID and versioning, release signing, permission minimization, privacy review, accessible UI, test evidence, and third-party asset notices.

## Signing and secrets

Never commit a keystore, private signing key, keystore password, Google Play service-account key, or private deployment token. Use secure local configuration or protected CI secrets.

## Store listing readiness

Before publishing, prepare accurate screenshots, app description, support/privacy information, content rating, data-safety disclosures, and declarations required by the distribution platform. Claims must match actual app behaviour.
