package net.example;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mbdecke on 3/25/15.
 */
@Component
public class Persistence {

    private Map<String, String> dbMock;

    public Persistence() {
        dbMock = new HashMap<>();
    }

    public void insert(String key, String value) {
        dbMock.put(key, value);
    }

    public String select(String key) {
        return dbMock.get(key);
    }

    public void update(String key, String value) {
        dbMock.replace(key, value);
    }

    public void delete(String key) {
        dbMock.remove(key);
    }

    public List<String> selectAllKeys() {
        return dbMock.keySet().stream().collect(Collectors.toList());
    }
}
