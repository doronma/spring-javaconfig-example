package beans;

import java.beans.ConstructorProperties;

public class Bean2 {
	private String bean2Name;
	private String anotherField;
	
	public void init(){
		System.out.println("in init " + getClass().getName());
	}
	
	public void cleanUp(){
		System.out.println("in cleanUp " + getClass().getName());
	}
	
	

	public Bean2() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@ConstructorProperties({"bean2Name","anotherField"})
	public Bean2(String bean2Name, String anotherField) {
		super();
		this.bean2Name = bean2Name;
		this.anotherField = anotherField;
	}



	public String getLongName(){
		return bean2Name + " " + anotherField;
	}

}
