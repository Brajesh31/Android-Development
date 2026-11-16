# 📦 Android Build and Release Guide

## Local debug build

From the project root:

```bash
./gradlew assembleDebug
```

On Windows, use `gradlew.bat assembleDebug`.

The debug APK is typically written under `app/build/outputs/apk/debug/`, depending on module configuration.

## Build validation

Run:

```bash
./gradlew test
./gradlew connectedAndroidTest
./gradlew lint
./gradlew assembleDebug
```

Instrumented tests require an available emulator or connected device.

## Release readiness

Before a release:
- Confirm one intentional launcher activity.
- Review application ID and version code/name.
- Confirm compile, target, and minimum SDK values.
- Remove test-only and debug-only behaviour.
- Review permissions and exported components.
- Test day/night themes and accessibility.
- Run unit tests, instrumented tests, lint, and a release build.
- Check app size and resource quality.
- Review backup and data-extraction policies.
- Document third-party licence notices.

## Signing

Never commit keystore files, passwords, signing certificates with private keys, or Play Console credentials. Configure release signing through secure local or CI secrets. Do not use debug signing for production distribution.

## Distribution boundary

A successful debug APK is not a production release. The repository's examples should be reviewed for one coherent launch route, permissions, navigation, testing, privacy, and UI readiness before publication.
