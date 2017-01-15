package event_sample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class SimpleService implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;

	public SimpleService() {
		// TODO Auto-generated constructor stub
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		publisher=arg0;

	}
	
	public void doService(){
		System.out.println("In do service...");
		SimpleEvent event  = new SimpleEvent(this, "Service has been set...");
		publisher.publishEvent(event);
		
	}

}
