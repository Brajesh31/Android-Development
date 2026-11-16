# ♿ Android Accessibility Guidelines

Accessibility is part of functional correctness. A screen is not finished if a user cannot understand or operate it with TalkBack, larger text, alternative input, or different display settings.

## Touch targets

Make interactive elements comfortably large and separated. Follow current Android accessibility guidance for minimum touch target dimensions. Avoid tightly packed icon buttons and controls that are difficult to activate.

## TalkBack and content descriptions

- Add meaningful `contentDescription` values to informative images and icon-only controls.
- Do not add redundant descriptions to decorative images.
- Ensure controls expose a useful role and label.
- Group related information where it improves navigation.
- Check the spoken order, not only visual order.

## Text scaling

Test larger system font and display sizes. Avoid fixed-height containers that clip text. Prefer layouts that can grow vertically and scroll.

## Contrast and color

Text and icons must remain distinguishable from their backgrounds. Do not communicate success, failure, selection, or warnings by color alone. Check day and night themes.

## Focus and keyboard navigation

Ensure focus order follows the logical reading order. Keyboard and switch users should reach every action. Focus should remain visible and not disappear behind overlays.

## Motion and animation

Provide a usable experience when animation is reduced or disabled. Avoid flashing effects and unnecessary movement. Do not rely on animation alone to communicate loading or completion.

## Forms and validation

Labels should identify the expected input. Error messages should explain what happened and how to correct it. Preserve entered values when safe and practical.

## Lists and adapters

List item controls should have clear labels and separate focus targets where needed. Avoid announcing complex rows as one unintelligible string. Ensure row actions can be reached without precise gestures.

## Accessibility test matrix

| Area | Test |
|---|---|
| TalkBack | Navigate every screen and activate controls |
| Large font | Increase font size and check clipping |
| Display size | Increase display scaling |
| Contrast | Review day/night colors and text contrast |
| Keyboard | Navigate controls and actions |
| Touch | Check target size and spacing |
| Motion | Check reduced-animation settings |
| Error states | Confirm errors are announced clearly |

## Before merging UI changes

- [ ] Meaningful labels and content descriptions exist.
- [ ] Decorative imagery is not announced unnecessarily.
- [ ] Text scales without clipping.
- [ ] Interactive targets are adequately sized.
- [ ] Color is not the only status indicator.
- [ ] Focus order is logical.
- [ ] Day and night themes remain legible.
- [ ] Important status changes are announced.
