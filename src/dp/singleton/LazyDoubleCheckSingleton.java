package dp.singleton;

/**
 * 
 * @author lyt
 * @date Sep 29, 2016
 * @TODO
 * 
 * 懒汉是双检查单例,相比之前的懒汉模式。将synchronized放到对象的创建上，不需要对整个方法加锁，从而提高性能
 * 而比较重要的就是volatile修饰单例对象的成员变量
 * 为什么要使用volatile修饰
 * 问题的原因在于singletonObject = new SingletonObject()，这个不是原子操作，它的执行分以下先后三步：
	一.给新创建的对象分配内存；
	二.调用构造方法初始化成员变量；
	三.将singletonObject指向新对象的内存空间。
	上面的三步，执行到第三步时，singletonObject已经不是null了。然而JVM即时编译器存在指令重排序的优化，
	所以上面三步的执行顺序可能是一二三，也可能是一三二，当按后者顺序执行到三时，
	另一个线程执行到了if里面的非null判断，此时singletonObject已经不为null了，
	然而成员变量的值没有初始化，另一个线程直接拿着这个没有初始化完全的对象进行操作时，定会出错。

 * 这里的volatile是为了禁止指令的重排序，能保证happens-before relationship，
 * 所有的写都将先行发生于读。需要注意的是，在JDK 5之前的版本中使用volatile并不能完全阻止指令的重排序，
 * 原因是Java内存模型存在缺陷导致的。
 */
public class LazyDoubleCheckSingleton {

	private volatile static LazyDoubleCheckSingleton instance = null;
	private LazyDoubleCheckSingleton(){}
	
	public static LazyDoubleCheckSingleton getInstance(){
		if (instance == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				instance = new LazyDoubleCheckSingleton();
			}
		}
		return instance;
	}
}
