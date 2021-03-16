package co.za.wethinkcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultTest {

    @Test
    void multiplication() {
        Mult mult = new Mult();
        assertEquals(4, mult.multiplication(2,2));
    }
}