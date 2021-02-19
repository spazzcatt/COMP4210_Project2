package playing_cards

trait IsNumbered{
  val numberOfCard: Int
  val standardCardNumbers = Array("ace", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "king", "queen", "joker")
  val cardNumberString = standardCardNumbers(numberOfCard)
}

trait HasSuit{
  val suits = Array("HEARTS", "DIAMONDS", "CLUBS", "SPADES")
  val currentSuit : Int
  val suitString = suits(currentSuit)
}

class PlayingCard(number: Int, suit: String) extends IsNumbered with HasSuit{
  override val numberOfCard: Int = number
  override val currentSuit: Int = suits.indexOf(suit.toUpperCase())


  override def toString: Unit = {println(s"$cardNumberString of $suitString")}
}
