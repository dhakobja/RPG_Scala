import Game_Entities.{
    Player
}

import scala.io.StdIn.readLine

@main def game(): Unit = {
    print("Enter your Name: ")
    val playerName: String = readLine()
    var mainPlayer: Player = Player(playerName)
    
    while (true) {
      println("You wake up in a dark, damp cave. The air smells of mildew, and the faint sound of dripping " +
        "water echoes around you. There's a faint glimmer in the corner.")
    }
}

