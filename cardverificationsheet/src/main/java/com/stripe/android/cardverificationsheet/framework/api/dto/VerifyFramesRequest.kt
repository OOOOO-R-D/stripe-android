package com.stripe.android.cardverificationsheet.framework.api.dto

import android.graphics.Rect
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class VerificationFrameData(
    @SerialName("image_data") val imageData: String,
    @SerialName("view_finder_margins") val viewFinderMargins: ViewFinderMargins,
)

@Serializable
internal data class ViewFinderMargins(
    @SerialName("left") val left: Int,
    @SerialName("top") val top: Int,
    @SerialName("right") val right: Int,
    @SerialName("bottom") val bottom: Int,
) {
    companion object {
        fun fromRect(rect: Rect) = ViewFinderMargins(
            left = rect.left,
            top = rect.top,
            right = rect.right,
            bottom = rect.bottom,
        )
    }
}

@Serializable
internal data class VerifyFramesRequest(
    @SerialName("client_secret") val clientSecret: String,
    @SerialName("verification_frames_data") val verificationFramesData: String,
)

@Serializable
internal class VerifyFramesResult
