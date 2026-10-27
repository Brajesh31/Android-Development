# Belajar Android Activity

`Belajar Android Activity` is a Kotlin/Android learning application containing small, independently reachable demonstrations of Android activities, XML layouts, adapters, intents, lists, a calculator, camera launching, travel/detail screens, and a prayer (doa/dzikir) experience.

## What is included

- Kotlin activities under `app/src/main/java/`.
- XML layouts, drawables, fonts, icons, and Lottie content under `app/src/main/res/`.
- A prayer dashboard and daily-prayer adapters.
- Programming-language list and practice screens.
- Calculator, count, scroll, card, travel, detail, and camera examples.
- Local unit and Android instrumentation test templates.

The manifest currently exposes several learning screens with launcher filters. This is intentional for experimentation but should be reduced to one production entry point before publishing.

## Requirements

- Android Studio with Android SDK 34.
- JDK compatible with the installed Android Gradle Plugin.
- An emulator or Android device running API 29 or newer.

## Build and run

Open the repository in Android Studio, allow Gradle sync, select the `app` configuration, and run it on a device or emulator. From a terminal:

```bash
./gradlew assembleDebug
./gradlew test
./gradlew connectedAndroidTest
```

On Windows use `gradlew.bat` instead of `./gradlew`. The app uses Kotlin, Java 8 bytecode compatibility, AndroidX, Material Components, ConstraintLayout, Glide, Glide Transformations, and Lottie.

## Project structure

```text
app/src/main/java/      Activities, adapters, and models
app/src/main/res/layout XML screens and list items
app/src/main/res/drawable Images, icons, and shape resources
app/src/main/res/values  Strings, themes, colors, and fonts
app/src/test/            JVM unit tests
app/src/androidTest/     Instrumented Android tests
```

## Development notes

Keep UI strings in resources, preserve lifecycle safety when adding asynchronous work, request runtime permissions before camera access, and validate intent targets before launching them. Avoid embedding secrets or personal data in resources. New activities should be added to the manifest with the least visibility necessary.

## License

Original code and documentation are released under the MIT License. Fonts, images, icons, and third-party libraries may have separate licenses.

Last updated: 2026-10-27 19:54 UTC
