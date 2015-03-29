package net.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mbdecke on 3/25/15.
 */
@Component
public class Service {

    @Autowired
    Persistence persistence;

    public List<String> getDeadrops() {
        return persistence.selectAllKeys();
    }

    public void addDeadDrop(String key, String value) {
        persistence.insert(key, value);
    }

    public String getMessage(String name) {
        return persistence.select(name);
    }

    public void setMessage(String key, String value) {
        persistence.update(key, value);
    }

    public void removeDeadDrop(String name) {
        persistence.delete(name);
    }
}
