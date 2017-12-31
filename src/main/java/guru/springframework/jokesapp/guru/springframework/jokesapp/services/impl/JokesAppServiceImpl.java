package guru.springframework.jokesapp.guru.springframework.jokesapp.services.impl;

import guru.springframework.jokesapp.guru.springframework.jokesapp.services.JokesAppService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * This is the implementation of the service interface
 * returns the random quote as string
 * @author PALLAB
 */
@Service
public class JokesAppServiceImpl implements JokesAppService {

    /* This is now created using Spring Java configuration */
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesAppServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }




    @Override
    public String getRandomJokes(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
