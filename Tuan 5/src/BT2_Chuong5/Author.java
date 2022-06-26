package BT2_Chuong5;

public abstract class Author {
	private String name;
	private String email;

	public Author() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void nhap();

	public abstract void hienThi(Author[] authors);
}
