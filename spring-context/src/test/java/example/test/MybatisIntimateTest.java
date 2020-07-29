package example.test;

import example.test.Configuration.CustomConfig;
import example.test.CustomAnnotation.AddMapperToSpring;
import example.test.CustomBeanRegister.CutomBeanRegisterScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
public class MybatisIntimateTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(CustomConfig.class);
		ac.refresh();

		CutomBeanRegisterScanner cutomBeanRegisterScanner = new CutomBeanRegisterScanner(ac);
		cutomBeanRegisterScanner.addIncludeFilter(new AnnotationTypeFilter(AddMapperToSpring.class));
		System.out.println("all mapper number: " + cutomBeanRegisterScanner.scan("example.test"));

	}
}
