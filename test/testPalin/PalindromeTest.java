package testPalin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void testMiroir(String chaîne) {
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(chaîne);

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
    public void testPalindrome(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // QUAND on vérifie si c'est un palindrome
        String résultat = VérificationPalindrome.Vérifier(palindrome);

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

    @Test
    public void testSalutationBonjour(){
        // ETANT DONNE c'est matin
        int hour = 7;
        // QUAND on vérifie si il dit la salutation de matin
        String salutation = VérificationPalindrome.GetSalutation(hour);

        String attendu =  Expressions.Bonjour;
        assertEquals(attendu, salutation);
    }
    @Test
    public void testSalutationBonsoir(){
        // ETANT DONNE c'est soir
        int hour = 19;

        String salutation = VérificationPalindrome.GetSalutation(hour);

        String attendu =  Expressions.Bonsoir;
        assertEquals(attendu, salutation);
    }

    @Test
    public void testGetAuRevoirSoir(){
        // ETANT DONNE c'est soir
        int hour = 19;

        String salutation = VérificationPalindrome.GetAuRevoir(hour);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu =  Expressions.AuRevoirSoir;
        assertEquals(attendu, salutation);
    }

    @Test
    public void testGetAuRevoirMatin(){
        // ETANT DONNE c'est soir
        int hour = 7;

        String salutation = VérificationPalindrome.GetAuRevoir(hour);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu =  Expressions.AuRevoirMatin;
        assertEquals(attendu, salutation);
    }
}