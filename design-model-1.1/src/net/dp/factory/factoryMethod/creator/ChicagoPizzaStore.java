package net.dp.factory.factoryMethod.creator;

import net.dp.factory.factoryMethod.subject.ChicagoStyleCheesePizza;
import net.dp.factory.factoryMethod.subject.ChicagoStyleClamPizza;
import net.dp.factory.factoryMethod.subject.ChicagoStylePepperoniPizza;
import net.dp.factory.factoryMethod.subject.ChicagoStyleVeggiePizza;
import net.dp.factory.factoryMethod.subject.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else
			return null;
	}
}
