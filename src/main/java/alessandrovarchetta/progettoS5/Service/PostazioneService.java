package alessandrovarchetta.progettoS5.Service;

import org.springframework.beans.factory.annotation.Autowired;

public class PostazioneService {

    private  final PostazioneService postazioneService;

    @Autowired
    public PostazioneService(PostazioneService postazioneService) {
        this.postazioneService = postazioneService;
    }
}
