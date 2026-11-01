package com.reelspot.app.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// ==========================================
// Warm Wanderlust Design Tokens
// ==========================================

// Primary Palette (Sunset Terracotta)
val PrimaryTerracotta = Color(0xFFA83223)
val PrimaryTerracottaContainer = Color(0xFFC94A38)
val OnPrimaryTerracotta = Color(0xFFFFFFFF)
val OnPrimaryTerracottaContainer = Color(0xFFFFFBFF)
val PrimaryTerracottaFixed = Color(0xFFFFDAD4)
val PrimaryTerracottaFixedDim = Color(0xFFFFB4A8)
val OnPrimaryTerracottaFixed = Color(0xFF410100)
val OnPrimaryTerracottaFixedVariant = Color(0xFF8A1C10)

// Secondary Palette (Botanical Sage)
val SecondarySage = Color(0xFF376847)
val SecondarySageContainer = Color(0xFFB6EDC2)
val OnSecondarySage = Color(0xFFFFFFFF)
val OnSecondarySageContainer = Color(0xFF3B6D4B)
val SecondarySageFixed = Color(0xFFB9EFC5)
val SecondarySageFixedDim = Color(0xFF9DD3AA)
val OnSecondarySageFixed = Color(0xFF00210E)
val OnSecondarySageFixedVariant = Color(0xFF1E5031)

// Tertiary Palette (Forest Slate)
val TertiaryForest = Color(0xFF3F6355)
val TertiaryForestContainer = Color(0xFF587C6D)
val OnTertiaryForest = Color(0xFFFFFFFF)
val OnTertiaryForestContainer = Color(0xFFF5FFF8)
val TertiaryForestFixed = Color(0xFFC4EBD9)
val TertiaryForestFixedDim = Color(0xFFA8CFBD)
val OnTertiaryForestFixed = Color(0xFF002116)
val OnTertiaryForestFixedVariant = Color(0xFF2A4D40)

// Surface & Neutral Canvas (Light)
val SurfaceWarm = Color(0xFFFAF9FB)
val SurfaceDimWarm = Color(0xFFDBD9DC)
val SurfaceBrightWarm = Color(0xFFFAF9FB)
val SurfaceContainerLowestWarm = Color(0xFFFFFFFF)
val SurfaceContainerLowWarm = Color(0xFFF5F3F5)
val SurfaceContainerWarm = Color(0xFFEFEDF0)
val SurfaceContainerHighWarm = Color(0xFFE9E8EA)
val SurfaceContainerHighestWarm = Color(0xFFE3E2E4)

val OnSurfaceWarm = Color(0xFF1B1C1E)
val OnSurfaceVariantWarm = Color(0xFF58413D)
val OutlineWarm = Color(0xFF8C716C)
val OutlineVariantWarm = Color(0xFFE0BFBA)

// Error Colors
val ErrorRed = Color(0xFFBA1A1A)
val OnError = Color(0xFFFFFFFF)
val ErrorContainerRed = Color(0xFFFFDAD6)
val OnErrorContainerRed = Color(0xFF93000A)

// Dark Palette Tokens
val DarkBackgroundSlate = Color(0xFF121316)
val DarkSurfaceContainerLowest = Color(0xFF0D0E10)
val DarkSurfaceContainerLow = Color(0xFF17181C)
val DarkSurfaceContainer = Color(0xFF1B1C20)
val DarkSurfaceContainerHigh = Color(0xFF25272C)
val DarkSurfaceContainerHighest = Color(0xFF303238)

val DarkPrimaryTerracotta = Color(0xFFFF6B55)
val DarkOnPrimaryTerracotta = Color(0xFF5E002A)
val DarkPrimaryTerracottaContainer = Color(0xFF83003E)
val DarkSecondarySage = Color(0xFF7DA88D)
val DarkOnSecondarySage = Color(0xFF00391B)
val DarkSecondarySageContainer = Color(0xFF1E5031)

val DarkOnSurface = Color(0xFFF5F5F7)
val DarkOnSurfaceVariant = Color(0xFFA8A6A1)
val DarkOutline = Color(0xFF8C716C)
val DarkOutlineVariant = Color(0xFF49454F)

@Immutable
data class ExtendedColors(
    val surfaceContainerLowest: Color,
    val surfaceContainerLow: Color,
    val surfaceContainer: Color,
    val surfaceContainerHigh: Color,
    val surfaceContainerHighest: Color,
    val primaryFixed: Color,
    val primaryFixedDim: Color,
    val onPrimaryFixed: Color,
    val onPrimaryFixedVariant: Color,
    val secondaryFixed: Color,
    val secondaryFixedDim: Color,
    val onSecondaryFixed: Color,
    val onSecondaryFixedVariant: Color,
    val tertiaryFixed: Color,
    val onTertiaryFixedVariant: Color
)

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        surfaceContainerLowest = SurfaceContainerLowestWarm,
        surfaceContainerLow = SurfaceContainerLowWarm,
        surfaceContainer = SurfaceContainerWarm,
        surfaceContainerHigh = SurfaceContainerHighWarm,
        surfaceContainerHighest = SurfaceContainerHighestWarm,
        primaryFixed = PrimaryTerracottaFixed,
        primaryFixedDim = PrimaryTerracottaFixedDim,
        onPrimaryFixed = OnPrimaryTerracottaFixed,
        onPrimaryFixedVariant = OnPrimaryTerracottaFixedVariant,
        secondaryFixed = SecondarySageFixed,
        secondaryFixedDim = SecondarySageFixedDim,
        onSecondaryFixed = OnSecondarySageFixed,
        onSecondaryFixedVariant = OnSecondarySageFixedVariant,
        tertiaryFixed = TertiaryForestFixed,
        onTertiaryFixedVariant = OnTertiaryForestFixedVariant
    )
}

val LightExtendedColors = ExtendedColors(
    surfaceContainerLowest = SurfaceContainerLowestWarm,
    surfaceContainerLow = SurfaceContainerLowWarm,
    surfaceContainer = SurfaceContainerWarm,
    surfaceContainerHigh = SurfaceContainerHighWarm,
    surfaceContainerHighest = SurfaceContainerHighestWarm,
    primaryFixed = PrimaryTerracottaFixed,
    primaryFixedDim = PrimaryTerracottaFixedDim,
    onPrimaryFixed = OnPrimaryTerracottaFixed,
    onPrimaryFixedVariant = OnPrimaryTerracottaFixedVariant,
    secondaryFixed = SecondarySageFixed,
    secondaryFixedDim = SecondarySageFixedDim,
    onSecondaryFixed = OnSecondarySageFixed,
    onSecondaryFixedVariant = OnSecondarySageFixedVariant,
    tertiaryFixed = TertiaryForestFixed,
    onTertiaryFixedVariant = OnTertiaryForestFixedVariant
)

val DarkExtendedColors = ExtendedColors(
    surfaceContainerLowest = DarkSurfaceContainerLowest,
    surfaceContainerLow = DarkSurfaceContainerLow,
    surfaceContainer = DarkSurfaceContainer,
    surfaceContainerHigh = DarkSurfaceContainerHigh,
    surfaceContainerHighest = DarkSurfaceContainerHighest,
    primaryFixed = Color(0xFF410100),
    primaryFixedDim = Color(0xFF8A1C10),
    onPrimaryFixed = Color(0xFFFFDAD4),
    onPrimaryFixedVariant = Color(0xFFFFB4A8),
    secondaryFixed = Color(0xFF00210E),
    secondaryFixedDim = Color(0xFF1E5031),
    onSecondaryFixed = Color(0xFFB9EFC5),
    onSecondaryFixedVariant = Color(0xFF9DD3AA),
    tertiaryFixed = Color(0xFF002116),
    onTertiaryFixedVariant = Color(0xFFC4EBD9)
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryTerracotta,
    onPrimary = OnPrimaryTerracotta,
    primaryContainer = PrimaryTerracottaContainer,
    onPrimaryContainer = OnPrimaryTerracottaContainer,
    inversePrimary = PrimaryTerracottaFixedDim,
    secondary = SecondarySage,
    onSecondary = OnSecondarySage,
    secondaryContainer = SecondarySageContainer,
    onSecondaryContainer = OnSecondarySageContainer,
    tertiary = TertiaryForest,
    onTertiary = OnTertiaryForest,
    tertiaryContainer = TertiaryForestContainer,
    onTertiaryContainer = OnTertiaryForestContainer,
    background = SurfaceWarm,
    onBackground = OnSurfaceWarm,
    surface = SurfaceWarm,
    onSurface = OnSurfaceWarm,
    surfaceVariant = SurfaceContainerHighestWarm,
    onSurfaceVariant = OnSurfaceVariantWarm,
    outline = OutlineWarm,
    outlineVariant = OutlineVariantWarm,
    error = ErrorRed,
    onError = OnError,
    errorContainer = ErrorContainerRed,
    onErrorContainer = OnErrorContainerRed
)

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimaryTerracotta,
    onPrimary = DarkOnPrimaryTerracotta,
    primaryContainer = DarkPrimaryTerracottaContainer,
    onPrimaryContainer = Color(0xFFFFD9E2),
    inversePrimary = PrimaryTerracotta,
    secondary = DarkSecondarySage,
    onSecondary = DarkOnSecondarySage,
    secondaryContainer = DarkSecondarySageContainer,
    onSecondaryContainer = Color(0xFFB6EDC2),
    tertiary = TertiaryForestFixedDim,
    onTertiary = Color(0xFF002116),
    tertiaryContainer = TertiaryForestContainer,
    onTertiaryContainer = OnTertiaryForestContainer,
    background = DarkBackgroundSlate,
    onBackground = DarkOnSurface,
    surface = DarkSurfaceContainer,
    onSurface = DarkOnSurface,
    surfaceVariant = DarkSurfaceContainerHighest,
    onSurfaceVariant = DarkOnSurfaceVariant,
    outline = DarkOutline,
    outlineVariant = DarkOutlineVariant,
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6)
)

val MaterialTheme.extendedColors: ExtendedColors
    @Composable
    get() = LocalExtendedColors.current

@Composable
fun ReelspotTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val extendedColors = if (darkTheme) DarkExtendedColors else LightExtendedColors

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.surface.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    CompositionLocalProvider(LocalExtendedColors provides extendedColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}
