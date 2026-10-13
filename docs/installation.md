# Installation

Install Android Studio, Android SDK platform 34, build tools, and a JDK supported by the repository's Gradle/Android plugin. Clone the repository and open it as a Gradle project.

On Windows:

```powershell
.\gradlew.bat assembleDebug
.\gradlew.bat test
```

Create an API 29+ emulator or connect a device with USB debugging enabled. No runtime database or environment service is required for the current examples.
