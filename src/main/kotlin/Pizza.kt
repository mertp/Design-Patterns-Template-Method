abstract class Pizza {//Base class for all pizzas
    fun make() {//Default algorithm steps for all pizzas
        makeDough();
        applySauce();
        addToppings();
        bake();
    }

    open fun bake() {//Default implementations of all methods.
        println("Baking pizza for 30 minutes ")
    }
    open fun makeDough(){
        println("Making 25 cm dough");
    }
    open fun applySauce(){
        println("Applying tomato sauce");
    }
    open fun addToppings(){
        println("Adding cheese")
    }
}
