package br.com.apisys.sisaluno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="br.com.apisys.sisaluno")
public class ConfigWeb extends WebMvcConfigurerAdapter {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
	viewResolver.setPrefix("/WEB-INF");
	viewResolver.setSuffix(".jsp");
	viewResolver.setViewClass(JstlView.class);
		super.configureViewResolvers(registry);
	}

}
