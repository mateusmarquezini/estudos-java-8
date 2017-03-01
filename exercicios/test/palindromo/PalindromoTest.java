package palindromo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by mmn on 01/03/17.
 */
public class PalindromoTest {

    private Solution palindromeSolution;

    @BeforeEach
    public void setUp() {

	palindromeSolution = new Solution();

    }

    @Test
    public void testSePalavraEhPalindrome() {

	String[] arrayStrings = new String[] { "OSSO", "AMA", "OVO", "ASA", "RAMAR", "ARARA", "RACIFICAR", "REVIVER", "SOCOS" };

	for (final String arrayString : arrayStrings) {
	    final boolean expected = palindromeSolution.isPalindromeWord(arrayString);
	    final String message = "A palavra inserida, não é considerada palindrome!";
	    Assertions.assertTrue(expected, message);
	}

    }

}
