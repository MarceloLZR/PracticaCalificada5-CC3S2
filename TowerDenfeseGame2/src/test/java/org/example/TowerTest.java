package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TowerTest {

    @Test
    public void testConstructorValidSymbol() {
        char validSymbol = 'A';
        Tower tower = new Tower(validSymbol);
        assertEquals(validSymbol, tower.getSymbol());
    }

    @Test
    public void testConstructorInvalidSymbol() {
        char invalidSymbol = '@'; // Assuming '@' is considered invalid for this example
        assertThrows(AssertionError.class, () -> {
            new Tower(invalidSymbol);
        });
    }

    @Test
    public void testGetSymbol() {
        char validSymbol = 'B';
        Tower tower = new Tower(validSymbol);
        assertEquals(validSymbol, tower.getSymbol());
    }
}
