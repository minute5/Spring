package example.test2.Object;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
public class ObjectA {
	private ObjectB b;
	private String xxx;

	public ObjectB getB() {
		return b;
	}

	public void setXxx(String xxx) {
		System.out.println("ObjectA xxx");
		this.xxx = xxx;
	}
}
