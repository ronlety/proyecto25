package mx.proyecto.fase1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import mx.proyecto.fase1.model.*;
import mx.proyecto.fase1.service.*;
import java.util.List;
 
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService BookService;

    @PostMapping("/add")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<Book>(BookService.saveBook(book), HttpStatus.CREATED);
    }
    //GetAll Rest Api
    @GetMapping
    public List<Book> getAllBook(){
        return BookService.getAllBooks();
    }

    //Get by Id Rest Api
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") String id){
        return new ResponseEntity<Book>(BookService.getBookById(id),HttpStatus.OK);
    }

    //Update Rest Api
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") String id, @RequestBody Book book){
        return new ResponseEntity<Book>(BookService.updateBook(book,id),HttpStatus.OK);
    }

    //Delete Rest Api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") String id){
        //delete employee from db
        BookService.deleteBook(id);
        return new ResponseEntity<String>("Book deleted Successfully.",HttpStatus.OK);
    }
}
