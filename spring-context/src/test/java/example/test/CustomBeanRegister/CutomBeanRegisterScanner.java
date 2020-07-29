package example.test.CustomBeanRegister;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/18
 */
public class CutomBeanRegisterScanner extends ClassPathBeanDefinitionScanner {
	public CutomBeanRegisterScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

	@Override
	public void addIncludeFilter(TypeFilter includeFilter) {
		super.addIncludeFilter(includeFilter);
	}
}
