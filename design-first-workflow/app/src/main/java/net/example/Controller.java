package net.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    Service  service;

    @RequestMapping(method = GET, value="/",produces = APPLICATION_JSON_VALUE)
    public List<DeadDrop> getDeadDrops() {
        return service.getDeadrops();
    }

    @RequestMapping(method = GET, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    public DeadDrop getDeadDrop(@PathVariable("name") String name) {
        return service.getDeadDrop(name);
    }

    @RequestMapping(method = PUT, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void setDeadDrop(@PathVariable("name") String name, @RequestBody DeadDrop deadDrop) {
        deadDrop.setName(name);
        service.setDeadDrop(deadDrop);
    }

    @RequestMapping(method = DELETE, value = "/{name}", produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeDeadDrop(@PathVariable("name") String name) {
        service.removeDeadDrop(name);
    }

}