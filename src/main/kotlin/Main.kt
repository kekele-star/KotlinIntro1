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
 }