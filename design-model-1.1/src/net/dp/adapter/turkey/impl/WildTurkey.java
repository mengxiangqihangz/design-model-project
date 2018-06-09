package net.dp.adapter.turkey.impl;

import net.dp.adapter.turkey.Turkey;

/**
 * 火鸡
 * @author liang
 *
 */
public class WildTurkey implements Turkey {
	
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
