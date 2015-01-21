/**
 * 具体装饰者
 * @author zhou_wenxuan
 *
 */
public class ConcreteDecorator extends Decorator {
	/**
	 * 定义被装饰者
	 * @param component
	 */
	public ConcreteDecorator(Component component) {
		super(component);
	}
	/**
	 * 定义自己的修饰方法
	 */
	private void doSomething(){
		System.out.println("修饰方法");
	}
	/**
	 * 重写父类的operate方法
	 */
	@Override
	public void operate() {
		this.doSomething();
		super.operate();
	}
}
