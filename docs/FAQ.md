# ❓ Android Development FAQ

## What is this repository?

A Kotlin Android learning project with multiple Activity and XML layout examples, adapters, models, resources, and test-source templates.

## Is it a production-ready app?

Not automatically. It is a learning repository. The manifest and navigation should be reviewed, and each feature should be tested before production distribution.

## Which IDE should I use?

Android Studio is recommended because it integrates the Android SDK, emulator, Gradle, Logcat, layout inspection, and test tools.

## Do I need a physical phone?

No. An Android emulator can run the app and instrumented tests, although camera and hardware behaviour may differ from a physical device.

## Why are there multiple launcher entries?

The current project notes that several Activities have launcher filters. This allows experiments but should be simplified to one intentional launcher Activity before a release.

## Does the project include a backend or database?

The inspected repository tree does not establish a backend or database integration. The current app is documented as a local Android learning project.

## How do I run tests?

Use `./gradlew test` for JVM tests and `./gradlew connectedAndroidTest` for instrumented tests. The latter requires a connected device or emulator.

## Are all screens accessible?

That has not been established by an accessibility audit. Follow the accessibility guide and test TalkBack, font scaling, contrast, and keyboard navigation.

## Is the camera feature direct camera hardware access?

The screen name alone does not answer that. Inspect OpenCamera.kt to determine whether it launches a system camera intent or accesses camera hardware directly.
