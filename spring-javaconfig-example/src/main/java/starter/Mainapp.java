package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.HelloStarterBean;
import config.AppConfig;
import event_sample.SimpleService;

public class Mainapp {
	public static void main(String[] args) {
		System.out.println("javaconfig-example configuration");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Bean1 bean1 = (Bean1) context.getBean("bean1");
		// System.out.println(bean1.getBeanName());
		// System.out.println(bean1.getMsg());
		HelloStarterBean helloStarterBean = (HelloStarterBean) context.getBean("helloBean");
		System.out.println("Inner message is - " + helloStarterBean.getMessage());
		System.out.println(helloStarterBean.getBean2().getLongName());
		System.out.println(helloStarterBean.getBean1().getMsg());
		
		SimpleService service = (SimpleService)context.getBean("simpleService");
		service.doService();
		
		((ConfigurableApplicationContext) context).close();

	}

}
