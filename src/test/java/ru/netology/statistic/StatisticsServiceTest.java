package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  StatisticsService service = new StatisticsService();
  long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

  @Test
  void shouldFindMax(){
    long expected = 12;

    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void shouldFindMin(){
    long expected = 3;

    long actual = service.findMin(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void shouldFindSum(){
    long expected = 85;

    long actual = service.findSum(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void shouldFindAverage(){
    long expected = 7;
    long actual = service.findAverage(incomesInBillions);

    assertEquals(expected, actual);
  }
}