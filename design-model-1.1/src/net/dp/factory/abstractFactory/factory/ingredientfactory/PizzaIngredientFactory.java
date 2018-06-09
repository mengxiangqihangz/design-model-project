package net.dp.factory.abstractFactory.factory.ingredientfactory;

import net.dp.factory.abstractFactory.factory.ingredient.Cheese;
import net.dp.factory.abstractFactory.factory.ingredient.Clams;
import net.dp.factory.abstractFactory.factory.ingredient.Dough;
import net.dp.factory.abstractFactory.factory.ingredient.Pepperoni;
import net.dp.factory.abstractFactory.factory.ingredient.Sauce;
import net.dp.factory.abstractFactory.factory.ingredient.Veggie;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	
	public Sauce createSauce();
	
	public Cheese createCheese();
	
	public Veggie[] createVeggies();
	
	public Pepperoni createPepperoni();
	
	public Clams createClam();
 
}
