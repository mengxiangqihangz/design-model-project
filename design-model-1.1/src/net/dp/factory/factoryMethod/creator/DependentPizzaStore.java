//package net.dp.factory.factoryMethod.creator;
//
//import net.dp.factory.factoryMethod.subject.ChicagoStyleCheesePizza;
//import net.dp.factory.factoryMethod.subject.ChicagoStyleClamPizza;
//import net.dp.factory.factoryMethod.subject.ChicagoStylePepperoniPizza;
//import net.dp.factory.factoryMethod.subject.ChicagoStyleVeggiePizza;
//import net.dp.factory.factoryMethod.subject.NYStyleCheesePizza;
//import net.dp.factory.factoryMethod.subject.NYStyleClamPizza;
//import net.dp.factory.factoryMethod.subject.NYStylePepperoniPizza;
//import net.dp.factory.factoryMethod.subject.NYStyleVeggiePizza;
//import net.dp.factory.factoryMethod.subject.Pizza;
//
//public class DependentPizzaStore {
// 
//	public Pizza createPizza(String style, String type) {
//		Pizza pizza = null;
//		if (style.equals("NY")) {
//			if (type.equals("cheese")) {
//				pizza = new NYStyleCheesePizza();
//			} else if (type.equals("veggie")) {
//				pizza = new NYStyleVeggiePizza();
//			} else if (type.equals("clam")) {
//				pizza = new NYStyleClamPizza();
//			} else if (type.equals("pepperoni")) {
//				pizza = new NYStylePepperoniPizza();
//			}
//		} else if (style.equals("Chicago")) {
//			if (type.equals("cheese")) {
//				pizza = new ChicagoStyleCheesePizza();
//			} else if (type.equals("veggie")) {
//				pizza = new ChicagoStyleVeggiePizza();
//			} else if (type.equals("clam")) {
//				pizza = new ChicagoStyleClamPizza();
//			} else if (type.equals("pepperoni")) {
//				pizza = new ChicagoStylePepperoniPizza();
//			}
//		} else {
//			System.out.println("Error: invalid type of pizza");
//			return null;
//		}
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
//		return pizza;
//	}
//}
