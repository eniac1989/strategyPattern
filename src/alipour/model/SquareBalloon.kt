package alipour.model

import alipour.controller.ScoreAlgorithmBase

class SquareBalloon : ScoreAlgorithmBase() {
    override fun calculateScore(taps: Int, multiplier: Int): Int {
        return (taps * multiplier) - 15
    }
}