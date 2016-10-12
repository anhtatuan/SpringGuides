package annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import annotation.lang.Language;
import annotation.lang.impl.Vietnamese;

/* @Configuration là một annotation, nó được chú thích trên một class, 
 * class này sẽ định nghĩa các Spring BEAN.
 */

/*
 * @ComponentScan - Nói cho Spring các package để tìm kiếm các Spring BEAN
 * khác, Spring sẽ quét (scan) các package đó để tìm kiếm.
 */
@Configuration
@ComponentScan({ "annotation.bean" })
public class AppConfiguration {
	
	@Bean(name = "language")
	public Language getLanguage() {
		return new Vietnamese();
	}
}
