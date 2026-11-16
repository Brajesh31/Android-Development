# 🧰 Android Development Maintainer Guide

## Responsibilities

Keep the project buildable, preserve its educational scope, review lifecycle and permissions, maintain documentation, and ensure published claims match tested app behaviour.

## Change review

Review manifest component and launcher configuration, Activity lifecycle correctness, Intent targets and extra validation, runtime permission purpose and denial behaviour, XML layout adaptation and accessibility, resource and third-party asset licences, Gradle plugin and dependency compatibility, test evidence, backup/data-extraction configuration, and secrets.

## Release preparation

1. Review the full diff.
2. Run Gradle sync and debug build.
3. Run JVM unit tests.
4. Run instrumentation tests on a device/emulator.
5. Run lint and review findings.
6. Verify one intentional launcher entry.
7. Test critical user journeys and permissions.
8. Audit accessibility and different screen configurations.
9. Review asset and dependency licences.
10. Prepare release signing outside Git.
11. Update CHANGELOG.md and release notes.

## Dependency maintenance

Do not upgrade Gradle, Kotlin, Android Gradle Plugin, compile SDK, and libraries together without compatibility analysis. Review dependency advisories and licences.

## Routine checklist

- [ ] Review issues and pull requests.
- [ ] Check Gradle and CI status.
- [ ] Review manifest permissions and exported components.
- [ ] Verify navigation and lifecycle behaviour.
- [ ] Review accessibility regressions.
- [ ] Check third-party notices.
- [ ] Keep release secrets out of Git.
