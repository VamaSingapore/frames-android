package com.checkout.frames.style.component

public data class TextLabelStyle(
    val text: String,
    val textStyle: TextStyle,
    val leadingIconStyle: ImageStyle? = null,
    val trailingIconStyle: ImageStyle? = null,
    val containerStyle: ContainerStyle = ContainerStyle()
)
