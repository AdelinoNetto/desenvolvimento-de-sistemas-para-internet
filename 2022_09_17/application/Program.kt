package application

import entities.Product
import java.util.*


object Program {
    @JvmStatic
    fun main(args: Array<String>) {

        Locale.setDefault(Locale.US)
        val sc = Scanner(System.`in`)

        val product = Product()

        println("Enter product data: ")
        print("Name: ")
        product.name = sc.next()

        print("Price: ")
        product.price = sc.nextDouble()

        print("Quantity: ")
        product.quantity = sc.nextInt()

        println()
        println("Product data: $product")

        println()
        println("Enter the number of pruducts to be added in stock: ")
        var quantity = sc.nextInt()
        product.addProducts(quantity)

        println()
        println("Update data: $product")

        println()
        println("Enter the number of pruducts to be removed in stock: ")
        quantity = sc.nextInt()
        product.removeProducts(quantity)

        println()
        println("Update data: $product")
        sc.close()
    }
}