package net.dp.factory.factoryMethod.creator;

import net.dp.factory.factoryMethod.subject.NYStyleCheesePizza;
import net.dp.factory.factoryMethod.subject.NYStyleClamPizza;
import net.dp.factory.factoryMethod.subject.NYStylePepperoniPizza;
import net.dp.factory.factoryMethod.subject.NYStyleVeggiePizza;
import net.dp.factory.factoryMethod.subject.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
