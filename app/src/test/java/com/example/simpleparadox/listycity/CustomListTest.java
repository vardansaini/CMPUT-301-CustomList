package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize + 1, list.getCount());
    }

    /*@Test
    public void hasCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        boolean has = list.hasCity(city);
        assertEquals(true, has);
    }

    @Test
    public void deleteTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        list.delete(city);
        assertEquals(0, list.getCount());
    }

    @Test
    public void countCitiesTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        int count = list.countCities();
        assertEquals(1, count);
    }*/
}
