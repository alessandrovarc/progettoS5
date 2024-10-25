package alessandrovarchetta.progettoS5.Service;

import org.springframework.beans.factory.annotation.Autowired;

public class PrenotazioneService {

    private final PrenotazioneService prenotazioneService;


    @Autowired
    public PrenotazioneService(PrenotazioneService prenotazioneService) {
        this.prenotazioneService = prenotazioneService;
    }
}
