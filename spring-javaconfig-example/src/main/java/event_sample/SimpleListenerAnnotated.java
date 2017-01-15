package event_sample;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

public class SimpleListenerAnnotated {

	public SimpleListenerAnnotated() {
		System.out.println("Annotated created...");
	}
	
	@EventListener
	@Async
	@Order(60)
	public void onApplicationEvent(SimpleEvent simpleEvent) {
		System.out.println("I was annotated - notified with message - " + simpleEvent.getEventMessage());
		
	}

}
