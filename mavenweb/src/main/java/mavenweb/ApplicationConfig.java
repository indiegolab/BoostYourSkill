package mavenweb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author DBInc
 * 이 클래스의 목적:
 *
 *
 */

@Configuration
@Import({DBConfig.class})
public class ApplicationConfig {

}
