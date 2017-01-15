package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Bean1;
import event_sample.SimpleListener;
import event_sample.SimpleListenerAnnotated;
import event_sample.SimpleService;

@Configuration
public class AppConfigEx {

	public AppConfigEx() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public Bean1 bean1() {
		Bean1 bean1 = new Bean1("Bean1");
		bean1.setMsg("Bean1 Message");

		return bean1;
	}
	
	@Bean
	public SimpleService simpleService(){
		return new SimpleService();
	}
	
	@Bean
	public SimpleListener simpleListener(){
		return new SimpleListener();
	}
	
	@Bean
	public SimpleListenerAnnotated simpleListenerAnnotated(){
		return new SimpleListenerAnnotated();
	}

}
