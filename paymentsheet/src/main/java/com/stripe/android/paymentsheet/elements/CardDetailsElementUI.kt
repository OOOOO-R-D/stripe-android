package com.stripe.android.paymentsheet.elements

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun CardDetailsElementUI(
    enabled: Boolean,
    controller: CardController,
    hiddenIdentifiers: List<IdentifierSpec>?
) {
    controller.fields.forEachIndexed { index, field ->
        SectionFieldElementUI(enabled, field, hiddenIdentifiers)
        if (index != controller.fields.size - 1) {
            val cardStyle = CardStyle(isSystemInDarkTheme())
            Divider(
                color = cardStyle.cardBorderColor,
                thickness = cardStyle.cardBorderWidth,
                modifier = Modifier.padding(
                    horizontal = cardStyle.cardBorderWidth
                )
            )
        }
    }
}
