package beans;

public class Bean2Son extends Bean2 {
	
	private String myname;

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public Bean2Son() {
		
	}

	public Bean2Son(String bean2Name, String anotherField) {
		super(bean2Name, anotherField);
		
	}

}
