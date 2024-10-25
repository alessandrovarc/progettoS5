package alessandrovarchetta.progettoS5.Entities;

import alessandrovarchetta.progettoS5.Entities.Enum.TipoPostazione;
import jakarta.persistence.*;

@Entity
@Table(name = "postazioni")
public class Postazione {

    @jakarta.persistence.Id
    @GeneratedValue
    private Long Id;
    private String description;
    private TipoPostazione type;
    private int n_persone;
    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    public  Postazione(){};

    public Postazione(String description, TipoPostazione type, int n_persone, Edificio edificio) {
        this.description = description;
        this.type = type;
        this.n_persone = n_persone;
        this.edificio = edificio;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TipoPostazione getType() {
        return type;
    }

    public void setType(TipoPostazione type) {
        this.type = type;
    }

    public int getN_persone() {
        return n_persone;
    }

    public void setN_persone(int n_persone) {
        this.n_persone = n_persone;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "Id=" + Id +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", n_persone=" + n_persone +
                ", edificio=" + edificio +
                '}';
    }
}
