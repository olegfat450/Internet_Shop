
  val phones = Catalog().phones
  val priceKrn = Catalog().priceKrn
  val amountKrn = Catalog().amountKrn.toMutableList()
  val saleKrn = Array(phones.size, {0})
  val amountNvs = Catalog().amountNvs.toMutableList()
  val saleNvs = Array(phones.size, {0})
  val priceNvs = Catalog().priceNvs

  
 open class Shop() {

    open fun info() = print("Вас приветствует интернет - магазин\n Выберете город:\n 1. Красноярск\n 2. Новосибирск\n 0. Выход\n _________: ")
 }



         class shopKrn (): Shop() {

             fun salePhoneKrn(position: Int){
                 println("Продан телефон: ${phones[position]}") ; amountKrn[position]--; saleKrn[position]++ }



             override fun info() {
                 println("Магазин г.Красноярск")
                for (i in 0..phones.size - 1) if ( saleKrn[i] != 0)  println("Продано телефонов марки: ${phones[i]}  -   ${saleKrn[i]}") }


              fun catalog() {

                 for (i in 0..phones.size - 1) {
                     println(" ${i+1} Модель: ${phones[i]}  |  Цена: ${priceKrn[i]}  |  Количество: ${amountKrn[i]}  |  Продано: ${saleKrn[i]}") } }
         }



         class shopNvs(): Shop(){

             override fun info() {
                println("Магазин г.Новосибирск")
             for (i in 0..phones.size - 1) if ( saleNvs[i] != 0) println("Продано телефонов марки: ${phones[i]}  -   ${saleNvs[i]}")}

             fun catalog() {

                 for (i in 0..phones.size - 1) {
                     println(" ${i+1} Модель: ${phones[i]}  |  Цена: ${priceNvs[i]}  |  Количество: ${amountNvs[i]}  |  Продано: ${saleNvs[i]}") } }

             fun salePhoneNvs(position: Int){
                 println("Продан телефон: ${phones[position]}") ; amountNvs[position]--; saleNvs[position]++ }


         }




        class Catalog(){

             val phones = listOf("Samsung","Nokia","Lg")
             val priceKrn = listOf(14500,13000,11500)
             val priceNvs = listOf(14000,12500,12000)
             val amountKrn = listOf(10,5,8)
             val amountNvs = listOf(8,3,12)
         }