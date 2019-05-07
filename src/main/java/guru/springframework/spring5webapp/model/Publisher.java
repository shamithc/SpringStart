package guru.springframework.spring5webapp.model;

import javax.persistence.*;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToOne(mappedBy = "publisher")
    private Book book;

    public Publisher(){

    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
