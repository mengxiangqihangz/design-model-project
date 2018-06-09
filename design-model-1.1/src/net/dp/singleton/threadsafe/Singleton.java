package net.dp.singleton.threadsafe;

public class Singleton {
	
	public static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 这两种锁的性能都差不多。 都相对较低
	 * @return
	 */
	public static Singleton getInstance2(){
		synchronized (instance) {
			if(instance == null){
				instance = new Singleton();
			}
		}
		return instance;
	}
}
