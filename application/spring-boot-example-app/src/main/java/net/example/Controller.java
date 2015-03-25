package net.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by mbdecke on 3/25/15.
 */
@RestController
@RequestMapping(value = "/dead-drops")
public class Controller {

    @Autowired
    Service service;

    @RequestMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public List<String> getDeadDrops() {
        return service.getDeadrops();
    }

    @RequestMapping(method = POST, value = "/{name}", consumes = APPLICATION_JSON_VALUE)
    public void setDeadDrop(@PathVariable("name") String name, @RequestBody String message) {
        service.addDeadDrop(name, message);
    }

    @RequestMapping(method = GET, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    public String getMessage(@PathVariable("name") String name) {
        return service.getMessage(name);
    }

    @RequestMapping(method = PUT, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    public void setMessage(@PathVariable("name") String name, @RequestBody String message) {
        service.setMessage(name, message);
    }

    @RequestMapping(method = DELETE, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    public void removeDeadDrop(@PathVariable("name") String name) {
        service.removeDeadDrop(name);
    }

}
