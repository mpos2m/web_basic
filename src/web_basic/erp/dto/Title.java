package web_basic.erp.dto;

public class Title {
	private int no;
	private String name;
	
	public Title() {
		// TODO Auto-generated constructor stub
	}
	
	public Title(int no) {
		this.no = no;
	}
	
	public Title(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Title [no=" + no + ", name=" + name + "]";
	}
	
	
}
