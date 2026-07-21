# Validación de Colores UI - Nord Recharged vs Nord Oficial

## Análisis Comparativo

### Colores Base - ✅ CORRECTO
Ambos usan la misma paleta Nord:
- nord0-nord15: Idénticos
- Coincidencia 100%

### Diferencias Detectadas

#### 1. **Backgrounds de Componentes**

**OFICIAL:**
- List.background: `#323846` (custom, no es nord0/nord1)
- Table.background: `#323846`
- Menu.background: `#323846`
- CompletionPopup.background: `#323846`

**NUESTRO:**
- List.background: `bgPrimary` = `#2E3440` (nord0)
- Table.background: `bgPrimary` = `#2E3440` (nord0)
- Menu.background: `bgSecondary` = `#3B4252` (nord1)
- CompletionPopup.background: `bgSecondary` = `#3B4252` (nord1)

**PROBLEMA:** El tema oficial usa `#323846` que NO es un color oficial de Nord (está entre nord0 `#2E3440` y nord1 `#3B4252`). Este color da un contraste más suave.

**RECOMENDACIÓN:** Agregar este color custom como `bgList` o `bgPopup`.

---

#### 2. **TextField y TextArea backgrounds**

**OFICIAL:**
- TextField.background: `#3b4252` (nord1)
- TextArea.background: `#3b4252` (nord1)

**NUESTRO:**
- TextField.background: `nord1` = `#3B4252` ✅
- TextArea.background: `nord1` = `#3B4252` ✅

**ESTADO:** ✅ CORRECTO

---

#### 3. **Button Default**

**OFICIAL:**
```json
"Button": {
  "default": {
    "foreground": "#2e3440",
    "startBackground": "#88c0d0",
    "endBackground": "#88c0d0"
  }
}
```

**NUESTRO:**
```json
"Button.default.background": "nord9",       // #81A1C1 ❌ INCORRECTO
"Button.default.foreground": "nord6",       // #ECEFF4 ❌ INCORRECTO
```

**PROBLEMA:** 
- Usamos nord9 (#81A1C1 azul claro) en vez de nord8 (#88C0D0 cyan)
- Usamos nord6 (#ECEFF4 blanco) en vez de nord0 (#2E3440 oscuro)

**RECOMENDACIÓN:** Cambiar a nord8 y nord0.

---

#### 4. **Selection Colors**

**OFICIAL:**
- selectionBackground: `#4c566a` (nord3)
- lightSelectionBackground: `#4c566a` (nord3)

**NUESTRO:**
- bgSelected: `nord3` = `#4C566A` ✅

**ESTADO:** ✅ CORRECTO

---

#### 5. **Tree Selection** ⚠️ IMPORTANTE

**OFICIAL:**
```json
"Tree": {
  "selectionBackground": "#88c0d0",  // CYAN BRILLANTE
  "selectionForeground": "#2e3440"   // TEXTO OSCURO
}
```

**NUESTRO:**
```json
"Tree.selectionBackground": "bgSelected",  // nord3 = #4C566A (gris)
"Tree.selectionForeground": "fgBright"     // nord6 = #ECEFF4 (blanco)
```

**PROBLEMA:** El tema oficial usa selección cyan brillante en Tree (project view), nosotros usamos gris oscuro.

**RECOMENDACIÓN:** Cambiar Tree.selectionBackground a nord8 (cyan).

---

#### 6. **ToolWindow Header**

**OFICIAL:**
```json
"ToolWindow": {
  "Header": {
    "background": "#4c566a",           // nord3
    "inactiveBackground": "#434c5e"    // nord2
  }
}
```

**NUESTRO:**
```json
"ToolWindow.Header.background": "bgSecondary",  // nord1 = #3B4252
```

**PROBLEMA:** Usamos nord1 en vez de nord3, menos contraste.

**RECOMENDACIÓN:** Cambiar a nord3.

---

#### 7. **EditorTabs**

**OFICIAL:**
```json
"EditorTabs": {
  "borderColor": "#2e3440",              // nord0
  "underlinedTabBackground": "#4c566a"   // nord3
}
```

**NUESTRO:**
```json
"EditorTabs.borderColor": "borderSecondary",     // nord2
"EditorTabs.selectedBackground": "nord1"         // nord1
```

**ESTADO:** Diferente enfoque, ambos válidos. Oficial tiene más contraste.

---

#### 8. **ScrollBar**

**OFICIAL:**
```json
"ScrollBar": {
  "thumbColor": "#434c5e",  // nord2
  "trackColor": "#2e3440"   // nord0
}
```

**NUESTRO:**
```json
"ScrollBar.thumbColor": "nord3",        // #4C566A ❌ MÁS CLARO
"ScrollBar.trackColor": "bgPrimary"     // #2E3440 ✅
```

**PROBLEMA:** Thumb más claro de lo debido.

**RECOMENDACIÓN:** Cambiar a nord2.

---

#### 9. **Popup/Menu backgrounds**

**OFICIAL:**
- Menu.background: `#323846` (custom entre nord0-nord1)
- PopupMenu.background: `#323846`

**NUESTRO:**
- Menu.background: `bgSecondary` = `#3B4252` (nord1)
- PopupMenu.background: `bgSecondary` = `#3B4252` (nord1)

**DIFERENCIA:** Oficial usa color intermedio custom, nosotros usamos nord1 puro.

---

#### 10. **ComboBox Selection**

**OFICIAL:**
```json
"ComboBox": {
  "selectionBackground": "#88c0d0",  // cyan brillante
  "selectionForeground": "#2e3440"   // oscuro
}
```

**NUESTRO:**
```json
"ComboBox.selectionBackground": "bgSelected",  // nord3 gris
```

**PROBLEMA:** Sin highlight brillante.

**RECOMENDACIÓN:** Cambiar a cyan como Tree.

---

## Resumen de Issues Críticos

### Alto Impacto (Cambiar)
1. ✅ **Button.default.background**: Cambiar de nord9 a nord8
2. ✅ **Button.default.foreground**: Cambiar de nord6 a nord0
3. ✅ **Tree.selectionBackground**: Cambiar de nord3 a nord8
4. ✅ **Tree.selectionForeground**: Cambiar de nord6 a nord0
5. ⚠️ **ScrollBar.thumbColor**: Cambiar de nord3 a nord2

### Medio Impacto (Considerar)
6. **Agregar color custom**: `#323846` para List/Table/Popup backgrounds
7. **ComboBox.selectionBackground**: Cambiar a cyan para consistencia
8. **ToolWindow.Header.background**: Cambiar de nord1 a nord3

### Bajo Impacto (Opcional)
9. EditorTabs - enfoque diferente, ambos válidos
10. Menu backgrounds - diferencia menor

---

## Cambios Recomendados

```json
// CRÍTICOS - APLICAR
"Button.default.background": "nord8",      // era nord9
"Button.default.foreground": "nord0",      // era nord6
"Tree.selectionBackground": "nord8",       // era nord3
"Tree.selectionForeground": "nord0",       // era nord6
"ScrollBar.thumbColor": "nord2",           // era nord3

// RECOMENDADOS - MEJORAR CONSISTENCIA
"bgPopup": "#323846",  // nuevo color custom
"List.background": "bgPopup",
"Table.background": "bgPopup",
"Menu.background": "bgPopup",
"PopupMenu.background": "bgPopup",
"CompletionPopup.background": "bgPopup",
"ToolWindow.Header.background": "nord3",   // era nord1
```

---

## Validación OneNord

Pendiente: Comparar OneNord Recharged con OneNord oficial de @rmehri01.
