package com.example.android.mascotafeliz.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.android.mascotafeliz.R

private val  libreBaskerVile = FontFamily(
    Font(R.font.librebaskerville_bold, FontWeight.Normal),
    Font(R.font.librebaskerville_bold, FontWeight.Medium), 
    Font(R.font.youngserif_regular,FontWeight.ExtraLight)

)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = libreBaskerVile,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 48.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.4.sp

    ),

    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall =TextStyle(
        fontFamily = libreBaskerVile,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
                lineHeight = 22.sp,
        letterSpacing = 0.7.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)