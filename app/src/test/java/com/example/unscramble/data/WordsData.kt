package com.example.unscramble.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

// List with all the words for the Game
val allWords: Set<String> =
    setOf(
        "jaehyun",
        "jaemin",
        "haechan",
        "jisung",
        "kun",
        "sion",
        "anton",
        "jeno",
        "yuta",
        "yangyang"
    )

private val wordLengthMap: Map<Int, String> = allWords.associateBy({ it.length }, { it })

internal fun getUnscrambledWord(scrambledWord: String) = wordLengthMap[scrambledWord.length] ?: ""
