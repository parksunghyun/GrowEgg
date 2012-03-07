public class Circle {
	private float diameter;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public String toString() {
		return "원의 지름 : " + diameter;
	}
}

class Book {
	private String name;
	private String author;
	private String publisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "책이름 : " + name + ", 저자 : " + author + " , 출판사  : " + publisher;
	}
}