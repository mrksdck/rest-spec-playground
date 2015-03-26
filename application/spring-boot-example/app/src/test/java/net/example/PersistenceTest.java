package net.example;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import static java.lang.Boolean.FALSE;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

/**
 * Created by mbdecke on 3/25/15.
 */
public class PersistenceTest {

    Persistence persistence = new Persistence();

    @Test
    public void insertKeyValue(){
        persistence.insert("test key", "something to test");
        assertThat(persistence.selectAllKeys(), hasItem("test key"));
    }

    @Test
    public void insertWithBlankValue(){
        persistence.insert("test key", "");
        assertThat(persistence.selectAllKeys(), hasItem("test key"));
    }

    @Test
    public void insertNullValue(){
        persistence.insert("test key", null);
        assertThat(persistence.selectAllKeys(), hasItem("test key"));
    }

    @Test
    public void updateValueOfKey(){
        persistence.insert("test key", "something to test");
        persistence.update("test key", "alternative text");
        assertThat(persistence.select("test key"), equalTo("alternative text"));
    }

    @Test
    public void noUpdateOfValueWithNotExistingKey(){
        persistence.update("test key", "alternative text");
        assertThat(persistence.select("test key"), nullValue());
    }

    @Test
    public void updateValueWithNull(){
        persistence.insert("test key", "something to test");
        persistence.update("test key", null);
        assertThat(persistence.select("test key"), nullValue());
    }

}