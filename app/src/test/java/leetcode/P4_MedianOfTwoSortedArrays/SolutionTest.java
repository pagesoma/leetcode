package leetcode.P4_MedianOfTwoSortedArrays;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("provideInputs")
  void MedianOfTwoSortedArrays를_성공한다(int[] x, int[] y, double expected) {
    // when
    double actual = new Solution().findMedianSortedArrays(x, y);

    // then
    assertThat(actual).isEqualTo(expected);
  }

  private static Stream<Arguments> provideInputs() {
    // given
    return Stream.of(
        Arguments.of(new int[]{}, new int[]{1}, 1)
        ,Arguments.of(new int[]{2}, new int[]{}, 2)
        ,Arguments.of(new int[]{1,3}, new int[]{2}, 2)
        ,Arguments.of(new int[]{1,2}, new int[]{3,4}, 2.5)
    );
  }
}
