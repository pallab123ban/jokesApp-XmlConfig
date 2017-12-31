package guru.springframework.jokesapp.guru.springframework.jokesapp.services.impl;

import guru.springframework.jokesapp.guru.springframework.jokesapp.services.JokesAppService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is the implementation of the service interface
 * returns the random quote as string
 * @author PALLAB
 */
@Service
public class JokesAppServiceImpl implements JokesAppService {

    @Override
    public String getRandomJokes() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
