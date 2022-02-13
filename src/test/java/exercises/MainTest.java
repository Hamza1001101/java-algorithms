package exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    Main main = new Main();

    @Test
    public void newIPAddShouldReturnAPWithRemovedLeadingZeros() {
        assertThat(main.newIPAdd("100.020.003.400")).isEqualTo("100.20.3.400");
        assertThat(main.newIPAdd("100.000.010.0999")).isEqualTo("100.0.10.999");
        assertThat(main.newIPAdd("4.484.071.712218.6829.32313727396.08046.00")).isEqualTo("4.484.71.712218.6829.32313727396.8046.0");
    }

    @Test
    public void primeRangeShouldReturnPrimeNumbersInThatRange() {
        assertThat(main.primeRange(1, 10)).containsExactly(2, 3, 5, 7);
        assertThat(main.primeRange(2, 5)).containsExactly(2, 3, 5);
    }

    @Test
    public void arrangeStringShouldSortStringLexicographically() {
        assertThat(main.arrangeString("AC2BEW3")).isEqualTo("ABCEW5");
        assertThat(main.arrangeString("ACCBA10D2EW30")).isEqualTo("AABCCDEW6");
    }

    @Test
    public void reverseWordsShouldReverseStrings() {
        assertThat(main.reverseWords("i.like.this.program.very.much")).isEqualTo("much.very.program.this.like.i");
        assertThat(main.reverseWords("pqr.mno")).isEqualTo("mno.pqr");
    }

    @Test
    public void gadgetsOfDoralandShouldReturnFrequentCustomers() {
        ArrayList<Integer> expectedList1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3));
        ArrayList<Integer> expectedList2 = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4));

        assertThat(main.topK(expectedList1, 2)).containsExactly(1, 2);
        assertThat(main.topK(expectedList2, 2)).containsExactly(3, 2);
    }

    @Test
    public void binaryToDecimalShouldReturnEquivalentDecimal() {
        assertThat(main.binaryToDecimal("10001000")).isEqualTo(136);
        assertThat(main.binaryToDecimal("101100")).isEqualTo(44);
    }
}