package example.test.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zongw.lee@gmail.com
 * @since 2020/7/10
 */
@ComponentScan("example.test.*")
@Configuration
//@EnableAsync
public class CustomConfig {
}
