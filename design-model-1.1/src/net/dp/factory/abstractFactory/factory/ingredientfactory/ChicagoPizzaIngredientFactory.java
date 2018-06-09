package net.dp.factory.abstractFactory.factory.ingredientfactory;

import net.dp.factory.abstractFactory.factory.ingredient.Cheese;
import net.dp.factory.abstractFactory.factory.ingredient.Clams;
import net.dp.factory.abstractFactory.factory.ingredient.Dough;
import net.dp.factory.abstractFactory.factory.ingredient.Pepperoni;
import net.dp.factory.abstractFactory.factory.ingredient.Sauce;
import net.dp.factory.abstractFactory.factory.ingredient.Veggie;
import net.dp.factory.abstractFactory.factory.ingredient.impl.CheeseMozzarella;
import net.dp.factory.abstractFactory.factory.ingredient.impl.ClamsFrozen;
import net.dp.factory.abstractFactory.factory.ingredient.impl.DoughThickCrust;
import net.dp.factory.abstractFactory.factory.ingredient.impl.PepperoniSliced;
import net.dp.factory.abstractFactory.factory.ingredient.impl.SaucePlumTomato;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieBlack;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieEggplant;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieSpinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new DoughThickCrust();
	}

	public Sauce createSauce() {
		return new SaucePlumTomato();
	}

	public Cheese createCheese() {
		return new CheeseMozzarella();
	}

	public Veggie[] createVeggies() {
		Veggie veggies[] = { new VeggieBlack(), new VeggieSpinach(), new VeggieEggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new PepperoniSliced();
	}

	public Clams createClam() {
		return new ClamsFrozen();
	}
}
