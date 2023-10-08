import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest4 {
  private SumCalculator calculator;


  @BeforeEach
  public void setUp() {
    calculator = new SumCalculator();
  }

  @Test
  public void testSumWithPositiveInput() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.sum(0);
    });
    assertEquals(1, calculator.sum(1));
    assertEquals(6, calculator.sum(3));
    assertEquals(15, calculator.sum(5));
  }

  @Test
  public void testIllegalArgumentExceptionWhenNIsNegative() {

    int negativeN = -5;


    assertThrows(IllegalArgumentException.class, () -> calculator.sum(negativeN));
  }

  @Test
  public void testSumWithNegativeInput() {
    assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    assertThrows(IllegalArgumentException.class, () -> calculator.sum(-5));
  }
}
