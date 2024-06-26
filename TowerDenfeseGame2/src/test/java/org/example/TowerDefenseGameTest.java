package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

public class TowerDefenseGameTest {

    @Mock
    private Map mockMap;

    @Mock
    private Player mockPlayer;

    @Mock
    private List<Wave> mockWaves;

    @InjectMocks
    private TowerDefenseGame game;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlaceTower() {
        Tower mockTower = mock(Tower.class);
        game.placeTower(mockTower, 2, 2);
        verify(mockMap).placeTower(mockTower, 2, 2);
    }

    @Test
    public void testStartWave() {

    }

    @Test
    public void testGameState() {

    }
}
