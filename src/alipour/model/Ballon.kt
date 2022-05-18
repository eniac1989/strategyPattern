package alipour.model

import alipour.controller.ScoreAlgorithmBase

public class Ballon : ScoreAlgorithmBase() {

    override fun calculateScore(taps: Int, multiplier: Int): Int {
        return (taps * multiplier) - 20
    }

}