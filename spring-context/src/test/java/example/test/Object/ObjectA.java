package example.test.Object;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import example.test.CustomAnnotation.ZW;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
@Component
public class ObjectA implements InitializingBean {
	private ObjectB b;
	@Autowired
	private ObjectD d;


	public ObjectB getB() {
		return b;
	}

	@ZW(bName = "changedB")
	public void setXXXXX(ObjectB b) {
		System.out.println("ObjectA set b bean");
		this.b = b;
	}

	@PostConstruct
	private void callBackObjectAInitialize() {
		System.out.println("ObjectA annotation method callBackObjectAInitialize");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ObjectA initializingBean method callBackObjectAInitialize");
	}

	@PreDestroy
	private void close() {
		System.out.println("ObjectA close");
	}

	private void close2() {
		System.out.println("ObjectA close 2");
	}
}
