package beans;

public class Bean1 {
	private String bean1Name;
	private String msg;

	public Bean1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bean1(String bean1Name) {
		super();
		this.bean1Name = bean1Name;
	}
	
	public String getBeanName(){
		return bean1Name;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
