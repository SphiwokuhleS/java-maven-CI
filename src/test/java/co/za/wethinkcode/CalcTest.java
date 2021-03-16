package co.za.wethinkcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    public void TestAdd(){
        Calc add = new Calc();
        assertEquals(5, add.add(3,2));
    }

    @Test
    public void TestIt(){
        Mult mult  = new Mult();
        assertEquals(8, mult.multiplication(2,4));
    }


}