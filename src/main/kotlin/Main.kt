/*Classes, Objects and Instances in Koltin */

fun main(args: Array<String>) {
     val kelly = Player("kelly")
//     println(kelly.name)
//     println(kelly.lives)
//     println(kelly.score)
    kelly.show()

    val louise = Player("Louise",5)
    louise.show()


    val bao = Player("Bao", 4,8)
    val grace = Player("Grace",2,5,1000)
    bao.show()
    grace.show()
    println(grace.weapon.name)
    println(grace.weapon.damageInflicted)

    val axe = Weapon("Axe",18)
    bao.weapon = axe
    println(bao.weapon.name)
    println(axe.name)

    axe.damageInflicted =30
    println(axe.damageInflicted)
    println(bao.weapon.damageInflicted)


    /*Challenge: modify the "show" function in the "Player" class so that it also
    * prints the details for the weapon that the players have.
    *
    * As you print the Player's nam, lives, level and score, it should also print
    * the name of their weapon and the damage it inflicts
    *
    * Use the modified show function in main to print out kelly's details(including weapon)
    * instead of just the weapon
    * So instead of just printing kelly.weapon.name, use the modified show function.
    *
    *
    * 2. Modify the code in the main function so that louise gets the sword before kelly
    * replaces it with a spear
    * The point here is to give louise the same sword that kelly had, not to create a new one.
    * Use the show function to display the details for louise to check that your code's working*/

// Solution
    kelly.weapon = Weapon("Spear", 14)
    kelly.show()

    louise.weapon = kelly.weapon // soln to q2
    louise.show() // code for q2

    kelly.weapon = Weapon( "Spear", 14)
    println(kelly.weapon.name)


}