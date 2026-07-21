# Contributing to Nord Recharged

First off, thank you for considering contributing to Nord Recharged! 🎨

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Development Setup](#development-setup)
- [Style Guidelines](#style-guidelines)
- [Commit Guidelines](#commit-guidelines)
- [Pull Request Process](#pull-request-process)

---

## Code of Conduct

This project follows a simple code of conduct: **Be respectful and constructive**.

- Use welcoming and inclusive language
- Be respectful of differing viewpoints
- Accept constructive criticism gracefully
- Focus on what is best for the community

---

## How Can I Contribute?

### 🐛 Reporting Bugs

Before creating bug reports, please check existing issues. When you create a bug report, include:

- **Clear title and description**
- **Steps to reproduce** the issue
- **Expected behavior** vs actual behavior
- **Screenshots** if applicable
- **Environment details:**
  - IntelliJ IDEA version
  - Plugin version
  - Operating System
  - Theme being used

**Example:**
```markdown
## Bug: Keywords not showing in bold

**Steps to reproduce:**
1. Install Nord Recharged Dark
2. Open a Java file
3. Keywords appear in correct color but not bold

**Expected:** Keywords should be blue AND bold
**Actual:** Keywords are only blue

**Environment:**
- IntelliJ IDEA 2024.1
- Nord Recharged 1.0.0
- Windows 11
```

### 💡 Suggesting Enhancements

Enhancement suggestions are welcome! Include:

- **Clear use case** - Why is this enhancement needed?
- **Detailed description** - What should it do?
- **Examples** - How would it look/work?

### 🎨 Adding New Themes

Want to add a new theme variant? Great! Please ensure:

1. It uses the Nord or OneNord color palette
2. It has both `.theme.json` (UI) and `.xml` (Editor Scheme)
3. Java syntax is fully configured (50+ attributes)
4. Documentation is included
5. Screenshots are provided

### 🌐 Improving Documentation

Documentation improvements are always appreciated:

- Fix typos
- Clarify confusing sections
- Add examples
- Translate to other languages (keep English as primary)

---

## Development Setup

### Prerequisites

- Java 17+
- IntelliJ IDEA (for testing)
- Git

### Setup Steps

```bash
# 1. Fork and clone
git clone https://github.com/yourusername/nord-recharged.git
cd nord-recharged

# 2. Build the plugin
./gradlew buildPlugin

# 3. The plugin will be in:
ls build/distributions/NordRecharged-1.0.0.zip

# 4. Install in IntelliJ for testing
# Settings → Plugins → Install from Disk → Select ZIP
```

### Project Structure

```
resources/
├── META-INF/
│   ├── plugin.xml          # Plugin metadata and theme declarations
│   └── pluginIcon.svg      # 40x40 SVG icon
├── theme/                  # UI themes
│   └── *.theme.json        # JSON defining UI colors
└── colors/                 # Editor color schemes
    └── *.xml               # XML defining syntax colors
```

### Building and Testing

```bash
# Clean build
./gradlew clean buildPlugin

# Verify XML syntax
xmllint --noout resources/colors/*.xml

# Check theme JSON validity
jq empty resources/theme/*.theme.json
```

---

## Style Guidelines

### XML Files (Editor Schemes)

```xml
<!-- Good: Descriptive comments and consistent indentation -->
<scheme name="Theme Name" version="142" parent_scheme="Darcula">
  <metaInfo>
    <property name="created">2024-07-20T16:30:00</property>
  </metaInfo>
  
  <colors>
    <!-- Clear comment explaining section -->
    <option name="CARET_ROW_COLOR" value="3b4252" />
  </colors>
  
  <attributes>
    <!-- Java Keywords -->
    <option name="JAVA_KEYWORD">
      <value>
        <option name="FOREGROUND" value="81a1c1" />
        <option name="FONT_TYPE" value="1" />
      </value>
    </option>
  </attributes>
</scheme>
```

### JSON Files (UI Themes)

```json
{
  "name": "Theme Name",
  "dark": true,
  "author": "Your Name",
  "editorScheme": "/colors/theme-name.xml",
  
  "colors": {
    "primaryColor": "#88C0D0"
  },
  
  "ui": {
    "*": {
      "background": "#2E3440",
      "foreground": "#D8DEE9"
    }
  }
}
```

### Color Values

- Always use **lowercase** hex values: `#81a1c1` not `#81A1C1`
- Use **6-digit** hex: `#2e3440` not `#2E3440` or `2e3440`
- Use official Nord colors when possible
- Document custom colors with comments

### File Naming

- Theme JSON: `kebab-case.theme.json`
- Editor XML: `kebab-case.xml`
- Documentation: `UPPER_SNAKE_CASE.md` or `Title_Case.md`

---

## Commit Guidelines

### Commit Message Format

```
<type>(<scope>): <subject>

<body>

<footer>
```

#### Types

- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding tests
- `chore`: Build process or auxiliary tool changes

#### Examples

```bash
# Good commits
git commit -m "feat(nord-dark): add bold to keywords for better readability"
git commit -m "fix(onenord-light): correct string color from #A3BE8C to #91C187"
git commit -m "docs(readme): add installation troubleshooting section"

# Bad commits
git commit -m "update stuff"
git commit -m "fix bug"
git commit -m "WIP"
```

---

## Pull Request Process

### Before Submitting

1. **Test thoroughly**
   - Build the plugin
   - Install in IntelliJ
   - Test all 4 themes
   - Verify colors in Java files

2. **Update documentation**
   - Update README if needed
   - Add/update relevant .md files
   - Include screenshots for visual changes

3. **Check your changes**
   - Run `./gradlew clean buildPlugin`
   - Verify no compilation errors
   - Test in both light and dark OS themes

### PR Template

```markdown
## Description
Brief description of what this PR does

## Type of Change
- [ ] Bug fix
- [ ] New feature
- [ ] Documentation update
- [ ] Theme improvement

## Testing
- [ ] Tested in IntelliJ IDEA 2023.3+
- [ ] Verified all 4 themes still work
- [ ] Checked Java syntax highlighting
- [ ] Screenshots attached (if visual change)

## Screenshots
[If applicable, add screenshots]

## Checklist
- [ ] Code follows project style guidelines
- [ ] Documentation updated
- [ ] Build passes (`./gradlew buildPlugin`)
- [ ] Commit messages follow guidelines
```

### Review Process

1. Maintainer will review your PR
2. Address any requested changes
3. Once approved, it will be merged
4. Your contribution will be credited in releases!

---

## Color Palette Reference

### Nord Palette

Always use these exact hex values:

**Polar Night:**
- nord0: `#2e3440`
- nord1: `#3b4252`
- nord2: `#434c5e`
- nord3: `#4c566a`

**Snow Storm:**
- nord4: `#d8dee9`
- nord5: `#e5e9f0`
- nord6: `#eceff4`

**Frost:**
- nord7: `#8fbcbb`
- nord8: `#88c0d0`
- nord9: `#81a1c1`
- nord10: `#5e81ac`

**Aurora:**
- nord11: `#bf616a`
- nord12: `#d08770`
- nord13: `#ebcb8b`
- nord14: `#a3be8c`
- nord15: `#b48ead`

### OneNord Palette

For OneNord themes, refer to:
- [OneNord Repository](https://github.com/rmehri01/onenord-jetbrains)
- `ONENORD_UPDATED.md` in this repo

---

## Questions?

- 💬 Open an [Issue](https://github.com/yourusername/nord-recharged/issues)
- 📧 Contact maintainers
- 📖 Check existing documentation

---

## Recognition

Contributors will be:
- Listed in CONTRIBUTORS.md
- Mentioned in release notes
- Credited in the plugin description (if significant contribution)

---

**Thank you for contributing to Nord Recharged!** 🎨❄️
