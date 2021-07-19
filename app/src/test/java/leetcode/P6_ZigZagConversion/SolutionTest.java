package leetcode.P6_ZigZagConversion;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("provideInputs")
  void ZigZagConversion을_성공한다(String input, int numRows, String expected) {
    // when
    String actual = new Solution().convert(input, numRows);

    // then
    assertThat(actual).isNotNull();
    assertThat(actual).isEqualTo(expected);
  }

  private static Stream<Arguments> provideInputs() {
    // given
    return Stream.of(
        Arguments.of(null, 1, ""),
        Arguments.of("", 1, ""),
        Arguments.of("A", 1, "A"),
        Arguments.of("AB", 1, "AB"),
        Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
        Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"));
  }
}
