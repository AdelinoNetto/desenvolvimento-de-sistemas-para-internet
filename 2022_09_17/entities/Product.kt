package entities

class Product {
    var name: String? = null
    var price = 0.0
    var quantity = 0 // this.quantity


    fun totalValueInStock(): Double {
        return price * quantity
    }

    fun addProducts(quantity: Int) {
        this.quantity += quantity
    }

    fun removeProducts(quantity: Int) {
        this.quantity -= quantity
    }

    override fun toString(): String {
        return (name
                + ", $"
                + String.format("%.2f", price) + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock()))
    }
}