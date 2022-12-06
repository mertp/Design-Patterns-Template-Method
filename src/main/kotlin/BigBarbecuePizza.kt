//A concrete class overriding specific steps from the base class
class BigBarbecuePizza:Pizza() {
    override fun applySauce() {
        println("Applying barbecue sauce");
    }

    override fun makeDough() {
        println("Making 50 cm dough");
    }

    override fun addToppings() {
        println("Adding salami")
        println("Adding onion")
        println("Adding pineapple")
    }
}