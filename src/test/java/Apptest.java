package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testSum() {
        assertEquals(5, App.sum(2, 3));
        assertEquals(0, App.sum(-1, 1));
    }

    @Test
    void testIsEven() {
        assertTrue(App.isEven(2));
        assertFalse(App.isEven(3));
    }

    @Test
    void testGreet() {
        assertEquals("Hello, Alice!", App.greet("Alice"));
        assertEquals("Hello, Bob!", App.greet("Bob"));
    }
}
