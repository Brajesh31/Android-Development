# 🧯 Android Troubleshooting Guide

## Gradle sync failure

Check the Gradle wrapper distribution, Android Gradle Plugin version, JDK compatibility, SDK installation, repository connectivity, and Gradle cache errors. Change one compatibility variable at a time.

## SDK platform missing

Install the compile SDK platform and build tools configured in the app module. Do not guess the version; inspect `app/build.gradle.kts`.

## Kotlin or dependency resolution error

Check declared plugin/dependency versions, repositories, offline mode, and compatibility. Review the first dependency resolution error before updating packages.

## Resource linking failure

Inspect the file and line reported by AAPT. Verify resource names are lowercase, referenced IDs exist, XML is well formed, and drawable formats are supported.

## App opens an unexpected screen

Inspect launcher intent filters in AndroidManifest.xml. Multiple launcher entries may make the system show more than one app entry or launch an unintended Activity.

## Camera screen fails

Check whether the screen launches an external camera app or uses CameraX/Camera2 directly. Verify device capability, runtime permission requirements, Intent resolution, result handling, and lifecycle.

## Image does not display

Verify drawable resource name, path, file format, Glide request, and density. Inspect Logcat for decode or resource errors.

## Layout clips content

Test smaller widths, larger font size, display scaling, and night mode. Avoid fixed heights where content needs to grow or scroll.

## Instrumentation tests cannot start

Start an emulator or connect an authorized Android device. Confirm ADB sees the target and that the device API is compatible.

## APK does not install

Check min SDK, ABI, package ID, signing certificate conflicts, and whether the device already has a differently signed build installed.

## Useful diagnostics

```bash
./gradlew --version
./gradlew tasks
./gradlew assembleDebug --stacktrace
adb devices
```
