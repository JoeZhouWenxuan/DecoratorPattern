/**
 * 场景类
 * @author zhou_wenxuan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//
		Component component = new ConcreteComponent();
		//修饰
		component = new ConcreteDecorator(component);
		//修饰后运行
		component.operate();
	}
}
