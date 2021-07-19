package leetcode.P7_ReverseInteger;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("provideInputs")
  void ReverseInteger를_성공한다(int x, int expected) {
    // when
    int actual = new Solution().reverse(x);

    // then
    assertThat(actual).isEqualTo(expected);
  }

  private static Stream<Arguments> provideInputs() {
    // given
    return Stream.of(
        Arguments.of(123, 321),
        Arguments.of(-123, -321),
        Arguments.of(120, 21),
        Arguments.of(0, 0),
        Arguments.of(1534236469, 0));
  }
}
