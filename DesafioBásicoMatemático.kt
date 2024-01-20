fun main() {
   val media = readLine()!!.toDouble();
   
   when {
       media < 5 -> println("Reprovado");
       media > 5 && media < 7 -> println("REC")
       media > 7 -> println("APR")
       else -> println("A média é apenas entre 1 a 10.")
   }
}