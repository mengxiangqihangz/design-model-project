package net.dp.factory.abstractFactory.factory.ingredientfactory;

import net.dp.factory.abstractFactory.factory.ingredient.Cheese;
import net.dp.factory.abstractFactory.factory.ingredient.Clams;
import net.dp.factory.abstractFactory.factory.ingredient.Dough;
import net.dp.factory.abstractFactory.factory.ingredient.Pepperoni;
import net.dp.factory.abstractFactory.factory.ingredient.Sauce;
import net.dp.factory.abstractFactory.factory.ingredient.Veggie;
import net.dp.factory.abstractFactory.factory.ingredient.impl.CheeseReggiano;
import net.dp.factory.abstractFactory.factory.ingredient.impl.ClamsFresh;
import net.dp.factory.abstractFactory.factory.ingredient.impl.DoughThinCrust;
import net.dp.factory.abstractFactory.factory.ingredient.impl.PepperoniSliced;
import net.dp.factory.abstractFactory.factory.ingredient.impl.SauceMarinara;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieGarlic;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieMushroom;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieOnion;
import net.dp.factory.abstractFactory.factory.ingredient.impl.VeggieRedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new DoughThinCrust();
	}
 
	public Sauce createSauce() {
		return new SauceMarinara();
	}
 
	public Cheese createCheese() {
		return new CheeseReggiano();
	}
 
	public Veggie[] createVeggies() {
		Veggie veggies[] = { new VeggieGarlic(), new VeggieOnion(), new VeggieMushroom(), new VeggieRedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new PepperoniSliced();
	}

	public Clams createClam() {
		return new ClamsFresh();
	}
}
