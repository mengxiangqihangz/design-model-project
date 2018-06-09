package net.dp.factory.simpleFactory;

import net.dp.factory.simpleFactory.subject.CheesePizza;
import net.dp.factory.simpleFactory.subject.ClamPizza;
import net.dp.factory.simpleFactory.subject.PepperoniPizza;
import net.dp.factory.simpleFactory.subject.Pizza;
import net.dp.factory.simpleFactory.subject.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
