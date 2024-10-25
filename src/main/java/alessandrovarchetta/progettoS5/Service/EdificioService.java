package alessandrovarchetta.progettoS5.Service;


import alessandrovarchetta.progettoS5.Entities.Edificio;
import alessandrovarchetta.progettoS5.Repository.EdificioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    private final EdificioRepo edificioRepo;

    @Autowired
    public EdificioService(EdificioRepo edificioRepo) {
        this.edificioRepo = edificioRepo;
    }

    public Edificio saveEdificio(Edificio newEdificio) {
        return edificioRepo.save(newEdificio);
    }
}
