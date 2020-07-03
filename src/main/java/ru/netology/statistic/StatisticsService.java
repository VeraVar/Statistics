package ru.netology.statistic;

public class StatisticsService {

  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    for (long income : incomes)
      if (current_max < income)
        current_max = income;
    return current_max;
  }

  public long findMin(long[] incomes) {
    long current_min_index = 0;
    long current_min = incomes[0];
    for (long income : incomes)
      if (current_min > income)
        current_min = income;
    return current_min;
  }

  public long findSum(long[] incomes){
    long sum = 0;
    for (long income : incomes) {
      sum += income;
    }
    return sum;
  }

  public long findAverage(long[] incomes){
    long average = findSum(incomes) / incomes.length;

    return average;
  }
}
