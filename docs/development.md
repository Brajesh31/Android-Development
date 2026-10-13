# Development

Follow Android lifecycle conventions. Keep view binding/find-view logic scoped to the activity lifecycle, release listeners when needed, and avoid work on the main thread. Use resource IDs and `strings.xml` rather than duplicating UI literals.

When adding a screen:

1. Add the Kotlin activity and XML layout.
2. Register it in the manifest with the least required export visibility.
3. Add accessible labels and localized strings.
4. Add a unit or instrumented test for meaningful behavior.
5. Run Gradle tests and a debug build.
