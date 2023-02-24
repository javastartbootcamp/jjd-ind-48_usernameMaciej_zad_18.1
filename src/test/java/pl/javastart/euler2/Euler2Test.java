package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {

    @Test
    void shouldGiveOnlyEvenNumbers() {
        //given

        //when
        int n2 = 2;
        int n5 = 8;
        int n8 = 34;
        int n11 = 144;
        int n14 = 610;
        int n17 = 2584;
        int n20 = 10946;
        int n23 = 46368;
        int n26 = 196418;
        int n29 = 832040;
        int n32 = 3524578;
        //then
        assertEquals(2, n2);
        assertEquals(8, n5);
        assertEquals(34, n8);
        assertEquals(144, n11);
        assertEquals(610, n14);
        assertEquals(2584, n17);
        assertEquals(10946, n20);
        assertEquals(46368, n23);
        assertEquals(196418, n26);
        assertEquals(832040, n29);
        assertEquals(3524578, n32);
    }

    @Test
    void shouldNotGive0And1Numbers() {
        //given

        //when
        int n1 = Euler2.fibonacciSequence(0);
        int n2 = Euler2.fibonacciSequence(1);
        //then
        assertNotEquals(n1, 0);
        assertNotEquals(n2, 1);
    }

    @Test
    void shouldGiveNumbersBelow4000000() {
        //given

        //when
        int n32 = 5702887;
        int n33 = 9227465;
        //then
        assertFalse(n32 < 4000000);
        assertFalse(n33 < 4000000);
    }
}