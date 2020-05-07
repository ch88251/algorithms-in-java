package algorithms.easy.warmup;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Feature("Warm-up Challenges")
public class CountingValleysSolutionTests {

  @ParameterizedTest(name = "Counting Valleys")
  @MethodSource("testDataProvider")
  public void countingValleys(String data, int steps, int expected) {
    int numValleys = CountingValleysSolution.countingValleys(steps, data);
    assertThat(numValleys).isEqualTo(expected);
  }

  private static Stream<Arguments> testDataProvider() {
    return Stream.of(
        Arguments.of("", 0, 0),
        Arguments.of("U", 1, 0),
        Arguments.of("D", 1, 0),
        Arguments.of("UUUUUU", 6, 0),
        Arguments.of("DDDDDD", 6, 0),
        Arguments.of("UUUDDD", 6, 0),
        Arguments.of("DDDUUU", 6, 1),
        Arguments.of("DUDUDUDUDUDU", 12, 6),
        Arguments.of("UDUDUDUDUDUD", 12, 0),
        Arguments.of("DDDUUUDDDUUU", 12, 2),
        Arguments.of("UUUDDDUUUDDD", 12, 0),
        Arguments.of("UUUDDDDDDUUU", 12, 1),
        Arguments.of("UUUDDDDDDUUUDUDU", 16, 3),
        Arguments.of("DDUUDDUDUUUD", 12, 2),
        Arguments.of("1D2U3D4U", 8, 0),
        Arguments.of("DDUUUUDD", 8, 1),
        Arguments.of("UDUDDUUUDUDUDU", 14, 1)
    );
  }

}

