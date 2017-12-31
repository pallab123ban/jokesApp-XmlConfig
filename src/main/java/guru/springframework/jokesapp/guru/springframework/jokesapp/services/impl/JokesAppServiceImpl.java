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

    /* This is created as final to avoid object creation everytime inside the getRandomJokes method */
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesAppServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getRandomJokes(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
