/**
 * ������
 * @author zhou_wenxuan
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//
		Component component = new ConcreteComponent();
		//����
		component = new ConcreteDecorator(component);
		//���κ�����
		component.operate();
	}
}
