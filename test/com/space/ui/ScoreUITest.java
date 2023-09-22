package com.space.ui;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreUITest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addScore_shouldReturnTotalScore_whenScoreAdded() {
        ScoreUI.addScore(50);
        assertEquals(50, ScoreUI.score);
        ScoreUI.addScore(150);
        assertEquals(200, ScoreUI.score);
    }
}