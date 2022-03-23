package com.workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class junitTest {

    @Test
    void myFirstTest() {
        int meineLieblingszahl = 43;

        assertEquals(42, meineLieblingszahl);
    }
}
