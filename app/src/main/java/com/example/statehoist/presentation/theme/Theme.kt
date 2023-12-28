package com.example.statehoist.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.android.roomdbtest.presentation.ui.theme.theme.Purple200
import com.android.roomdbtest.presentation.ui.theme.theme.Purple500
import com.android.roomdbtest.presentation.ui.theme.theme.Purple700
import com.android.roomdbtest.presentation.ui.theme.theme.Teal200

private val DarkColorPalette = darkColors(
        primary = Purple200,
        primaryVariant = Purple700,
        secondary = Teal200
    )


)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun RoomDbTestTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}