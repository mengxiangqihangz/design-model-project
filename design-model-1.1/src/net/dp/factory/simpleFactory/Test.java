package net.dp.factory.simpleFactory;

import net.dp.factory.simpleFactory.subject.Pizza;

public class Test {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}