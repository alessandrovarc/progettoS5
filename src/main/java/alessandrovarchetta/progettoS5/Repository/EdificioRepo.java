package alessandrovarchetta.progettoS5.Repository;

import alessandrovarchetta.progettoS5.Entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepo extends JpaRepository <Edificio, Long>{

}
