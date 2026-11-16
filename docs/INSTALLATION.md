# 🖥️ Android Studio Installation and Setup

## Requirements

The current README documents Android Studio, Android SDK 34, a compatible JDK, and an emulator or device running API 29 or newer. Verify exact plugin and JDK compatibility against the project's Gradle configuration before changing the environment.

## Open the project

1. Clone the repository.
2. Launch Android Studio.
3. Choose **Open** and select the repository root.
4. Allow Gradle sync to complete.
5. Install the requested SDK platform and build tools.
6. Resolve JDK and Gradle compatibility warnings before editing source.

## Gradle wrapper

Use the repository wrapper instead of an unrelated globally installed Gradle version:

```bash
./gradlew tasks
```

Windows:

```powershell
.\gradlew.bat tasks
```

## Emulator setup

Create an Android Virtual Device compatible with the application's minimum SDK. Start the emulator before running instrumented tests. A physical device can also be used after enabling developer options and USB debugging.

## First build

```bash
./gradlew assembleDebug
```

If sync or build fails, capture the first relevant Gradle error, JDK version, Android Studio version, and installed SDK platforms. Avoid changing plugin, Gradle, Kotlin, and JDK versions simultaneously.
