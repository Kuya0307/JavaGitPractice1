package dto;

public class Book {
	private int id;
	private String name;
	private String writer;
	private String pub;
	private int ISBN;
	private int Login_id;
	public Book(int id,String name,String writer,String pub,int ISBN,int Login_id) {
		super();
		this.id = id;
		this.name = name;
		this.writer = writer;
		this.pub = pub;
		this.ISBN = ISBN;
		this.Login_id = Login_id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getLogin_id() {
		return Login_id;
	}

	public void setLogin_id(int login_id) {
		Login_id = login_id;
	}
}
