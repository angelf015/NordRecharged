<div align="center">

# 🎨 Nord Recharged

### Beautiful Arctic-inspired color themes for IntelliJ IDEA

[![Version](https://img.shields.io/badge/version-1.0.0-88C0D0.svg?style=flat-square)](https://github.com/yourusername/nord-recharged/releases)
[![IntelliJ](https://img.shields.io/badge/IntelliJ-2023.3+-81A1C1.svg?style=flat-square)](https://www.jetbrains.com/idea/)
[![License](https://img.shields.io/badge/license-MIT-A3BE8C.svg?style=flat-square)](LICENSE)

*Four carefully crafted themes combining the elegance of Nord with the familiarity of One Dark*

[Features](#-features) • [Installation](#-installation) • [Themes](#-themes) • [Screenshots](#-screenshots) • [Contributing](#-contributing)

</div>

---

## ✨ Features

- 🎨 **4 Complete Themes** - Dark & Light variants for both Nord and OneNord styles
- 🎯 **100% Official Palettes** - Nord official colors + OneNord official colors
- ⚡ **Islands UI Compatible** - Modern JetBrains UI support
- ☕ **Java Optimized** - 50+ Java-specific syntax attributes configured
- 🔧 **Kotlin, Python, JavaScript** - Full support for multiple languages
- 👁️ **Eye-Friendly** - Designed for long coding sessions with optimal contrast
- 🚀 **Actively Maintained** - Regular updates and improvements

---

## 🎨 Themes

### Nord Recharged Dark
> Pure Nord palette with enhanced readability

**Perfect for:** Fans of the original Nord theme, minimalist aesthetics
- Keywords: Bold blue for better visibility
- Comments: Italic gray for clear distinction
- Based on official Nord JetBrains theme

### Nord Recharged Light
> Inverted Nord palette for bright environments

**Perfect for:** Well-lit rooms, daytime coding
- Same color philosophy as Dark
- Optimized contrast for light backgrounds
- Easy on the eyes in bright conditions

### OneNord Dark Recharged
> Nord colors with One Dark distribution

**Perfect for:** Atom/VS Code One Dark users, more colorful syntax
- Purple keywords like One Dark
- Yellow classes for better distinction
- Red variables for instant recognition
- Official OneNord palette by @rmehri01

### OneNord Light Recharged
> One Light style with Nord palette

**Perfect for:** One Light fans, vibrant light theme lovers
- Bright, saturated colors
- Excellent contrast on light backgrounds
- Official OneNord Light palette

---

## 📸 Screenshots

### Nord Recharged Dark
```java
// Clean and minimalist Nord aesthetic
public class UserService {
    private static final int MAX_USERS = 100;
    private String name = "Nord Theme";
    
    @Override
    public void findById(int id) {
        // Keywords in blue, classes in cyan
        List<User> users = new ArrayList<>();
        int count = 42;  // Numbers in purple
    }
}
```

**Color Highlights:**
- `public`, `class`, `void` → **Blue** `#81A1C1` (Bold)
- `UserService`, `String`, `List` → **Cyan/Turquoise** `#8FBCBB`
- `findById`, `ArrayList` → **Cyan** `#88C0D0`
- `"Nord Theme"` → **Green** `#A3BE8C`
- `100`, `42` → **Purple** `#B48EAD`
- `// comments` → **Gray** `#616E88` (Italic)

### OneNord Dark Recharged
```java
// More colorful, One Dark inspired
public class UserService {
    private String name = "OneNord";  // name in red!
    
    public void process(int value) {
        // Keywords in purple, methods in blue
    }
}
```

**Color Highlights:**
- `public`, `class` → **Purple** `#B589D3` (Bold)
- `UserService`, `String` → **Yellow** `#EBCB8B`
- `process` → **Blue** `#81A1C1`
- `name`, instance fields → **Red** `#D57780`
- `value`, parameters → **Orange** `#D08F70`

---

## 🚀 Installation

### Method 1: From Releases (Recommended)

1. Download `NordRecharged-1.0.0.zip` from [Releases](https://github.com/yourusername/nord-recharged/releases)
2. Open IntelliJ IDEA
3. **Settings** (`Ctrl+Alt+S` / `Cmd+,`) → **Plugins**
4. Click ⚙️ → **Install Plugin from Disk...**
5. Select the downloaded ZIP file
6. **Restart IDE**
7. **Settings** → **Appearance & Behavior** → **Appearance** → **Theme**
8. Select your preferred theme

### Method 2: Build from Source

```bash
# Clone the repository
git clone https://github.com/yourusername/nord-recharged.git
cd nord-recharged

# Build the plugin
./gradlew buildPlugin

# The plugin will be in:
# build/distributions/NordRecharged-1.0.0.zip
```

Then follow steps 2-8 from Method 1.

---

## 🎯 Theme Comparison

| Feature | Nord Recharged | OneNord Recharged |
|---------|----------------|-------------------|
| **Philosophy** | Pure Nord, minimalist | One Dark + Nord fusion |
| **Keywords** | Blue `#81A1C1` | Purple `#B589D3` |
| **Classes** | Cyan `#8FBCBB` | Yellow `#EBCB8B` |
| **Variables** | Default text | Red `#D57780` |
| **Best For** | Nord purists | One Dark users |
| **Feeling** | Calm, focused | Vibrant, expressive |

---

## 🎨 Color Palette

### Nord Dark Theme

| Element | Color | Hex | Preview |
|---------|-------|-----|---------|
| Keywords | Blue | `#81A1C1` | ![](https://via.placeholder.com/20/81A1C1/81A1C1.png) |
| Strings | Green | `#A3BE8C` | ![](https://via.placeholder.com/20/A3BE8C/A3BE8C.png) |
| Numbers | Purple | `#B48EAD` | ![](https://via.placeholder.com/20/B48EAD/B48EAD.png) |
| Classes | Cyan/Turquoise | `#8FBCBB` | ![](https://via.placeholder.com/20/8FBCBB/8FBCBB.png) |
| Methods | Cyan | `#88C0D0` | ![](https://via.placeholder.com/20/88C0D0/88C0D0.png) |
| Comments | Gray | `#616E88` | ![](https://via.placeholder.com/20/616E88/616E88.png) |
| Annotations | Orange | `#D08770` | ![](https://via.placeholder.com/20/D08770/D08770.png) |

### OneNord Dark Theme

| Element | Color | Hex | Preview |
|---------|-------|-----|---------|
| Keywords | Purple | `#B589D3` | ![](https://via.placeholder.com/20/B589D3/B589D3.png) |
| Strings | Green | `#91C187` | ![](https://via.placeholder.com/20/91C187/91C187.png) |
| Numbers | Orange | `#D08F70` | ![](https://via.placeholder.com/20/D08F70/D08F70.png) |
| Classes | Yellow | `#EBCB8B` | ![](https://via.placeholder.com/20/EBCB8B/EBCB8B.png) |
| Methods | Blue | `#81A1C1` | ![](https://via.placeholder.com/20/81A1C1/81A1C1.png) |
| Variables | Red | `#D57780` | ![](https://via.placeholder.com/20/D57780/D57780.png) |
| Comments | Gray | `#6C7A96` | ![](https://via.placeholder.com/20/6C7A96/6C7A96.png) |

---

## 📚 Documentation

| File | Description |
|------|-------------|
| [INSTALLATION_GUIDE.md](INSTALLATION_GUIDE.md) | Complete installation guide with troubleshooting |
| [VISUAL_EXAMPLE.md](VISUAL_EXAMPLE.md) | Detailed code examples showing all colors |
| [JAVA_COLORS.md](JAVA_COLORS.md) | 50+ Java syntax attributes configured |
| [THEME_GUIDE.md](THEME_GUIDE.md) | Theme implementation guide |
| [ALL_THEMES_UPDATED.md](ALL_THEMES_UPDATED.md) | Latest updates and changes |
| [ONENORD_UPDATED.md](ONENORD_UPDATED.md) | OneNord official palette info |

---

## 🛠️ Compatibility

- **IntelliJ IDEA:** 2023.3+ (Ultimate & Community)
- **Build Range:** 233 - 999.*
- **Other JetBrains IDEs:** PyCharm, WebStorm, PhpStorm, etc.
- **Java Version:** 17+ (for building from source)

---

## 🤝 Contributing

Contributions are welcome! Here's how:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

### Development Setup

```bash
# Clone your fork
git clone https://github.com/yourusername/nord-recharged.git

# Build and test
./gradlew buildPlugin

# Test in IntelliJ
# The plugin will be in build/distributions/
```

---

## 🐛 Troubleshooting

### Colors not applying?

1. Verify plugin is installed: **Settings** → **Plugins** → Search "Nord Recharged"
2. Check theme is selected: **Settings** → **Appearance** → **Theme**
3. Try: **File** → **Invalidate Caches** → **Restart**

### Only UI colors show, no syntax highlighting?

1. Check **Settings** → **Editor** → **Color Scheme**
2. Should be set to the same theme as UI theme
3. Rebuild plugin: `./gradlew clean buildPlugin`

### Theme appears but everything is gray?

1. Reinstall the plugin
2. Restart IntelliJ IDEA
3. Check [INSTALLATION_GUIDE.md](INSTALLATION_GUIDE.md) for detailed steps

---

## 📦 Project Structure

```
NordRecharged/
├── resources/
│   ├── META-INF/
│   │   ├── plugin.xml          # Plugin configuration
│   │   └── pluginIcon.svg      # Plugin icon
│   ├── theme/                  # UI themes (.theme.json)
│   │   ├── nord-recharged-dark.theme.json
│   │   ├── nord-recharged-light.theme.json
│   │   ├── onenord-dark-recharged.theme.json
│   │   └── onenord-light-recharged.theme.json
│   └── colors/                 # Editor schemes (.xml)
│       ├── nord-recharged-dark.xml
│       ├── nord-recharged-light.xml
│       ├── onenord-dark-recharged.xml
│       └── onenord-light-recharged.xml
├── build.gradle.kts            # Build configuration
└── [Documentation files]
```

---

## 🔗 Credits & Resources

- **Nord Palette:** [Arctic Ice Studio](https://www.nordtheme.com) & [Sven Greb](https://github.com/arcticicestudio/nord)
- **OneNord:** [Ryan Mehri](https://github.com/rmehri01/onenord-jetbrains)
- **One Dark:** [Atom Editor](https://github.com/atom/one-dark-syntax)
- **IntelliJ Platform SDK:** [JetBrains](https://plugins.jetbrains.com/docs/intellij/)

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

The Nord color palette is created by [Arctic Ice Studio](https://www.nordtheme.com) and is licensed under the MIT License.

---

## 🌟 Show Your Support

If you like Nord Recharged, please:

- ⭐ **Star** this repository
- 🐛 **Report** bugs or request features via [Issues](https://github.com/yourusername/nord-recharged/issues)
- 🔀 **Fork** and contribute improvements
- 📢 **Share** with other Nord theme lovers!

---

## 📊 Project Stats

![Version](https://img.shields.io/badge/version-1.0.0-88C0D0.svg?style=flat-square)
![Themes](https://img.shields.io/badge/themes-4-81A1C1.svg?style=flat-square)
![Java Support](https://img.shields.io/badge/Java-50%2B%20attributes-A3BE8C.svg?style=flat-square)
![IntelliJ](https://img.shields.io/badge/IntelliJ-2023.3%2B-B48EAD.svg?style=flat-square)
![Build](https://img.shields.io/badge/build-passing-A3BE8C.svg?style=flat-square)

---

<div align="center">

**Made with ❄️ and ☕ by the Nord Recharged Team**

*Nord Recharged - Where Arctic elegance meets modern development*

</div>
