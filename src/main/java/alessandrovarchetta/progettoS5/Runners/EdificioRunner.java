package alessandrovarchetta.progettoS5.Runners;

import alessandrovarchetta.progettoS5.Entities.Edificio;
import alessandrovarchetta.progettoS5.Service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EdificioRunner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Override
    public void run(String... args) throws Exception {

        //Edificio ed = new Edificio("Centro Direzionale", "piazza Garibaldi", "Napoli");
        //edificioService.saveEdificio(ed);
    }
}
