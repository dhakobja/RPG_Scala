package Game_Entities

import scala.collection.mutable.ArrayBuffer

class Player(name: String) {
    var health: Int = 100
    val Inventory: ArrayBuffer[Item] = ArrayBuffer()
    val location: Room = Room("This is the starting room", ArrayBuffer(), ArrayBuffer())

    override def toString(): String = f"${name} - Health: ${health}"
}
