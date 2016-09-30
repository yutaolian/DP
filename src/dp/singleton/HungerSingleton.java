package dp.singleton;

/**
 * 饥饿式单例
 * @author lyt
 * @date Sep 29, 2016
 * @TODO
 * 因为是static修饰的变量和方法，所以不能依赖参数或者配置文件创建对象
 */
public class HungerSingleton {
	private  static final HungerSingleton instance = new HungerSingleton();
	private HungerSingleton(){}
	public static HungerSingleton getInstance(){
		return instance;
	}
}
