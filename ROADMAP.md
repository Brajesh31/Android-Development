# 🗺️ Android Development Roadmap

Items below are proposed improvements, not completed functionality or delivery commitments.

## Priority 1: Application Entry and Navigation

- [ ] Review multiple launcher intent filters.
- [ ] Define one intentional launcher Activity.
- [ ] Document all destinations and Intent extras.
- [ ] Verify back-stack behaviour and duplicate Activity handling.

## Priority 2: Lifecycle and State

- [ ] Review every Activity lifecycle implementation.
- [ ] Handle configuration changes and state restoration.
- [ ] Move long-running work off the main thread.
- [ ] Use lifecycle-aware APIs for asynchronous work.

## Priority 3: Permissions and Platform Capabilities

- [ ] Audit camera intent and permission requirements.
- [ ] Minimize manifest permissions.
- [ ] Handle denied and permanently denied permissions.
- [ ] Validate exported component declarations.

## Priority 4: UI and Accessibility

- [ ] Audit TalkBack labels and content descriptions.
- [ ] Test large font and display scaling.
- [ ] Check contrast in day/night themes.
- [ ] Review touch targets and keyboard navigation.
- [ ] Improve responsive layouts.

## Priority 5: Testing and Maintainability

- [ ] Add meaningful unit tests for logic.
- [ ] Add instrumentation coverage for critical screen journeys.
- [ ] Add UI tests for navigation and permission flows.
- [ ] Keep Gradle and dependency versions compatible.

## Priority 6: Release Readiness

- [ ] Document third-party asset licences.
- [ ] Verify backup/data-extraction rules.
- [ ] Define versioning and signing workflow.
- [ ] Prepare accurate privacy and distribution declarations if publishing.
