package example.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import example.test.Configuration.CustomConfig;
import example.test.CustomAnnotation.ZW;
import example.test.Object.ObjectA;
import example.test.Object.ObjectB;
import example.test.Object.ObjectC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(CustomConfig.class);
//		ac.scan("example.test.*");
		ac.refresh();
		ObjectA a = ac.getBean(ObjectA.class);
		System.out.println(a);

		System.out.println("ObjectC : " + ac.getBean(ObjectC.class));

		customAnnotation(a);

		ac.close();

//		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring-test.xml");
//		System.out.println(c.getBean(ObjectA.class));
	}

	private static void customAnnotation(ObjectA a) {
		// 自定义注解解析, 只要方法上有zw注解，就会调用这个方法，并传b设置 b属性
		Method[] methods = a.getClass().getMethods();
		ObjectB b = new ObjectB();
		for (Method method : methods) {
			if (method.getAnnotation(ZW.class) != null) {
				b.setName(method.getAnnotation(ZW.class).bName());
				System.out.println("invoke method" + method.getName());
				try {
					method.invoke(a, b);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				System.out.println("end invoke method , " + method.getName() + "set b to a");
			}
		}
		System.out.println("bname: " + a.getB().getName());
	}
}
