import models.*
import utils.*

fun main(){
    var mario: CharacterMarioKart
    mario = CharacterMarioKart("Mario", 5.5f, 5.5f, 5.5f, 5.5f, 5.5f)

    var yoshi: CharacterMarioKart = CharacterMarioKart("Yoshi")

    var personatges: MutableList<CharacterMarioKart> = mutableListOf()

    personatges.add(mario)
    personatges.add(yoshi)
    personatges.add(createCharacter())

    for (personatge in personatges)
        println(personatge)
}

fun createCharacter(): CharacterMarioKart{
    val character: CharacterMarioKart
    character = CharacterMarioKart(readSentence("Write the character's name", "Please try again..."))
    return character
}