# 🧭 Android Development Support Guide

This guide helps learners resolve setup, build, runtime, and UI issues and prepare useful reports.

## Start Here

- [README](README.md): overview and quick start.
- [Installation](docs/INSTALLATION.md): Android Studio, SDK, JDK, emulator.
- [Features](docs/FEATURES.md): screen/source catalogue.
- [Architecture](docs/ARCHITECTURE.md): application structure.
- [Troubleshooting](docs/TROUBLESHOOTING.md): common failures.
- [Testing](docs/TESTING.md): test and manual QA guidance.

## Choose the Right Channel

| Need | Recommended route |
|---|---|
| Build or Gradle failure | Bug report with versions and sanitized Gradle output |
| Activity crash | Bug report with screen, steps, and sanitized Logcat |
| Layout or accessibility issue | Include device dimensions and font/display scale |
| Permission behaviour | Include Android version and permission state |
| Feature idea | Feature request template |
| Documentation correction | Focused issue or pull request |
| Security vulnerability | Private report described in SECURITY.md |

## Useful Diagnostic Information

Include:
- Android Studio version.
- JDK version.
- Gradle wrapper and Android Gradle Plugin versions.
- Android SDK platform.
- Device or emulator model and API level.
- Activity/screen involved.
- Steps to reproduce.
- Expected and actual behaviour.
- Sanitized Logcat or build output.

## Privacy

Remove personal data, access tokens, signing details, and private logs before posting. Never attach keystores or files containing credentials.

## Support Boundaries

This is an educational Android project. No guaranteed response time or hosted application support is provided.
