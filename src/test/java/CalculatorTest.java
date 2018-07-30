import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  void sum_addsTwoNumbers() {
    assertThat(Calculator.sum(1,2)).isEqualTo(3);
  }

}
