# 🧪 Android Testing Strategy

The repository contains example JVM and instrumented test source sets. The presence of template test classes does not establish meaningful coverage of all activities and user journeys.

## Test layers

| Layer | Location / command | Suitable checks |
|---|---|---|
| Local JVM unit tests | `app/src/test/`, `./gradlew test` | Pure Kotlin logic and formatting |
| Android instrumented tests | `app/src/androidTest/`, `./gradlew connectedAndroidTest` | Framework-dependent code and device behaviour |
| UI/manual testing | Emulator or physical device | Navigation, layout, permissions, accessibility |
| Build validation | `./gradlew assembleDebug` | Gradle, Kotlin, resources, manifest integration |
| Static review | Android Studio inspections | Resource issues, lifecycle concerns, lint findings |

## Essential build commands

```bash
./gradlew tasks
./gradlew assembleDebug
./gradlew test
./gradlew connectedAndroidTest
./gradlew lint
```

Use `gradlew.bat` on Windows. Check the project for available tasks if a task is not configured.

## Screen smoke-test matrix

| Screen/feature | Manual test |
|---|---|
| Main and home screens | Launch, navigation, back behaviour |
| Dashboard | Content renders and actions respond |
| Calculator | Inputs, calculations, invalid values |
| Counter | Increment/decrement boundaries |
| Lists | Empty state, item display, click behaviour |
| Detail screens | Correct item data passed and displayed |
| Daily prayer | Data binding and scroll behaviour |
| Camera | Device capability, permission/intent result, cancellation |
| Travel/cards | Images, scrolling, layout scaling |
| Splash | Startup transition and lifecycle |

## Accessibility tests

Test TalkBack, large font, display scaling, keyboard/switch access where available, night theme, and content descriptions. See ACCESSIBILITY.md.

## Current coverage boundary

Only example test files are visible in the repository tree. Do not claim all screens are covered until assertions for those behaviours exist and tests pass on supported devices.
