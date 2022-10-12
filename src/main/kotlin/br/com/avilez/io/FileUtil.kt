package br.com.avilez.io

import java.io.File

class FileUtil {

    fun get10LongestWordsInDictionary() =
        File("words.txt").useLines { line ->
            line.filter { it.length > 20 }
                .sortedByDescending { it.length }
                .take(10)
                .toList()
        }

    fun writeText() =
        File("words.txt").writeText("my data")
}