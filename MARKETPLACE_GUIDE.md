# 📦 Guía de Publicación en JetBrains Marketplace

## Pasos para Publicar Nord Recharged v1.0.0

### ✅ Prerequisitos Completados
- [x] Plugin compilado: `build/distributions/NordRecharged-1.0.0.zip`
- [x] plugin.xml con descripción completa
- [x] CHANGELOG.md creado
- [x] README.md profesional
- [x] LICENSE (MIT)
- [x] Repositorio GitHub público

---

## 📋 Paso 1: Crear Cuenta en JetBrains

1. **Ir a:** https://plugins.jetbrains.com
2. **Click en:** "Sign In" (arriba derecha)
3. **Opciones de registro:**
   - JetBrains Account (recomendado)
   - GitHub
   - Google
   - Otros
4. **Completar** el proceso de verificación de email

---

## 🏢 Paso 2: Crear Vendor Profile

Después de iniciar sesión:

1. **Click en tu avatar** (arriba derecha)
2. **Select:** "Vendor Profile" o "Upload Plugin"
3. **Completar información del vendor:**
   ```
   Vendor Name: Nord Recharged Team
   Email: angelf015@gmail.com (ya está en plugin.xml)
   Website: https://github.com/angelf015/NordRecharged
   ```
4. **Agregar descripción del vendor** (opcional):
   ```
   Creating beautiful, Arctic-inspired themes for JetBrains IDEs.
   Based on the official Nord color palette.
   ```

---

## 📤 Paso 3: Upload Plugin

### 3.1 Navegar a Upload
1. **Click:** "Upload Plugin" (botón verde)
2. **O ir a:** https://plugins.jetbrains.com/plugin/add

### 3.2 Información Básica

**Plugin Name:**
```
Nord Recharged
```

**Plugin ID:**
```
com.nordrecharged.themes
```
*(Ya está definido en plugin.xml, se auto-detecta)*

**Category:**
```
UI → Themes
```

**License:**
```
MIT License
```

**License URL:**
```
https://github.com/angelf015/NordRecharged/blob/main/LICENSE
```

---

### 3.3 Upload del Archivo

1. **Click:** "Choose File" o drag & drop
2. **Seleccionar:** `/home/langel/IdeaProjects/NordRecharged/build/distributions/NordRecharged-1.0.0.zip`
3. **Esperar** la validación automática
4. **Verificar** que no hay errores

**Validaciones Automáticas:**
- ✅ plugin.xml válido
- ✅ Estructura correcta
- ✅ ID único
- ✅ Compatibilidad definida (233+)

---

### 3.4 Descripción y Detalles

**Short Description (hasta 255 caracteres):**
```
Four beautiful Arctic-inspired themes for IntelliJ IDEs. Pure Nord & OneNord variants with enhanced readability, Islands UI support, and 50+ Java syntax attributes.
```

**Full Description:**
*(Ya está en plugin.xml, se importa automáticamente)*

**Tags/Keywords (separados por comas):**
```
nord, theme, dark theme, light theme, color scheme, arctic, one dark, onenord, ui theme, syntax highlighting, islands ui
```

**Screenshots (Opcional pero ALTAMENTE RECOMENDADO):**
- Captura 1: Nord Recharged Dark - Editor con código Java
- Captura 2: Nord Recharged Light - Editor con código
- Captura 3: OneNord Dark - Mostrando Project view
- Captura 4: Comparación de 4 temas lado a lado

*Formato recomendado: PNG, 1280x720 o similar*

---

### 3.5 Links y Documentación

**Source Code Repository:**
```
https://github.com/angelf015/NordRecharged
```

**Issue Tracker:**
```
https://github.com/angelf015/NordRecharged/issues
```

**Documentation:**
```
https://github.com/angelf015/NordRecharged#readme
```

**Change Notes:**
*(Ya están en plugin.xml, se importan automáticamente)*

---

## 🎯 Paso 4: Pricing (Gratuito)

1. **Select:** "Free"
2. No es necesario configurar nada más

---

## 🚀 Paso 5: Submit for Approval

### 5.1 Review Final
Antes de enviar, verificar:
- [ ] Nombre correcto: "Nord Recharged"
- [ ] Descripción clara y atractiva
- [ ] Screenshots subidos (si los tienes)
- [ ] Tags/keywords apropiados
- [ ] Links a GitHub funcionando
- [ ] Email de contacto correcto
- [ ] Categoría: UI → Themes

### 5.2 Submit
1. **Click:** "Submit" o "Publish Plugin"
2. **Aceptar** términos y condiciones
3. **Confirmar** envío

---

## ⏳ Paso 6: Proceso de Aprobación

### Qué Esperar:
- **Tiempo de revisión:** 1-3 días hábiles (usualmente 24-48 horas)
- **Revisión manual:** JetBrains revisa el plugin
- **Verificaciones:**
  - No malware
  - Funcionalidad correcta
  - Cumple guidelines
  - Descripción apropiada

### Estados Posibles:
1. **Pending Review** - Esperando revisión
2. **In Review** - Siendo revisado
3. **Approved** - ✅ Aprobado y publicado
4. **Rejected** - Requiere cambios (recibirás email con detalles)

### Si es Rechazado:
- Leer cuidadosamente el email de feedback
- Hacer los cambios requeridos
- Re-upload nueva versión
- Re-submit

---

## 📧 Paso 7: Post-Aprobación

### Después de la Aprobación:
1. **Recibirás email** de confirmación
2. **Plugin visible** en: https://plugins.jetbrains.com/plugin/XXXXX-nord-recharged
3. **Disponible** para instalación en todas las IDEs JetBrains

### Promover el Plugin:
1. **Actualizar README.md** con badge del Marketplace:
   ```markdown
   [![JetBrains Plugins](https://img.shields.io/jetbrains/plugin/v/XXXXX-nord-recharged.svg)](https://plugins.jetbrains.com/plugin/XXXXX-nord-recharged)
   [![Downloads](https://img.shields.io/jetbrains/plugin/d/XXXXX-nord-recharged.svg)](https://plugins.jetbrains.com/plugin/XXXXX-nord-recharged)
   ```

2. **Anunciar en:**
   - GitHub Releases
   - README.md
   - Redes sociales (si aplica)
   - Foros de desarrollo (Reddit r/jetbrains, etc.)

3. **Responder a reviews** y feedback de usuarios

---

## 📊 Monitoreo Post-Publicación

### Dashboard del Plugin:
Acceso en: https://plugins.jetbrains.com/author/me

**Métricas disponibles:**
- 📈 Descargas totales
- 📊 Descargas por versión
- ⭐ Ratings y reviews
- 🌍 Distribución geográfica
- 📅 Tendencias temporales

### Actualizaciones Futuras:
1. Incrementar versión en `plugin.xml`
2. Actualizar `CHANGELOG.md`
3. Rebuild: `./gradlew buildPlugin`
4. Upload nueva versión en Marketplace
5. Usuarios recibirán notificación de actualización

---

## 🎨 Tips para Mejor Visibilidad

### Screenshots Recomendados:
1. **Hero shot** - Editor completo con tema dark mostrando código atractivo
2. **UI Elements** - Mostrando Project view, ToolWindows con header azul
3. **Light vs Dark** - Comparación lado a lado
4. **Syntax Highlighting** - Zoom en código mostrando colores

### Formato Ideal de Screenshots:
- **Resolución:** 1920x1080 o 1280x720
- **Formato:** PNG (mejor calidad) o JPG
- **Contenido:** Código real, no Lorem Ipsum
- **UI limpio:** Sin información personal, clutter mínimo

### Descripción Efectiva:
- ✅ Bullet points claros
- ✅ Mencionar características únicas (blue headers, cyan selections)
- ✅ Keywords importantes en bold
- ✅ Links a documentación
- ✅ Comparación con temas similares
- ✅ GIFs animados si es posible (opcional)

---

## 🔍 Checklist Final Pre-Publicación

- [ ] Plugin compila sin errores
- [ ] Probado en IntelliJ IDEA local
- [ ] Los 4 temas funcionan correctamente
- [ ] plugin.xml con descripción completa
- [ ] Email de contacto correcto
- [ ] GitHub repository público
- [ ] LICENSE file presente
- [ ] README.md profesional
- [ ] CHANGELOG.md actualizado
- [ ] Screenshots preparados (opcional pero recomendado)
- [ ] Tags/keywords pensados
- [ ] Cuenta JetBrains creada

---

## 📞 Soporte

**Si tienes problemas durante la publicación:**
- 📧 Email: plugins@jetbrains.com
- 💬 Support: https://intellij-support.jetbrains.com/
- 📖 Docs: https://plugins.jetbrains.com/docs/marketplace/

**Guías Oficiales:**
- https://plugins.jetbrains.com/docs/marketplace/uploading-a-new-plugin.html
- https://plugins.jetbrains.com/docs/marketplace/plugin-overview-page.html

---

## 🎉 ¡Listo para Publicar!

**Archivo listo:** `/home/langel/IdeaProjects/NordRecharged/build/distributions/NordRecharged-1.0.0.zip`

**Próximos pasos:**
1. Ir a https://plugins.jetbrains.com
2. Sign in / Create account
3. Upload plugin
4. Fill description (pre-llenado desde plugin.xml)
5. Add screenshots (recomendado)
6. Submit
7. Esperar aprobación (1-3 días)
8. ¡Celebrar! 🎊

---

**¿Necesitas ayuda con screenshots o más ajustes antes de publicar?**
