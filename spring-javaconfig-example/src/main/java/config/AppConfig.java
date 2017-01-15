package config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;

import beans.Bean1;
import beans.Bean2;
import beans.HelloStarterBean;
import beans.HelloWorldBean;

@Configuration
@Import(AppConfigEx.class)
@PropertySource("classpath:app.properties")
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}
	
	private ApplicationContext applicationContext;
	
	@Autowired
	private Environment environment; 
	
	
	@Bean(initMethod="init",destroyMethod="cleanUp")
	@Scope("singleton")
	public Bean2 bean2(){
		return new Bean2("Bean2","Bean2 Message" );
	}
	
	@Bean(name="helloBean")
	public HelloStarterBean helloStarterBean(HelloWorldBean helloWorldBean){
		HelloStarterBean bean =  new HelloStarterBean(helloWorldBean);
		
		bean.setBean1((Bean1)applicationContext.getBean("bean1"));
		bean.setBean2(bean2());
		return bean;
	}
	
	@Bean HelloWorldBean helloWorldBean(){
		HelloWorldBean bean = new HelloWorldBean();
		bean.setMessage("Hello World Bean message");
		return bean;
	}
	@Autowired
	public void setApplicationContext(ApplicationContext context){
		applicationContext = context;
		System.out.println("In set application context");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Environment my name - " + environment.getProperty("myName"));
		System.out.println("messages message is - " +  messageSource().getMessage("message", null, "default",null));
	}
	
	@Bean 
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

}
