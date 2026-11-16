# 🤝 Contributing to Android Development

Thank you for considering a contribution. This repository is an Android learning project with Kotlin Activities, XML layouts, adapters, models, and resource examples. Contributions should improve correctness, learning value, accessibility, lifecycle safety, and maintainability.

## Table of Contents

- [Project Scope](#project-scope)
- [Ways to Contribute](#ways-to-contribute)
- [Development Setup](#development-setup)
- [Working on a Feature](#working-on-a-feature)
- [Kotlin and XML Guidelines](#kotlin-and-xml-guidelines)
- [Manifest and Permission Changes](#manifest-and-permission-changes)
- [Accessibility Expectations](#accessibility-expectations)
- [Testing Requirements](#testing-requirements)
- [Pull Request Checklist](#pull-request-checklist)

## Project Scope

The repository demonstrates Android fundamentals. It is not currently documented as a production service with a backend or database. Avoid introducing frameworks, network services, storage layers, or additional permissions without a clear use case.

## Ways to Contribute

| Area | Example contribution |
|---|---|
| Activities | Correct lifecycle handling and navigation |
| Layouts | Responsive XML and improved view hierarchy |
| Adapters | Correct item binding and click behaviour |
| Models | Clearer and safer data representation |
| Accessibility | TalkBack labels, contrast, touch targets |
| Permissions | Least-privilege declarations and graceful denial |
| Tests | Unit and instrumentation coverage |
| Documentation | Accurate setup and feature explanations |

## Development Setup

1. Install Android Studio and a compatible JDK.
2. Install the SDK platform requested by Gradle.
3. Clone the repository.
4. Open the repository root in Android Studio.
5. Wait for Gradle sync.
6. Run the debug build on an emulator or device.

Use the committed Gradle wrapper rather than assuming a global Gradle version.

## Working on a Feature

Before editing, locate the Activity, layout XML, manifest entry, resource files, adapter/model dependencies, and any navigation targets. Confirm which screens are affected and whether permissions or exported components change.

Keep changes focused. Avoid unrelated refactoring of Kotlin, XML, Gradle, or resource files in a documentation-only contribution.

## Kotlin and XML Guidelines

- Use clear class, function, and variable names.
- Avoid blocking the main thread.
- Handle lifecycle and configuration changes.
- Avoid keeping Activity references beyond their lifecycle.
- Validate Intent extras and user input.
- Keep visible text in string resources.
- Use descriptive resource IDs.
- Avoid hardcoded dimensions that clip under text scaling.
- Reuse item layouts where appropriate.
- Add meaningful content descriptions to informative images and icon-only controls.

## Manifest and Permission Changes

Explain why each new permission is necessary. Request runtime permissions when the user invokes the feature. Handle denial and permanently denied cases. Keep internal Activities non-exported unless external invocation is intentionally required. Do not add camera permission merely because a screen has "Camera" in its name, inspect whether it launches a system camera app or accesses hardware directly.

## Accessibility Expectations

Test TalkBack, large font and display scaling, text contrast, logical focus order, touch target size, night theme, and motion preferences. Do not use color as the only way to communicate status.

## Testing Requirements

For relevant changes:
- Run Gradle sync and `assembleDebug`.
- Run `test` for JVM tests.
- Run `connectedAndroidTest` when a device/emulator is available.
- Run Android lint.
- Manually test the affected screen and navigation.
- Review Logcat for crashes and permission issues.

Do not claim tests passed unless they were actually run.

## Pull Request Checklist

- [ ] The change has a clear purpose.
- [ ] Only relevant files changed.
- [ ] Manifest and permissions reviewed.
- [ ] Lifecycle and back navigation checked.
- [ ] Accessibility and screen scaling checked.
- [ ] Build and relevant tests run.
- [ ] No signing keys, credentials, or private information included.
- [ ] Documentation and changelog updated.
- [ ] Third-party asset licences reviewed where applicable.
