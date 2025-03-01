package ru.ivan_shilin.compiler.lab1

import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val fileName = "example1.txt"
    var state = 'N'

    File(fileName)
        .forEachLine { line ->
            line.forEach { symbol ->
                when (state) {
                    'N' -> {
                        when (symbol) {
                            'l' -> {
                                state = 'W'
                            }

                            'r' -> {
                                state = 'E'
                            }

                            'f' -> {
                                println("MoveNorth")
                            }

                            Char(9500) -> {
                                println("КОНЕЦ ПРОГРАММЫ!!!!!!!!")
                                return@forEachLine
                            }

                            else -> {
                                println("ВХОДНОЙ СИМВОЛ НЕ НРАВИТСЯ!!!!")
                                return@forEachLine
                            }
                        }
                    }

                    'W' -> {
                        when (symbol) {
                            'l' -> {
                                state = 'S'
                            }

                            'r' -> {
                                state = 'N'
                            }

                            'f' -> {
                                println("MoveWest")
                            }

                            Char(9500) -> {
                                println("КОНЕЦ ПРОГРАММЫ!!!!!!!!")
                                return@forEachLine
                            }

                            else -> {
                                println("ВХОДНОЙ СИМВОЛ НЕ НРАВИТСЯ!!!!")
                                return@forEachLine
                            }
                        }
                    }

                    'S' -> {
                        when (symbol) {
                            'l' -> {
                                state = 'E'
                            }

                            'r' -> {
                                state = 'W'
                            }

                            'f' -> {
                                println("MoveSouth")
                            }

                            Char(9500) -> {
                                println("КОНЕЦ ПРОГРАММЫ!!!!!!!!")
                                return@forEachLine
                            }

                            else -> {
                                println("ВХОДНОЙ СИМВОЛ НЕ НРАВИТСЯ!!!!")
                                return@forEachLine
                            }
                        }
                    }

                    'E' -> {
                        when (symbol) {
                            'l' -> {
                                state = 'N'
                            }

                            'r' -> {
                                state = 'S'
                            }

                            'f' -> {
                                println("MoveEast")
                            }

                            Char(9500) -> {
                                println("КОНЕЦ ПРОГРАММЫ!!!!!!!!")
                                return@forEachLine
                            }

                            else -> {
                                println("ВХОДНОЙ СИМВОЛ НЕ НРАВИТСЯ!!!!")
                                return@forEachLine
                            }
                        }
                    }
                }
            }
        }

    println("ЗАВЕРШАЕМ ПРОГРАММУ")

}