# ✨ Feature and Source Catalogue

This guide maps the main Kotlin source areas to the learning concepts they appear to demonstrate. File names are used as the inventory basis; a source file existing in the repository does not prove that its screen is linked from the current home UI or fully tested.

## Activity catalogue

| Source | Area | Learning focus |
|---|---|---|
| `MainActivity.kt` | Main activity | Activity lifecycle and navigation |
| `Home.kt` | Home screen | Screen-level UI |
| `Dashboard.kt` | Dashboard | Dashboard-style screen |
| `Calculator.kt` | Calculator | Input handling and calculations |
| `CountActivity.kt` | Counter | Stateful UI interaction |
| `List.kt` | List screen | Collection presentation |
| `LatihanList.kt` | Practice list | List-oriented exercise |
| `ListPemrograman.kt` | Programming catalogue | Language list |
| `OpenCamera.kt` | Camera | Platform intent and permission considerations |
| `ScrollView.kt` | Scroll demonstration | Scrollable layout |
| `Travel.kt` | Travel screen | Travel/detail UI |
| `Detail.kt`, `DetailStore.kt` | Detail screens | Selected-item details |
| `DoaHarianActivity.kt` | Daily prayer | Daily-prayer UI |
| `splashScreen.kt` | Splash screen | Startup screen |
| `belajarRelative.kt`, `Visibility.kt`, `card.kt` | Layout demonstrations | Relative layout, visibility, cards |

## Adapter and model catalogue

| Source area | Responsibility |
|---|---|
| `adapter/DoaHarianAdapter.kt` | Binds daily-prayer model items to row layouts |
| `adapter/LanguageAdapter.kt` | Binds language data to list rows |
| `Doa/DoaAdapter.kt` | Prayer list adapter |
| `Doa/DashboardDoa.kt` | Prayer dashboard support |
| `Doa/Doa.kt` | Prayer feature support |
| `model/DoaHarian.kt` | Daily-prayer model |
| `model/Language.kt` | Programming-language model |

## Resource inventory

- `res/layout/`: activity and reusable item layouts.
- `res/drawable/`: raster images, vector icons, and shape resources.
- `res/font/`: Poppins font assets.
- `res/mipmap-*/`: launcher icons for density buckets.
- `res/raw/`: raw animation resource.
- `res/values/`: strings, colors, themes, and font metadata.
- `res/values-night/`: night-mode values.
- `res/xml/`: backup and data-extraction configuration.

## Reviewing a feature

For every screen, confirm its Activity, manifest entry, layout, navigation destinations, data model, permissions, empty/error states, back-navigation behaviour, accessibility labels, and tests.

## Navigation caveat

The manifest has multiple launcher intent filters according to the existing project notes. Do not assume every screen is reached from one unified home screen until the manifest and Intent calls have been reviewed.
