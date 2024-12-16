package Game_Entities

import scala.collection.mutable.ArrayBuffer

case class Room(description: String, items: ArrayBuffer[Item], monsters: ArrayBuffer[Monster]) {
}