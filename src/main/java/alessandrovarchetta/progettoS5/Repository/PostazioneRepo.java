package alessandrovarchetta.progettoS5.Repository;

import alessandrovarchetta.progettoS5.Entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneRepo extends JpaRepository<Postazione, Long> {
}
