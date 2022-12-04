import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {

    @Test
    public void sumTest0() {
        int answer = Arithmetic.sum(25, 25);
        assertEquals(50, answer);
    }

    @Test
    public void sumTest1() {
        int answer = Arithmetic.sum(0, 99);
        assertEquals(99, answer);
    }

    @Test
    public void sumTest2() {
        int answer = Arithmetic.sum(0, -5);
        assertEquals(-5, answer);
    }

    @Test
    public void productTest0() {
        int answer = Arithmetic.product(7, 0);
        assertEquals(0, answer);
    }

    @Test
    public void productTest1() {
        int answer = Arithmetic.product(-11, 1);
        assertEquals(-11, answer);
    }

    @Test
    public void productTest2() {
        int answer = Arithmetic.product(100, 100);
        assertEquals(10000, answer);
    }

    @Test
    public void differenceTest0() {
        int answer = Arithmetic.difference(27, 27);
        assertEquals(0, answer);
    }

    @Test
    public void differenceTest1() {
        int answer = Arithmetic.difference(-1, 10);
        assertEquals(-11, answer);
    }

    @Test
    public void differenceTest2() {
        int answer = Arithmetic.difference(3, 0);
        assertEquals(3, answer);
    }

    @Test
    public void quotientTest0() {
        double answer = Arithmetic.quotient(-9, 1);
        assertEquals(-9, answer, 0.1);
    }

    @Test
    public void quotientTest1() {
        double answer = Arithmetic.quotient(-5, -4);
        assertEquals(1.25, answer, 0.1);
    }

    @Test
    public void quotientTest2() {
        double answer = Arithmetic.quotient(0, 512);
        assertEquals(0, answer, 0.1);
    }
}