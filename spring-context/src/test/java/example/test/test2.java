package example.test;

import example.test.Configuration.CustomConfig;
import example.test.Object.ObjectD;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/17
 */
public class test2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(CustomConfig.class);
		ac.refresh();
		while (true) {
			ac.getBean(ObjectD.class).printThreadName();
		}
	}
}
