package alipour

import alipour.controller.ScoreBoard
import alipour.model.Ballon
import alipour.model.Clawns
import alipour.model.SquareBalloon

fun main() {
    var scoreBoard = ScoreBoard()
    System.out.println("Baloon Tap Score:")
    scoreBoard.algorithmBase =Ballon()
    scoreBoard.showScore(10,5)

    System.out.println("Clawn Tap Score:")
    scoreBoard.algorithmBase=Clawns()
    scoreBoard.showScore(10,5)

    System.out.println("Square Balloon Score:")
    scoreBoard.algorithmBase=SquareBalloon()
    scoreBoard.showScore(10,5)
}