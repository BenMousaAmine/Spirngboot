package com.example.firstApp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String publisherName ;
    private String  address ;
    private String city ;
    private String state ;
    private String zipCode ;
    // Relazione One To many tra Publisher e book => Su Class Book sara many to one
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>(); //Sempre Iniziare a Creare La set

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String piblisherName) {
        this.publisherName = piblisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
