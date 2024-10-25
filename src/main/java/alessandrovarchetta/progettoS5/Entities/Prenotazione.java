package alessandrovarchetta.progettoS5.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {

    @jakarta.persistence.Id
    @GeneratedValue
    private Long Id;
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    public Prenotazione(){};

    public Prenotazione(LocalDate data, Postazione postazione, Utente utente) {
        this.data = data;
        this.postazione = postazione;
        this.utente = utente;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "Id=" + Id +
                ", data=" + data +
                ", postazione=" + postazione +
                ", utente=" + utente +
                '}';
    }
}
