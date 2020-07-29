package example.test2;

import example.test2.Object.ObjectA;
import example.test2.Configuration.CustomConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(CustomConfig2.class);
		ac.refresh();
		ObjectA a = ac.getBean(ObjectA.class);
		System.out.println(a);
		a.setXxx("xxx");

		ac.close();
	}
}
