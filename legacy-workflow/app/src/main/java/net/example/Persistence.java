package net.example;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.deepToString;

/**
 * Created by mbdecke on 3/25/15.
 */
@Component
public class Persistence {

    private Map<String, DeadDrop> dbMock;

    public Persistence() {
        dbMock = new HashMap<>();
        DeadDrop deadDrop = new DeadDrop();
        deadDrop.setName("abandoned-car");
        deadDrop.setMessage("the eagle has landed");
        dbMock.put("abandoned-car", deadDrop);
    }

    public void insert(DeadDrop deadDrop) {
        dbMock.put(deadDrop.getName(), deadDrop);
    }

    public DeadDrop select(String key) {
        return dbMock.get(key);
    }

    public void update(DeadDrop deadDrop) {
        dbMock.put(deadDrop.getName(), deadDrop);
    }

    public void delete(String key) {
        dbMock.remove(key);
    }

    public List<DeadDrop> selectAllKeys() {
        return new ArrayList<>(dbMock.values());
    }
}
