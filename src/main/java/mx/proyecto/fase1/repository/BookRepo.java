package mx.proyecto.fase1.repository;

//Java Program to Illustrate BookRepo File
import java.util.Optional;
import mx.proyecto.fase1.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo
 extends MongoRepository<Book, String> {
	
	Optional<Book> findAllById(String id);
}
