# Architecture

The repository is a single Android application module named `app`. Kotlin activities provide independent learning screens, XML layouts define presentation, adapters bind lists, and small model classes represent prayer and language data.

The manifest currently contains multiple exported activities and several launcher filters because the project is an activity-learning sandbox. A production app should use one launcher activity and navigate internally.

Dependencies include AndroidX Core/AppCompat, Material Components, ConstraintLayout, Glide, Glide Transformations, and Lottie.
