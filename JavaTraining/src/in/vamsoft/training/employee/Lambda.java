package in.vamsoft.training.employee;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class Book {
  int bookId;
  String author;
  String title;
  double price;

  public Book(int bookId, String author, String title, double price) {
    super();
    this.bookId = bookId;
    this.author = author;
    this.title = title;
    this.price = price;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + ", price=" + price + "]";
  }
  

}

public class Lambda {

  public static void main(String[] args) {
    Book obj = new Book(1, "Origin", "Dan Brown", 400.00);
    Book obj1 = new Book(2, "ponn", "Dan ", 600.00);
    Book obj2 = new Book(3, "Two Star", "Raj Brown", 700.00);
    Book obj3 = new Book(4, "Daddy", "Brown", 500.00);

    List<Book> books = Arrays.asList(obj, obj1, obj2, obj3);

    Collections.sort(books, (Book obj11, Book obj12) -> {
      return obj11.getTitle().compareTo(obj12.getTitle());
    });

    System.out.println(books);

    Collections.sort(books, (obj11, obj12) -> obj11.getAuthor().compareTo(obj12.getAuthor()));

    System.out.println(books);

  }

}
