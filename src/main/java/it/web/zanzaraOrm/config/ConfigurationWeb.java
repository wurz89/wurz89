package it.web.zanzaraOrm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConfigurationWeb {

	@Bean
	public ViewResolver defineResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver ();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
}
