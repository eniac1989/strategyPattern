package alipour.model

import alipour.controller.ScoreAlgorithmBase
import alipour.controller.ScoreBoard

class Clawns : ScoreAlgorithmBase() {

    override fun calculateScore(taps: Int, multiplier: Int): Int {
        return (taps * multiplier) - 10
    }

}