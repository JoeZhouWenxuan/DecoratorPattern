/**
 * ����װ����
 * @author zhou_wenxuan
 *
 */
public class ConcreteDecorator extends Decorator {
	/**
	 * ���屻װ����
	 * @param component
	 */
	public ConcreteDecorator(Component component) {
		super(component);
	}
	/**
	 * �����Լ������η���
	 */
	private void doSomething(){
		System.out.println("���η���");
	}
	/**
	 * ��д�����operate����
	 */
	@Override
	public void operate() {
		this.doSomething();
		super.operate();
	}
}
