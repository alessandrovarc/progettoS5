package alessandrovarchetta.progettoS5.Service;

import alessandrovarchetta.progettoS5.Entities.Edificio;
import alessandrovarchetta.progettoS5.Entities.Utente;
import alessandrovarchetta.progettoS5.Repository.UtenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServic3e {

    private final UtenteRepo utenteRepo;

    @Autowired
    public UtenteServic3e(UtenteRepo utenteRepo) {
        this.utenteRepo = utenteRepo;
    }

    public Utente saveUtente(Utente newUtente) {
        return utenteRepo.save(newUtente);
    }
}
