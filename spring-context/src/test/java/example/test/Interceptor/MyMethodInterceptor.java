package example.test.Interceptor;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/26
 */
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("before invoke proxy");
		String objectE = (String) methodProxy.invokeSuper(o, null);
		System.out.println("after invoke proxy");
		return objectE + "$EnhancedByMyMethod";
	}
}
