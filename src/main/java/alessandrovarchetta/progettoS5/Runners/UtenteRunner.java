package alessandrovarchetta.progettoS5.Runners;

import alessandrovarchetta.progettoS5.Entities.Utente;
import alessandrovarchetta.progettoS5.Service.UtenteServic3e;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UtenteRunner implements CommandLineRunner {

    @Autowired
    private UtenteServic3e utenteServic3e;

    @Override
    public void run(String... args) throws Exception {

        Utente u = new Utente("Paolo", "paolino02","paolo.paolino@gmail.com");
        utenteServic3e.saveUtente(u);
    }
}
