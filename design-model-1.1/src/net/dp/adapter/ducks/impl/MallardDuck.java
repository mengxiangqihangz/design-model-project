package net.dp.adapter.ducks.impl;

import net.dp.adapter.ducks.Duck;


/**
 * 鸭子
 * @author liang
 *
 */
public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Quack");
	}

	public void fly() {
		System.out.println("I'm flying");
	}
}
