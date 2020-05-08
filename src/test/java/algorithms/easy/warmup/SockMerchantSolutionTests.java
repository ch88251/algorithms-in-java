package algorithms.easy.warmup;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@Feature("Warm-up Challenges")
@DisplayName("Sock Merchant Solution Tests")
public class SockMerchantSolutionTests {

  @ParameterizedTest(name = "Given an array of integers {0}, there should be {1} pairs of socks")
  @MethodSource("sockMerchantProvider")
  void twoSumProblem(List<Integer> intList, int numPairs) {
    int[] data = new int[intList.size()];
    for (int i = 0; i < intList.size(); i++) {
      data[i] = intList.get(i);
    }
    int actual = SockMerchantSolution.sockMerchant(numPairs, data);
  }

  static Stream<Arguments> sockMerchantProvider() {
    return Stream.of(
        arguments(Arrays.asList(1,1,2,3), 3),
        arguments(Arrays.asList(1,2,3,4,4), 4),
        arguments(Arrays.asList(2,3,4), 3),
        arguments(Arrays.asList(2,2,2), 1),
        arguments(Arrays.asList(2), 1)
    );
  }

}
