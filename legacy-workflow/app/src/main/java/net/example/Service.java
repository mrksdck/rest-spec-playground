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

    public List<DeadDrop> getDeadrops() {
        return persistence.selectAllKeys();
    }

    public DeadDrop getDeadDrop(String name) {
        return persistence.select(name);
    }

    public void setDeadDrop(DeadDrop deadDrop) {
        persistence.update(deadDrop);
    }

    public void removeDeadDrop(String name) {
        persistence.delete(name);
    }
}
