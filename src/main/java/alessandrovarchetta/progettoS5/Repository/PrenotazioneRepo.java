package alessandrovarchetta.progettoS5.Repository;


import alessandrovarchetta.progettoS5.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Long> {
}
