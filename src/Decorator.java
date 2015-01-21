
/**
 * ����װ����
 * @author zhou_wenxuan
 *
 */
public abstract class Decorator extends Component {
	private Component component;
	/**
	 * ͨ�����캯�����ݱ�װ����
	 * @param component
	 */
	public Decorator(Component component) {

		this.component = component;
	}
	/**
	 * ί�и���������ִ��
	 */
	@Override
	public void operate() {
		this.component.operate();
	}

}
