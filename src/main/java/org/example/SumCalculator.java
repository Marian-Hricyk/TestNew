package org.example;

public class SumCalculator {
  public int sum(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("n має бути невід'ємним числом");

    }
    int total = 0;
    for (int i = 1; i <= n; i++) {
      total += i;
    }
    return total;
  }
}
