package alessandrovarchetta.progettoS5.Repository;

import alessandrovarchetta.progettoS5.Entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtenteRepo extends JpaRepository<Utente, String> {
}
