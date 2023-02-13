# Changelog

## [Unreleased]

## [1.2.0] - 2023-02-11

This is a bugfix/maintenance release that also contains a few style improvements.

### Chores

- (Build) JavaFX version updated to 19 (September 2022).
- (Build) Added ErrorProne plugin.
- (Build) Added Checkstyle plugin.

### Improvements

- (Build) SceneBuilder theme pack generation (#28) (thanks to **ennerf**).
- (CSS) Add inner border radius to improve controls border corners (#24) (thanks to **mimoguz**).
- (CSS) Hover effect for `CheckBox` and `RadioButton`.
- (CSS) Hover effect for `TabPane` close button.
- (CSS) Setting `Label` color via pseudo-classes support.
- (CSS) Setting `FontIcon` color support.
- (CSS) Increased `Menu`/`Menubar` paddings.

### Bugfixes

- (CSS) Fix text inputs borders color (#21).
- (CSS) Fix `Tooltip` text not showing for circular buttons.
- (CSS) Prevent context menu from inheriting text input font properties.
- (CSS) Fix invalid `DatePicker` cell size.
- (Base) Remove `ToggleSwitch` left padding when text is empty.
- (Base) Fix `PasswordTextFormatter` garbled input.

## [1.1.0] - 2022-10-10

### Features

- (Sampler) 🚀 External themes support. Sampler can now be used to develop custom themes.
- (Sampler) 🚀 Brand new improved user interface.
- (Sampler) Widget page that aims to provide examples of some well-known components that won't be added to the project, but can be easily created using existing controls and a bit of CSS. First examples: `Card`, `Message`, `Stepper`, `Tag`.
- (Base) New control: `RingProgressIndicator`. Like `ProgressIndicator`, but fully customizable and uses arc instead of fill to indicate progress value.
- (Base) New skin: `ProgressSliderSkin`. A slider with color track.
- (Base) New `Breadcrumbs` API to provide more control customization.
  - Anything that extends `ButtonBase` can be used as `Breadcrumbs` item.
  - Divider is now customizable via corresponding factory.
- (Base) New utility: `PasswordTextFormatter`. An alternative to the `PasswordField`, the formatter that (un)masks `TextField` content based on boolean property.
- (CSS) Size style support: `TextField`, `Button`, `Slider`.
- (CSS) Rounded style support: `TextField`, `Button`.
- (CSS) Dense style support: `TabPane`, `TitledPane` / `Accordion`.
- (CSS) Alt icon tweak support: `TreeView`, `TitledPane` / `Accordion`.
- (CSS) Input group support: `Label`. `Label` graphic property can be used to add arbitrary node to the input group.
- (CSS) Utility classes for muted and subtle text style.
- (CSS) Utility classes for box elevation effect: `.elevated-[1-4]`.

### Improvements

- (Base) Setting top and bottom node for `DatePicker`. E.g. those can be a clock widget or event list.
- (CSS) 🚀 Nord light and dark themes rewamp with better color contrast and improved design.
- (CSS) Refactoring and improved control design: `Button`, `DatePicker`, `Slider`.
- (CSS) Looked-up color variables support: `Hyperlink`, `TextField`, `TextArea`, `ProgressBar`.
- (CSS) New global looked-up color variable `-color-shadow-default` for creating shadow effects.
- (CSS) Shadow effect for popup controls.

## [1.0.0] - 2022-09-06

Initial release.
