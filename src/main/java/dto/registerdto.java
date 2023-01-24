package dto;

public class registerdto<publlic> {
	String name;
	String writer;
	String pub;
	int isbn;
	int login_id;
	
	public registerdto(String name, String writer, String pub, int isbn, int login_id) {
		super();
		this.name = name;
		this.writer= writer;
		this.pub = pub;
		this.isbn = isbn;
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
}
}
