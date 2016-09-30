package dp.singleton;

/**
 * 
 * @author lyt
 * @date Sep 29, 2016
 * @TODO
 * 使用静态代码块创建单例
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	private StaticBlockSingleton(){}
	static{
		instance = new StaticBlockSingleton();
	}
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
