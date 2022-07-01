package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import java.io.OptionalDataException;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findArrayLenght() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 11;
        long actual = incomesInBillions.length;

        assertEquals(expected, actual);
    }
    @Test
    void findMaxInANewArray() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};

        long expected = 13;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}