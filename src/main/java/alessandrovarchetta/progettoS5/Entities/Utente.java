package alessandrovarchetta.progettoS5.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utenti")
public class Utente {

    @jakarta.persistence.Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String username;
    private String indirizzo_mail;

    public Utente (){};

    public Utente(String name, String username, String indirizzo_mail) {
        this.name = name;
        this.username = username;
        this.indirizzo_mail = indirizzo_mail;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIndirizzo_mail() {
        return indirizzo_mail;
    }

    public void setIndirizzo_mail(String indirizzo_mail) {
        this.indirizzo_mail = indirizzo_mail;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", indirizzo_mail='" + indirizzo_mail + '\'' +
                '}';
    }
}
