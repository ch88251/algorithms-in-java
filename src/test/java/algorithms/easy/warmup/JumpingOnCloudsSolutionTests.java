package algorithms.easy.warmup;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Feature("Warm-up Challenges")
@DisplayName("Jumping On Clouds Solution Tests")
public class JumpingOnCloudsSolutionTests {

  @ParameterizedTest(name = "Input: {0}, Output: {1}")
  @MethodSource("testDataProvider")
  public void countingValleys(List<Integer> data, int expected) {
    int[] d = new int[data.size()];
    for (int i = 0; i < data.size(); i++) {
      d[i] = data.get(i);
    }
    int actual = JumpingOnCloudsSolution.jumpingOnClouds(d);
    assertThat(actual).isEqualTo(expected);
  }

  private static Stream<Arguments> testDataProvider() {
    return Stream.of(
        arguments(Arrays.asList(1,0,1,0,0,1,1), 0),
        arguments(Arrays.asList(0), 0),
        arguments(Arrays.asList(1), 0),
        arguments(Arrays.asList(0,0,0,0,0,0,0,0,0,0), 5),
        arguments(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0), 5)
//        arguments(Arrays.asList(0,0,1,0,0,1,0,0,1,0,0), 7)
//        arguments(Arrays.asList(0,0,0,1,0,0,0,1,0,0,0,1,0,0), 7),
//        arguments(Arrays.asList(0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0), 10),
//        arguments(Arrays.asList(0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0), 0)
    );
  }

}

