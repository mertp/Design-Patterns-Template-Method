/*
Name:Mert Can Pekdemir
StudentNo:b201202049
Design Patterns  Project/Design Assignment

Template Method is a behavioral design pattern that defines the skeleton of an algorithm
in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
It consists of two components. One base class and concrete classes. Base class is a abstract class and it
declares default methods for the algorithm. Also it declares the order of them. Concrete classes can override the
all of the steps but they can not override the template method itself.
*/
fun main(args: Array<String>) {

//Instances of concrete classes
val pepperoniPizza=PepperoniPizza();
val bigBarbecuePizza=BigBarbecuePizza();
println("Making pepperoni pizza")
//Calling make functions of each concrete class
pepperoniPizza.make();
println("---------------------------------")
println("Making Big Barbecue pizza")
bigBarbecuePizza.make();
}