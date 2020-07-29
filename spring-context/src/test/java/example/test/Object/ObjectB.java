package example.test.Object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
@Component("b")
public class ObjectB {
	@Autowired
	private ObjectA a;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
