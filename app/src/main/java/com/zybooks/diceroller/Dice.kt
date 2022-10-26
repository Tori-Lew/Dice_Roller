package com.zybooks.diceroller

const val LARGEST_NUM = 6
const val SMALLEST_NUM = 1

class Dice(diceNumber: Int) {
    var imageId = 0

    var number = SMALLEST_NUM
        set(value) {
            if (value in SMALLEST_NUM..LARGEST_NUM) {
                field = value
                imageId = when (value) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
            }
        }

    init {
        number = diceNumber
    }

    fun roll() {
        number = (SMALLEST_NUM..LARGEST_NUM).random()
    }
}