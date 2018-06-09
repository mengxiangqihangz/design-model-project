package net.dp.factory.abstractFactory.creator;

import net.dp.factory.abstractFactory.factory.ingredientfactory.ChicagoPizzaIngredientFactory;
import net.dp.factory.abstractFactory.factory.ingredientfactory.PizzaIngredientFactory;
import net.dp.factory.abstractFactory.subject.CheesePizza;
import net.dp.factory.abstractFactory.subject.ClamPizza;
import net.dp.factory.abstractFactory.subject.PepperoniPizza;
import net.dp.factory.abstractFactory.subject.Pizza;
import net.dp.factory.abstractFactory.subject.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
