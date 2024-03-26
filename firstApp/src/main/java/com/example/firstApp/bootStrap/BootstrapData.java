package com.example.firstApp.bootStrap;

import com.example.firstApp.domain.Book;
import com.example.firstApp.domain.Publisher;
import com.example.firstApp.repositories.AuthorRepository;
import com.example.firstApp.repositories.BookRepository;
import com.example.firstApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// bootstarp data si occupa di add dati in db

@Component
public class BootstrapData implements CommandLineRunner {
    private final BookRepository bookRepository ;
    private final AuthorRepository authorRepository ;
    private final PublisherRepository  publisherRepository ;

    public BootstrapData(BookRepository bookRepository , AuthorRepository authorRepository,PublisherRepository  publisherRepository) {
        this.bookRepository = bookRepository ;
        this.authorRepository = authorRepository ;
        this.publisherRepository = publisherRepository ;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bostrap - Start");
        /*
        //Add b1 to bookRepository
        Book b1 = new Book() ;
        b1.setTitle("B1");
        b1.setISBN("B1");
        // posso salvarlo diratemente bookRepository.save(b1);
        Book b1Saved = bookRepository.save(b1); //b1Saved e quello salvato in DB

        //add a1 to author Repository
        Author a1 = new Author();
        a1.setFirstName("Amine");
        a1.setLastName("Ben Moussa");

        Publisher p1 = new Publisher();
        p1.setAddress("Via San Michele 7/b int2");
        p1.setCity("Orzinuovi");
        p1.setState("Italy");
        p1.setZipCode("25034");
        p1.setPublisherName("Editor 1 ");
        Publisher p1Saved = publisherRepository.save(p1);


        //Questa Mostra la relazione Many To one Che abbiamo Creato Tra Publisher e Book
        b1.setPublisher(p1Saved);




        System.out.println("Bostrap - End");
*/
    }
}
