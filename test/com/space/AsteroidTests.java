package com.space;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AsteroidTests {
    // fixtures
    Asteroid asteroid;

    @Before
    public void setUp() {
        asteroid = new Asteroid(AsteroidSize.LARGE, 0, 0, 0, 0);
    }

    // split() tests
    @Test
    public void split_shouldReturnList_whenMethodCalled() {
        List<Asteroid> asteroids = asteroid.split();
        assertEquals(2, asteroids.size());
    }

    @Test
    public void split_shouldReturnAsteroidMedium_whenLargeAsteroidSplits() {
        List<Asteroid> asteroids = asteroid.split();
        assertEquals(asteroids.get(0).size, AsteroidSize.MEDIUM);
    }

    @Test
    public void split_shouldReturnAsteroidSmall_whenMediumAsteroidSplits() {
        List<Asteroid> asteroidsMed = asteroid.split();
        List<Asteroid> asteroidsSmall = asteroidsMed.get(0).split();
        assertEquals(asteroidsSmall.get(0).size, AsteroidSize.SMALL);
    }
}
