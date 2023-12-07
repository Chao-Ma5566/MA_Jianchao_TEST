package testPalin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import testPalin.utilities.VérificationPalindromeBuilder;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroirBonjour(String chaîne) {
        LangueFrancais langue = new LangueFrancais();
        var vérificateur = new VérificationPalindromeBuilder()
                .PourLangue(langue)
                .Build();
        // ETANT DONNE une chaîne n'étant pas un palindrome
        String résultat = vérificateur.Vérifier(chaîne,7);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();
        inversion = Expressions.Bonjour
                + System.lineSeparator()
                + inversion
                + System.lineSeparator()
                + Expressions.AuRevoirMatin;
        assertEquals(inversion, résultat);
    }

    @Test
    public void testPalindromeBonjour(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        LangueFrancais langue = new LangueFrancais();
        // QUAND on vérifie si c'est un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(palindrome,7);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = Expressions.Bonjour
                        + System.lineSeparator()
                        + palindrome
                        + System.lineSeparator()
                        + Expressions.BienDit
                        + System.lineSeparator()
                        + Expressions.AuRevoirMatin;
        assertEquals(attendu, résultat);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroirHello(String chaîne) {
        LangueAnglaise langue = new LangueAnglaise();
        // ETANT DONNE une chaîne n'étant pas un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(chaîne,7);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();
        inversion = Expressions.Hello
                + System.lineSeparator()
                + inversion
                + System.lineSeparator()
                + Expressions.GoodbyeMorning;
        assertEquals(inversion, résultat);
    }

    @Test
    public void testPalindromeHello(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        LangueAnglaise langue = new LangueAnglaise();
        // QUAND on vérifie si c'est un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(palindrome,7);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = Expressions.Hello
                + System.lineSeparator()
                + palindrome
                + System.lineSeparator()
                + Expressions.WellSaid
                + System.lineSeparator()
                + Expressions.GoodbyeMorning;
        assertEquals(attendu, résultat);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroirBonsoir(String chaîne) {
        LangueFrancais langue = new LangueFrancais();
        // ETANT DONNE une chaîne n'étant pas un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(chaîne,19);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();
        inversion = Expressions.Bonsoir
                + System.lineSeparator()
                + inversion
                + System.lineSeparator()
                + Expressions.AuRevoirSoir;
        assertEquals(inversion, résultat);
    }

    @Test
    public void testPalindromeBonsoir() {
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        LangueFrancais langue = new LangueFrancais();
        // QUAND on vérifie si c'est un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(palindrome,19);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = Expressions.Bonsoir
                + System.lineSeparator()
                + palindrome
                + System.lineSeparator()
                + Expressions.BienDit
                + System.lineSeparator()
                + Expressions.AuRevoirSoir;
        assertEquals(attendu, résultat);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroirGoodnight(String chaîne) {
        LangueAnglaise langue = new LangueAnglaise();
        // ETANT DONNE une chaîne n'étant pas un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(chaîne,19);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();
        inversion = Expressions.GoodEvening
                + System.lineSeparator()
                + inversion
                + System.lineSeparator()
                + Expressions.GoodbyeNight;
        assertEquals(inversion, résultat);
    }
    @Test
    public void testPalindromeGoodnight() {
        // ETANT DONNE un palindrome.
        String palindrome = "radar";
        LangueAnglaise langue = new LangueAnglaise();
        // QUAND on vérifie si c'est un palindrome
        String résultat = new VérificationPalindrome(langue).Vérifier(palindrome,19);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = Expressions.GoodEvening
                + System.lineSeparator()
                + palindrome
                + System.lineSeparator()
                + Expressions.WellSaid
                + System.lineSeparator()
                + Expressions.GoodbyeNight;
        assertEquals(attendu, résultat);
    }
}