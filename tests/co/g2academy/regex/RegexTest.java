package co.g2academy.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class RegexTest {

    @Test
    public void testSingleCharacterRegexUsingIterativeCode() {
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterRegexUsingChainingCode() {
        assertTrue(Pattern.compile(".s").matcher("as").matches());
    }

    @Test
    public void testSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches(".s", "as"));
    }

    @Test
    public void testMatchOneCharacterInBracket() {
        assertTrue(Pattern.matches("[abc]", "a")); //match dengan semua karakter yg ada dikurung kotak dan hanya bisa diisi oleh 1 karakter
    }

    @Test
    public void testMatchZeroOrOneCharacterInBracket() {
        assertTrue(Pattern.matches("[abc]?", ""));//(?) tanda tanya artinya bisa diisi 1 karakter atau tidak sama sekali
    }

    @Test
    public void testMatchWithRangeInBracket() {
        assertTrue((Pattern.matches("[A..Z]", "A")));//(..) artinya range, sehingga hanya bisa masuk 1 karakter
    }

    @Test
    public void testMatchZeroOrManyCharacterInBracket() {
        assertTrue(Pattern.matches("[abc]*", "aaaaaabbbcccc")); //(*) bintang artinya boleh tidak diisi karakter apapun dan jika diisi, jumlah karakter tidak tebatas
    }

    @Test
    public void testMatchOneOrManyCharacterInBracket() {
        assertTrue(Pattern.matches("[abc]+", "aaaaaaaabbcc")); //(+) plus artinya minimal diisi 1 karakter dan jumlahnya tidak terbatas
    }
}
