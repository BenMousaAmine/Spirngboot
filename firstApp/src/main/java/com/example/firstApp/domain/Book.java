package com.example.firstApp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String title ;
    private String ISBN ;


    @ManyToOne
    private Publisher publisher ;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }





    //creare relazione tra li due tabelle Book  e author Many to Many  => Su publisher Sara one To Many
    private Set<Author> authors = new HashSet<>() ; // Deve Creare Questa per Primo poi il Suo Get e set
    @ManyToMany
    @JoinTable(
            name="author_book"
            , joinColumns = @JoinColumn(name="book_id")
            , inverseJoinColumns = @JoinColumn(name ="author_id")
    )

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
