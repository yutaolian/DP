package dp.singleton;

/**
 * 
 * @author lyt
 * @date Sep 29, 2016
 * @TODO
 * 懒汉式单例，getInstance前用synchronized修饰，可以保整线程安全，但是会加锁，导致效率偏低
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	private LazySingleton(){}
	
	public synchronized static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
