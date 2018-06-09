package net.dp.singleton.threadsafe.eager;


/**
 * jvm加载这个类的时候就创建了。
 * @author zhiyu
 *
 */
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}