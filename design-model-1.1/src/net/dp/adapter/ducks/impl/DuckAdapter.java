package net.dp.adapter.ducks.impl;

import java.util.Random;

import net.dp.adapter.ducks.Duck;
import net.dp.adapter.turkey.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}
}
