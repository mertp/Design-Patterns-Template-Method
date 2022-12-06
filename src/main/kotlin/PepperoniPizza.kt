//A concrete class overriding specific steps from the base class
class PepperoniPizza:Pizza() {
    override fun addToppings() {
        println("Adding pepperoni");
        println("Adding mushroom");
        println("Adding pepper");
    }
}