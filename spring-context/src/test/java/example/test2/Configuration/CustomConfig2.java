package example.test2.Configuration;

import example.test2.Object.ObjectA;
import example.test2.Object.ObjectB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
@ComponentScan("example.test2.*")
@Configuration
@EnableAspectJAutoProxy
public class CustomConfig2 {

	@Bean
	public ObjectB objectB() {
		System.out.println("invoke @Bean objectB method");
		return new ObjectB();
	}

	@Bean
	public ObjectA objectA() {
		System.out.println("a before b");
		objectB();
		System.out.println("a after b");
		return new ObjectA();
	}
}
