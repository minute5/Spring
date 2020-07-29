package example.test;

import example.test.Configuration.CustomConfig;
import example.test.Interceptor.MyMethodInterceptor;
import example.test.Object.ObjectE;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/26
 */
public class EnhancerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(CustomConfig.class);
//		a.refresh();

		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(new MyMethodInterceptor());
		enhancer.setSuperclass(ObjectE.class);
		ObjectE proxyE = (ObjectE) enhancer.create();
		System.out.println(proxyE.getName());
	}

}
