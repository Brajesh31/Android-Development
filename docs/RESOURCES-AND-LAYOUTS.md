# 🎨 Android Resources and XML Layouts

Android resources separate presentation and configuration from Kotlin code. This repository uses XML layouts, drawable assets, fonts, mipmap launcher resources, raw animation data, values resources, and XML configuration files.

## Resource catalogue

| Directory | Usage |
|---|---|
| `res/layout/` | Activity layouts and reusable row/card layouts |
| `res/drawable/` | Raster images, vector icons, shape drawables |
| `res/font/` | Font assets and font-family definitions |
| `res/mipmap-*/` | Launcher icons for screen densities |
| `res/raw/` | Raw resources such as animation JSON |
| `res/values/` | Strings, colors, themes, font metadata |
| `res/values-night/` | Night-mode resource overrides |
| `res/xml/` | Backup and data-extraction configuration |

## Layout practices

- Use clear and descriptive view IDs.
- Keep hierarchies shallow where possible.
- Avoid fixed dimensions that break under text scaling.
- Keep repeated rows in dedicated item layouts.
- Use string resources for visible text.
- Provide content descriptions for meaningful images and icon-only controls.
- Test different screen sizes and font scales.

## Drawable and image practices

Use scalable vector or shape resources for UI elements where possible. Keep raster assets appropriately sized and licensed. Confirm all third-party image terms before redistribution.

## Font resources

The current tree includes Poppins font assets. Confirm their source and redistribution licence before publishing. Font files may have licences separate from the project MIT licence.

## Theme and night mode

Values and values-night support theme variation. Check text contrast, drawable tint, status/navigation bar appearance, and component styling in both themes.

## Localization

Move user-facing text into string resources. Add locale-specific resource folders when translations are maintained. Avoid constructing sentences from fragments because word order varies between languages.

## Naming and validation

Use lowercase resource names with underscores. Resource IDs should be descriptive and stable. Renaming a resource requires updating every Kotlin and XML reference.

Build after changing resource names or XML. Successful resource compilation does not guarantee a usable layout, so inspect the result on an emulator too.
