import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2,3));
    }
}