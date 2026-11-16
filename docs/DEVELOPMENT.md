# 🧑‍💻 Android Development Workflow

## Before changing a screen

Locate the Activity, corresponding XML layout, manifest declaration, supporting adapter/model, and resource dependencies. Read existing Intent contracts before changing navigation.

## Recommended workflow

1. Sync the project using its Gradle wrapper.
2. Identify the affected Activity and layout.
3. Confirm resource and manifest relationships.
4. Make one focused change.
5. Build the debug variant.
6. Run relevant JVM and instrumentation tests.
7. Exercise the screen manually.
8. Test lifecycle, back navigation, day/night theme, and larger text.
9. Review Logcat and lint findings.
10. Update documentation and changelog.

## Kotlin guidelines

- Use clear names and small functions.
- Avoid blocking the main thread.
- Avoid holding Activity references beyond their lifecycle.
- Validate Intent extras and user input.
- Keep UI strings in resources.
- Handle nullability explicitly.
- Prefer lifecycle-aware APIs where appropriate.

## XML guidelines

- Use descriptive resource IDs.
- Avoid fixed dimensions where they prevent adaptation.
- Add content descriptions to meaningful image controls.
- Test text scaling and smaller screen sizes.
- Keep repeated item layouts reusable.

## Gradle guidelines

Do not upgrade Gradle, Android Gradle Plugin, Kotlin, compile SDK, and dependencies as an unrelated bundle. Make compatibility changes deliberately and validate a clean build.

## Git hygiene

Do not commit local IDE workspace files, build directories, keystores, signing credentials, emulator data, or private logs.
