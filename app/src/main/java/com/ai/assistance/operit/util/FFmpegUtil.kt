package com.ai.assistance.operit.util

import com.ai.assistance.operit.util.AppLogger

/**
 * Lightweight stub for FFmpeg operations in Lite Cloud Chat version.
 */
object FFmpegUtil {
    private const val TAG = "FFmpegUtil"

    fun scaleFilterMaxWidth(maxWidth: Int): String = "scale=min(${maxWidth}\\,iw):-2"

    fun executeCommand(command: String): Boolean {
        AppLogger.d(TAG, "FFmpeg is disabled in Lite version: $command")
        return false
    }

    class MediaStream(val type: String? = null)
    class MediaInformation(
        val format: String? = null,
        val duration: String? = null,
        val bitrate: String? = null,
        val streams: List<MediaStream>? = null
    )

    fun getMediaInfo(filePath: String): MediaInformation? {
        return null
    }
}
