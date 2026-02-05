package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        assertEquals(6, app.add(2, 3));
    }
}
