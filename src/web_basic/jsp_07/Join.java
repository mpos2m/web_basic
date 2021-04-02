package web_basic.jsp_07;

public class Join {
	private String id;
	private String pass;
	private String name;
	private int gender;
	private int age;
	private String email;
	
	public Join() {
		// TODO Auto-generated constructor stub
	}

	public Join(String id, String pass, String name, int gender, int age, String email) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Join [id=" + id + ", pass=" + pass + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", email=" + email + "]";
	}
	
	
}
