package net.dp.singleton.classic;

//NOTE: This is not thread safe!
/**
 * 线程 不安全
 * @author zhiyu
 *
 */

public class Singleton {
	private static Singleton uniqueInstance;

	// other useful instance variables here

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	// other useful methods here
}
