package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player();
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, player.getScore(), "Initial score should be 0");
    }

    @Test
    public void testInitialBaseHealth() {
        assertEquals(100, player.getBaseHealth(), "Initial base health should be 100");
    }

    @Test
    public void testSetAndGetScore() {
        player.setScore(0);
        assertEquals(0, player.getScore(), "Score should be 50");
    }

    @Test
    public void testSetAndGetBaseHealth() {
        player.setBaseHealth(100);
        assertEquals(100, player.getBaseHealth(), "Base health should be 75");
    }
}
