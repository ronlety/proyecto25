package mx.proyecto.fase1.service;
import mx.proyecto.fase1.model.*;
import java.util.List;

public interface BookService {
	Book saveBook(Book Book);
	List<Book> getAllBooks();
	void deleteBook (String id);
	Book getBookById(String id);
	Book updateBook(Book book, String id);
}
