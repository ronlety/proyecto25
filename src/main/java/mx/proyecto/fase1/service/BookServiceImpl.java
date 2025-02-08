package mx.proyecto.fase1.service;

import mx.proyecto.fase1.model.*;
import mx.proyecto.fase1.repository.*;
//import mx.proyecto.fase1.service.*;
//import com.proyecto.fase1.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepo BookRepo;
    //@Autowired
    //private SequenceGeneratorService SequenceGeneratorService;

    //save book in database
    @Override
    public Book saveBook(Book Book){
        return BookRepo.save(Book);
      // Book.setId(SequenceGeneratorService.generateSequence(Book.SEQUENCE_NAME));
        //return BookRepo.save(Book);
    }
    
    
    //get all books form database
    @Override
    public List<Book> getAllBooks() {
        return BookRepo.findAll();
    }

    //get book using id
    @Override
    public Book getBookById(String id) {
        Optional<Book> book =  BookRepo.findById(id);
        if(book.isPresent()){
            return book.get();
        }else {
            throw new RuntimeException();
        }
    }

    //update book
    @Override
    public Book updateBook(Book book, String id) {
        Book existingBook = BookRepo.findById(id).orElseThrow(RuntimeException::new);
        existingBook.setNameBook(book.getNameBook());
        existingBook.setAuthorBook(book.getAuthorBook());
        existingBook.setId(book.getId());
        // save
        BookRepo.save(existingBook);
        return existingBook;
    }

    //delete book
    @Override
    public void deleteBook(String id) {
        //check
        BookRepo.findById(id).orElseThrow(RuntimeException::new);
        //delete
        BookRepo.deleteById(id);
    }

	
}
