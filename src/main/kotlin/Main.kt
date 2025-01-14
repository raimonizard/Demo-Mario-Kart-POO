import models.*

fun main(){
    var mario: CharacterMarioKart
    mario = CharacterMarioKart("Mario", 5.5f, 5.5f, 5.5f, 5.5f, 5.5f)
    var yoshi: CharacterMarioKart = CharacterMarioKart("Yoshi")

    var personatges: MutableList<CharacterMarioKart> = mutableListOf()

    personatges.add(mario)
    personatges.add(yoshi)

    for (personatge in personatges)
        println(personatge)
}