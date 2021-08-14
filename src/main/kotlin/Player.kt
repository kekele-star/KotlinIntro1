

class Player(val name: String, var level: Int = 1,
             var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("fist",1)

    fun show(){
        println("""
        name: $name
        level: $level
        lives: $lives
        score: $score
        weapon: ${weapon.name}
        damage: ${weapon.damageInflicted}
        """)
    }
}