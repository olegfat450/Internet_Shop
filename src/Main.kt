



       fun main() {


         var flag = 0

            do { Shop().info()
             when( readLine().toString()) {
                 "1" -> { shopKrn().info(); shopKrn().catalog(); flag = 1 }
                 "2" -> { shopNvs().info(); shopNvs().catalog(); flag = 2 }
                 else -> return }

               print("Выберете телефон: "); val s = readln().toInt()

                when (flag) {
                    1 -> shopKrn().salePhoneKrn(s-1)
                    2 -> shopNvs().salePhoneNvs(s-1) }
            } while (true)




}













