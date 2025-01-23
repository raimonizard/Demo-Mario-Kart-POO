package models

class ItemMarioKart {
    private var name: String        // Nom de l'objecte (per exemple, "Bolet", "Estrella")
    private var type: ItemType      // Tipus de l'objecte (ajuda, atac, defensa, etc.)
    private var duration: Int = 0   // Durada de l'efecte en segons (0 si no aplica)
    private var power: Int = 0       // Potència o efecte de l'objecte (com més alt, més potent)

    constructor(duration: Int, name: String, type: ItemType, power: Int) {
        this.duration = duration
        this.name = name
        this.type = type
        this.power = power
    }

    // Mètode per aplicar l'efecte de l'objecte
    fun applyEffect(player: String): String {
        return when (type) {
            ItemType.BOOST -> "$player guanya un impuls de velocitat durant $duration segons!"
            ItemType.ATTACK -> "$player utilitza $name per atacar un oponent amb una potència de $power!"
            ItemType.DEFENSE -> "$player utilitza $name per defensar-se d'un atac!"
            ItemType.SPECIAL -> "$player utilitza $name i obté un avantatge especial durant $duration segons!"
        }
    }

    // Mètode per descriure l'objecte
    fun description(): String {
        return "Nom: $name, Tipus: $type, Durada: $duration segons, Potència: $power."
    }

    override fun toString(): String {
        return "ItemMarioKart(name='$name', type=$type, duration=$duration, power=$power)"
    }
}
