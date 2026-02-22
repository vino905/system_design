package structural.decorator;

//ToppingDecorator Extends BasePizza: This ensures all toppings are treated as a type of BasePizza, which aligns with the design principle that decorators should be interchangeable with the objects they decorate.
//Future extension possibilities, like adding shared methods, are simpler with an abstract class.
public abstract class ToppingDecorator extends BasePizza {
}
