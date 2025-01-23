package models

class CharacterMarioKart {
    private var name: String = "Unknown"
    private var speed: Float = 0.0f
    private var acceleration: Float = 0.0f
    private var weight: Float = 0.0f
    private var handling: Float = 0.0f
    private var traction: Float = 0.0f
    private var items: MutableList<ItemMarioKart> = mutableListOf()

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, speed: Float, acceleration: Float) {
        this.name = name
        this.speed = speed
        this.acceleration = acceleration
    }

    constructor(name: String, speed: Float, acceleration: Float, weight: Float, handling: Float, traction: Float) {
        this.name = name
        this.speed = speed
        this.acceleration = acceleration
        this.weight = weight
        this.handling = handling
        this.traction = traction
    }

    fun changeWheels() {
        this.traction = 100.0f
    }

    fun brake() {
        this.acceleration /= 2.0f
    }

    fun stopKart() {
        this.acceleration = 0.0f
        this.speed = 0.0f
    }

    fun turbo() {
        this.speed = Calculadora.suma(this.speed, this.acceleration)
    }

    fun accelerate() {
        if (this.acceleration > 0) {
            this.acceleration *= 0.1f
            this.calcSpeed(10)
        }
    }

    private fun calcSpeed(time: Int) {
        this.speed = this.acceleration * time
    }

    /**
     * Obté el nom del personatge.
     * @return El nom del personatge.
     * @author RIS
     */
    fun getName(): String {
        return this.name
    }

    /**
     * Assigna un nou valor al nom del personatge.
     * @param name El nou nom del personatge. No pot estar buit.
     * @author RIS
     */
    fun setName(name: String) {
        if (name.isNotBlank()) {
            this.name = name
        } else {
            println("El nom no pot estar buit!")
        }
    }

    /**
     * Obté la velocitat del personatge.
     * @return La velocitat del personatge en unitats flotants (Float >= 0.0f).
     * @author RIS
     */
    fun getSpeed(): Float {
        return this.speed
    }

    /**
     * Assigna un nou valor a la velocitat del personatge.
     * @param speed La nova velocitat del personatge. Ha de ser un valor positiu.
     * @author RIS
     */
    fun setSpeed(speed: Float) {
        if (speed >= 0) {
            this.speed = speed
        } else {
            println("La velocitat no pot ser negativa!")
        }
    }

    /**
     * Obté l'acceleració del personatge.
     * @return L'acceleració del personatge en unitats flotants (Float >= 0.0f).
     * @author RIS
     */
    fun getAcceleration(): Float {
        return this.acceleration
    }

    /**
     * Assigna un nou valor a l'acceleració del personatge.
     * @param acceleration La nova acceleració del personatge. Ha de ser un valor positiu.
     * @author RIS
     */
    fun setAcceleration(acceleration: Float) {
        if (acceleration >= 0) {
            this.acceleration = acceleration
        } else {
            println("L'acceleració no pot ser negativa!")
        }
    }

    /**
     * Obté el pes del personatge.
     * @return El pes del personatge en unitats flotants (Float >= 0.0f).
     * @author RIS
     */
    fun getWeight(): Float {
        return this.weight
    }

    /**
     * Assigna un nou valor al pes del personatge.
     * @param weight El nou pes del personatge. Ha de ser un valor positiu.
     * @author RIS
     */
    fun setWeight(weight: Float) {
        if (weight >= 0) {
            this.weight = weight
        } else {
            println("El pes no pot ser negatiu!")
        }
    }

    /**
     * Obté el maneig del personatge.
     * @return El maneig del personatge en unitats flotants (Float >= 0.0f).
     * @author RIS
     */
    fun getHandling(): Float {
        return this.handling
    }

    /**
     * Assigna un nou valor al maneig del personatge.
     * @param handling El nou maneig del personatge. Ha de ser un valor positiu.
     * @author RIS
     */
    fun setHandling(handling: Float) {
        if (handling >= 0) {
            this.handling = handling
        } else {
            println("El maneig no pot ser negatiu!")
        }
    }

    /**
     * Obté la tracció del personatge.
     * @return La tracció del personatge en unitats flotants (Float >= 0.0f).
     * @author RIS
     */
    fun getTraction(): Float {
        return this.traction
    }

    /**
     * Assigna un nou valor a la tracció del personatge.
     * @param traction La nova tracció del personatge. Ha de ser un valor positiu.
     * @author RIS
     */
    fun setTraction(traction: Float) {
        if (traction >= 0) {
            this.traction = traction
        } else {
            println("La tracció no pot ser negativa!")
        }
    }

    /**
     * Obté la llista d'objectes de Mario Kart associats al personatge.
     * @return La llista mutable d'objectes de tipus `ItemMarioKart`.
     * Aquesta llista pot estar buida si el personatge encara no té objectes.
     * @author RIS
     */
    fun getItems(): MutableList<ItemMarioKart> {
        return this.items
    }

    /**
     * Assigna una nova llista d'objectes de Mario Kart al personatge.
     * Substitueix completament els objectes actuals del personatge.
     * @param items Una llista mutable d'objectes de tipus `ItemMarioKart`.
     * @author RIS
     */
    fun setItems(items: MutableList<ItemMarioKart>) {
        this.items = items
    }


    override fun toString(): String {
        return "CharacterMarioKart(name=${this.name}, speed=${this.speed}, acceleration=$acceleration, weight=$weight, handling=$handling, traction=$traction)"
    }
}