package example.test2.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/28
 */
// 切面
@Component
@Aspect
public class MyAspect {

	// 织入 指的是 将建议放入切点中的过程

	// 切点 - pointcut
	@Pointcut("execution(public void example.test2.Object.*.*(..))")
	private void execAny() {
	}

	@Pointcut("args(java.lang.String)")
	private void execContainsString() {
	}

	// 切点集合

	// 执行逻辑的地方 - advice 以及执行时机
	@Before("execAny()")
	public void accessCheck() {
		System.out.println("Object Access Check");
	}

	@Around("execContainsString()")
	public Object logString(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before call " + joinPoint.getSignature().getName() + ", it contains string args method");
		Object o = joinPoint.proceed();
		System.out.println("after call" + joinPoint.getSignature().getName() + ", it contains string args method");
		return o;
	}
}
