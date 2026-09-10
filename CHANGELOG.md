# Changelog

All notable changes to the Nord Recharged theme plugin will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.4.0] - 2026-09-10

### Added
- **VCS File Status Colors**: All four editor schemes now define the file-status text colors (added, modified, deleted, merged, unknown, ignored), so the Project View labels match each theme in light and dark mode

### Changed
- **WCAG AA Contrast Review (Light Themes)**: Every foreground color in Nord Recharged Light and OneNord Light Recharged now reaches at least 4.5:1 contrast against its effective background
  - Standard syntax (keywords, strings, numbers, classes, methods, parameters) minimally darkened while keeping the Nord hues
  - Line numbers, console output, inline parameter hints and file-status colors also included
  - Contrast audit now reports 0 failing foregrounds on both light schemes

### Fixed
- **README light color references**: The documented highlight hexes for both light themes were outdated and now match the shipped schemes

### Technical
- Version bumped to 1.4.0 for JetBrains Marketplace publication
- Compatible with IntelliJ IDEA 2023.3 - 2026.3 (build 233 - 263.*)

---

## [1.3.0] - 2026-09-09

### Added
- **Light Theme Caret Colors**: Both light themes now use a visible blue caret `#5589C9` for better cursor contrast in bright environments (works with IdeaVim block cursor)

### Changed
- **OneNord Light Complete Overhaul**: Full light-palette adaptation for genuine light theme rendering
  - Dark text `#3B4252` on light backgrounds `#ECEFF4` for optimal readability
  - All backgrounds converted to light tones (editor, gutters, popups, panels, selection)
  - OneNord identity colors darkened and saturated for light contrast (keywords `#8D5FB0`, classes `#B5822E`, instances `#BF3A47`, methods `#5589C9`)
  - Explicit XML/HTML syntax colors refreshed to match the light palette
  - Buttons, toggles, lists, tables and selection with dark-on-light contrast
  - Light icon color palette for consistent toolbar rendering

### Fixed
- **Generated Files & Folders Color**: The orange used to highlight generated/build folders in the Project View was clashing with each theme; now matches the theme palette
  - Added a proper `FileColor` palette to Nord Recharged Dark (previously inherited the default)
  - Pastel light tones for OneNord Light, muted dark tones for OneNord Dark and Nord Dark

### Technical
- Version bumped to 1.3.0 for JetBrains Marketplace publication
- Compatible with IntelliJ IDEA 2023.3 - 2026.3 (build 233 - 263.*)

---

## [1.2.0] - 2026-08-12

### Changed
- **XML/HTML Syntax Visibility (OneNord Light)**: Explicit XML and HTML syntax colors for maximum readability
  - Tag names: cyan `#88C0D0` bold — instant visual identification
  - Angle brackets: blue `#81A1C1` — clearly distinct from tag content
  - Attribute names: orange `#D08F70` — differentiated from tag names
  - Attribute values: green `#A3BE8C` — aligned with string color philosophy
  - Tag data (text content): bright `#ECEFF4` — high contrast against editor background
  - XML prologue: yellow `#EBCB8B` italic — clearly marks XML declarations

### Technical
- Compatible with IntelliJ IDEA 2023.3 - 2026.3 (build 233 - 263.*)

---

## [1.1.0] - 2026-08-12

### Added
- **Custom Plugin Icons**: New Nord-style 'R' logo icons (light and dark variants) for the JetBrains Marketplace

### Changed
- **Extended IDE Compatibility**: Updated until-build to 263 (IntelliJ 2026.3)
- **Nord Light Improvements**: Improved contrast and saturation for better readability in bright environments
- **OneNord Light Overhaul**: Applied official OneNord Light color palette by @rmehri01; refined keywords, backgrounds, and all syntax colors
- **OneNord Refactor**: Cleaned up and consolidated OneNord Dark and Light schemes

### Technical
- Marketplace publication preparation (plugin metadata and description polish)
- Removed emojis from plugin.xml for Marketplace compliance
- Compatible with IntelliJ IDEA 2023.3 - 2026.3 (build 233 - 263.*)

---

## [1.0.0] - 2026-07-20

### Added
- **4 Complete Themes**: Nord Recharged Dark, Nord Recharged Light, OneNord Dark Recharged, OneNord Light Recharged
- **Official Color Palettes**: 100% Nord official colors + OneNord official colors by @rmehri01
- **Full Islands UI Support**: Complete support for JetBrains' modern Islands UI
- **Comprehensive Java Syntax**: Full Java language support with optimized colors (JAVA_* attributes for Nord themes; DEFAULT_* for OneNord themes)
- **Bold Keywords & Italic Comments**: Enhanced readability for long coding sessions
- **Multiple Language Support**: Java, Kotlin, Python, JavaScript, TypeScript, and more

### Features
- **Nord Recharged Themes**: Pure Nord palette with minimalist aesthetic
  - Keywords in bold blue (#81A1C1) for better visibility
  - Comments in italic gray for clear distinction
  - Cyan tree selections (#88C0D0) for better highlighting
  - Subtle blue accent on ToolWindow headers (#4C5A6E)

- **OneNord Recharged Themes**: One Dark/Light style with Nord colors
  - Purple keywords (#B589D3) like One Dark
  - Yellow classes (#EBCB8B) for instant recognition
  - Red variables (#D57780) for better distinction
  - Blue methods (#81A1C1)
  - More colorful and vibrant than pure Nord

- **UI Enhancements**:
  - Custom popup background color (#323846) for better separation
  - Corrected button colors matching official themes
  - Improved scrollbar contrast
  - Consistent selection colors across all components
  - ToolWindow headers with subtle blue accent for visual identity

### Technical
- Compatible with IntelliJ IDEA 2023.3 - 2026.3 (build 233 - 263.*)
- Built with Gradle 8.5 and Java 17
- Supports all JetBrains IDEs (IntelliJ IDEA, PyCharm, WebStorm, PhpStorm, etc.)

### Credits
- Nord color palette: Arctic Ice Studio & Sven Greb
- OneNord color palette: Ryan Mehri (@rmehri01)
- Inspired by Nord JetBrains and OneNord JetBrains themes

## [Unreleased]

### Planned
- Additional language support enhancements
- Community feedback integration
- Potential new theme variants based on user requests

---

[1.4.0]: https://github.com/angelf015/NordRecharged/releases/tag/v1.4.0
[1.3.0]: https://github.com/angelf015/NordRecharged/releases/tag/v1.3.0
[1.2.0]: https://github.com/angelf015/NordRecharged/releases/tag/v1.2.0
[1.1.0]: https://github.com/angelf015/NordRecharged/releases/tag/v1.1.0
[1.0.0]: https://github.com/angelf015/NordRecharged/releases/tag/v1.0.0
