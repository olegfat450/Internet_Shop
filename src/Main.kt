



       fun main() {

            var s = 0
         var flag: Int

           loop@do { Shop().info()
             when( readLine().toString()) {
                 "1" -> { shopKrn().info(); shopKrn().repair(); shopKrn().catalog(); flag = 1 }
                 "2" -> { shopNvs().info(); shopNvs().catalog(); flag = 2 }
                 "3" -> { Shop().statistic(); continue@loop}
                 else -> return }

             do { print("Выберете телефон: "); try { s = readln().toInt() } catch (_:Exception) { s = 0 } } while ( s > (Catalog().priceKrn.size) || (s <= 0) || (s > Catalog().priceNvs.size))

                when (flag) {
                    1 -> shopKrn().salePhone(s-1)
                    2 -> shopNvs().salePhone(s-1) }
            } while (true)




}













