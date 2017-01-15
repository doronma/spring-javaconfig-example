package event_sample;

import org.springframework.context.ApplicationEvent;

public class SimpleEvent extends ApplicationEvent {
	
	private String eventMessage;

	public SimpleEvent(Object source,String msg) {
		super(source);
		eventMessage=msg;
	}

	public String getEventMessage() {
		return eventMessage;
	}

	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

}
