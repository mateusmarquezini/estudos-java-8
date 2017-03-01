package palindromo;

/**
 * Created by mmn on 01/03/17.
 */
public class Solution {

    boolean isPalindromeWord(final String pWord) {

	return pWord.equals(new StringBuilder(pWord).reverse().toString());

    }
}
