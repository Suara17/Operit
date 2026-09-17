package com.ai.assistance.operit.terminal.provider.filesystem

import java.io.File
import java.io.InputStream
import java.io.OutputStream

open class FileSystemProvider {
    open fun exists(path: String): Boolean = File(path).exists()
    open fun isDirectory(path: String): Boolean = File(path).isDirectory
    open fun isFile(path: String): Boolean = File(path).isFile
    open fun listFiles(path: String): List<String> = File(path).list()?.toList() ?: emptyList()
    open fun openInputStream(path: String): InputStream = File(path).inputStream()
    open fun openOutputStream(path: String): OutputStream = File(path).outputStream()
    open fun delete(path: String): Boolean = File(path).delete()
    open fun mkdirs(path: String): Boolean = File(path).mkdirs()
    open fun length(path: String): Long = File(path).length()
    open fun lastModified(path: String): Long = File(path).lastModified()
}
