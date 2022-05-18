package alipour.controller

/**
 * @author Paniz
 */
open class ScoreBoard {

    public lateinit var algorithmBase:ScoreAlgorithmBase

    fun showScore(taps: Int, multiplier: Int) {
        System.out.println(algorithmBase.calculateScore(taps, multiplier))
    }

}