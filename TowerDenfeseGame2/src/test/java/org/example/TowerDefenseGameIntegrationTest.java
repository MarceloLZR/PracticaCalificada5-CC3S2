package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TowerDefenseGameIntegrationTest {

    private TowerDefenseGame game;
    private Map map;
    private Player player;
    private List<Wave> waves;

    @BeforeEach
    public void setUp() {
        map = new Map();
        player = new Player();
        waves = new ArrayList<>();
        game = new TowerDefenseGame();
    }

    @Test
    public void testPlaceTowerIntegration() {

    }

    @Test
    public void testStartWaveIntegration() {

    }

    @Test
    public void testGameStateIntegration() {

    }
}
