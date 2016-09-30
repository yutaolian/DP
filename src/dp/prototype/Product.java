package dp.prototype;



/**
 * 
 * @author lyt
 * @date Sep 29, 2016
 * @TODO
 * 
 * 深拷贝和浅拷贝
 * 想要实现浅拷贝，类必须实现cloneable接口实现clone()方法
 * 深拷贝，不仅将类中的属行拷贝，而且将类中的应用类型的类也拷贝。需要实现Serializable接口而实现深拷贝方法应该使用序列化的方法实现
 * 
 */

public class Product implements Cloneable {
	
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	protected Product clone() throws CloneNotSupportedException {
		return (Product) super.clone();
	}
//	@Override
//	public String toString() {
//		return "Product [address = "+this.getClass()+"name=" + name + ", price=" + price + "]";
//	}
//	

}
