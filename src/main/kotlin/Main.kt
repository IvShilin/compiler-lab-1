package ru.ivan_shilin.compiler.lab1

import java.io.File

fun main() {
    val fileName = "example4.txt"
    var state = 'N'

    outer@ for (line in File(fileName).readLines()) {
        for ((i, symbol) in line.withIndex()) {
            when (state) {
                'N' -> {
                    when (symbol) {
                        'l' -> state = 'W'
                        'r' -> state = 'E'
                        'f' -> println("MoveNorth ⬆️")
                        Char(9500) -> {
                            println("⛔️ Конец программы ⛔️")
                            if (i < line.lastIndex) {
                                println("⚠️ Предупреждение: после символа конца строки есть лишние символы! ⚠️")
                            }
                            return
                        }
                        else -> {
                            println("⚠️ Входной символ вне словаря ⚠️")
                            return
                        }
                    }
                }
                'W' -> {
                    when (symbol) {
                        'l' -> state = 'S'
                        'r' -> state = 'N'
                        'f' -> println("MoveWest ⬅️")
                        Char(9500) -> {
                            println("⛔️ Конец программы ⛔️")
                            if (i < line.lastIndex) {
                                println("⚠️ Предупреждение: после символа конца строки есть лишние символы! ⚠️")
                            }
                            return
                        }
                        else -> {
                            println("⚠️ Входной символ вне словаря ⚠️")
                            return
                        }
                    }
                }
                'S' -> {
                    when (symbol) {
                        'l' -> state = 'E'
                        'r' -> state = 'W'
                        'f' -> println("MoveSouth ⬇️")
                        Char(9500) -> {
                            println("⛔️ Конец программы ⛔️")
                            if (i < line.lastIndex) {
                                println("⚠️ Предупреждение: после символа конца строки есть лишние символы! ⚠️")
                            }
                            return
                        }
                        else -> {
                            println("⚠️ Входной символ вне словаря ⚠️")
                            return
                        }
                    }
                }
                'E' -> {
                    when (symbol) {
                        'l' -> state = 'N'
                        'r' -> state = 'S'
                        'f' -> println("MoveEast ➡️")
                        Char(9500) -> {
                            println("⛔️ Конец программы ⛔️")
                            if (i < line.lastIndex) {
                                println("⚠️ Предупреждение: после символа конца строки есть лишние символы! ⚠️")
                            }
                            return
                        }
                        else -> {
                            println("⚠️ Входной символ вне словаря ⚠️")
                            return
                        }
                    }
                }
            }
        }
    }

    println("🚨🚨🚨 Программа была завершена некорректно! Символ конца строки не был введен! 🚨🚨🚨")
}