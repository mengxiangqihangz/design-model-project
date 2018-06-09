package net.dp.decorator.decorator1;

//测试类，看一下你就会发现，跟java的I/O操作有多么相似
public class Test {
	public static void main(String[] args) {
		Human person = new Person();
		/**
		 * 装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
		 */
		Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
		
		decorator.wearClothes();
		
		decorator.walkToWhere();
		
	}
}
