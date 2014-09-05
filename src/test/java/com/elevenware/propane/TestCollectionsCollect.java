package com.elevenware.propane;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class TestCollectionsCollect {

    @Test
    public void canCollectArbitraryObjectsFromCollection() {

        String[] strings = {"foo", "bar", "baz", "wibble"};
        List<Thing> things = new ArrayList<Thing>();
        for(String string: strings) {
            things.add(new Thing(string));
        }

        Collection<String> collected = CollectionUtils.wrap(things).collect(new Collector<Thing, String>() {
            @Override
            public String doCollect(Thing input) {
                return input.getString();
            }
        });

        String[] collectedStrings = collected.toArray(new String[0]);

        assertArrayEquals(strings, collectedStrings);


    }

}

