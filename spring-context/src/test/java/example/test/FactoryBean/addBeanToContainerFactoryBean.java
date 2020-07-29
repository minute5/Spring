package example.test.FactoryBean;

import example.test.Object.ObjectC;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/16
 */
@Component
public class addBeanToContainerFactoryBean implements FactoryBean {

	@Override
	public Object getObject() throws Exception {
		return new ObjectC();
	}

	@Override
	public Class<?> getObjectType() {
		return ObjectC.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
