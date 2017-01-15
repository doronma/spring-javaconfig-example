package event_sample;

import org.springframework.context.ApplicationListener;

public class SimpleListener implements ApplicationListener<SimpleEvent> {

	public SimpleListener() {
		// TODO Auto-generated constructor stub
	}

	public void onApplicationEvent(SimpleEvent simpleEvent) {
		System.out.println("I was notified with message - " + simpleEvent.getEventMessage());
		
	}

}
