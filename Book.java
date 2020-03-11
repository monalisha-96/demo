package library;

public class Book {
private String name,author,callno;

public Book(String name, String author, String callno) {
	//super();
	this.name = name;
	this.author = author;
	this.callno = callno;
}

public Book() {
	//super();
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

public String getCallno() {
	return callno;
}

public void setCallno(String callno) {
	this.callno = callno;
}
public String toSring()
{
	return name+' '+author+' '+callno;
}
}
