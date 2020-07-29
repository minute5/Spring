package example.test.Object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/17
 */
@Component
public class ObjectD {
	@Autowired
	private ObjectA a;

//	public ObjectD(ObjectA a) {
//		this.a = a;
//	}


	@Async
	public void printThreadName() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
