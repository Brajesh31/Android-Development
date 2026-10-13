# FAQ

## Is this one finished production application?

No. It is a collection of Android activity and UI learning examples in one application module.

## Why are several activities exported?

The manifest exposes screens for experimentation and multiple launcher demonstrations. Review and reduce exports before release.

## Does the app need a backend?

No backend is required by the current code. The examples use local resources and device intents.

## Where do I put signing credentials?

Keep them outside Git using Android Studio/Gradle local properties or a protected CI secret store. Never add them to the repository.
