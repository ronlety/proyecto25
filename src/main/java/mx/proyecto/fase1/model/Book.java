package mx.proyecto.fase1.model;


	// Java Program to illustrate Book File
	 
	// Importing required classes
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import org.springframework.data.annotation.Id;
	import org.springframework.data.annotation.Transient;
	import org.springframework.data.mongodb.core.mapping.Document;
	 
	// Annotations
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Document(collection = "Book")
	 
	// Class
	public class Book 
	{
	 
		@Transient
	    public static final String SEQUENCE_NAME = "users_sequence";
	    // Attributes
	    @Id 
	    private String id;
	    private String nameBook;
	    private String authorBook;
		 
	}

	
