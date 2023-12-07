package testPalin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import testPalin.utilities.VérificationPalindromeBuilder;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    static Stream<Arguments> casTestMirror() {
        return Stream.of(
                Arguments.of("test",
                        new LangueFrancaise(),
                        Expressions.Bonjour,
                        Expressions.AuRevoirMatin,
                        7),
                Arguments.of("test",
                        new LangueAnglaise(),
                        Expressions.Hello,
                        Expressions.GoodbyeMorning,
                        7),
                Arguments.of("test",
                        new LangueFrancaise(),
                        Expressions.Bonsoir,
                        Expressions.AuRevoirSoir,
                        19),
                Arguments.of("test",
                        new LangueAnglaise(),
                        Expressions.GoodEvening,
                        Expressions.GoodbyeNight,
                        19),
                Arguments.of("test",
                        new LangueFrancaise(),
                        Expressions.BonneNuit,
                        Expressions.DorsBien,
                        2),
                Arguments.of("test",
                        new LangueAnglaise(),
                        Expressions.GoodAfternoon,
                        Expressions.GoodbyeAfternoon,
                        15),
                Arguments.of("test",
                        new LangueAnglaise(),
                        Expressions.GoodNight,
                        Expressions.SleepTight,
                        2)
        );
    }
    @ParameterizedTest
    @MethodSource("casTestMirror")
    public void testMiroir(String chaîne, LangueInterface langue, String salutation, String auRevoir, int heure) {
        var vérificateur = new VérificationPalindromeBuilder()
                .PourLangue(langue)
                .Build();
        // ETANT DONNE une chaîne n'étant pas un palindrome
        String résultat = vérificateur.Vérifier(chaîne,heure);

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(chaîne)
                .reverse()
                .toString();
        inversion = salutation
                + System.lineSeparator()
                + inversion
                + System.lineSeparator()
                + auRevoir;
        assertEquals(inversion, résultat);
    }

    static Stream<Arguments> casTestPalindrome() {
        return Stream.of(
                Arguments.of(new LangueAnglaise(),
                        Expressions.Hello,
                        Expressions.WellSaid,
                        Expressions.GoodbyeMorning,
                        7),
                Arguments.of(new LangueFrancaise(),
                        Expressions.Bonjour,
                        Expressions.BienDit,
                        Expressions.AuRevoirMatin,
                        7),
                Arguments.of(new LangueAnglaise(),
                        Expressions.GoodEvening,
                        Expressions.WellSaid,
                        Expressions.GoodbyeNight,
                        19),
                Arguments.of(new LangueFrancaise(),
                        Expressions.Bonsoir,
                        Expressions.BienDit,
                        Expressions.AuRevoirSoir,
                        19),
                Arguments.of(new LangueFrancaise(),
                        Expressions.BonneNuit,
                        Expressions.BienDit,
                        Expressions.DorsBien,
                        2),
                Arguments.of(new LangueAnglaise(),
                        Expressions.GoodAfternoon,
                        Expressions.WellSaid,
                        Expressions.GoodbyeAfternoon,
                        15),
                Arguments.of(new LangueAnglaise(),
                        Expressions.GoodNight,
                        Expressions.WellSaid,
                        Expressions.SleepTight,
                        2)
        );
    }

    @ParameterizedTest
    @MethodSource("casTestPalindrome")
    public void testPalindrome(LangueInterface langue, String salutation,String félicité, String auRevoir, int heure){
        // ETANT DONNE un palindrome
        String palindrome = "radar";
        var vérificateur = new VérificationPalindromeBuilder()
                .PourLangue(langue)
                .Build();
        // QUAND on vérifie si c'est un palindrome
        String résultat = vérificateur.Vérifier(palindrome,heure);

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = salutation
                        + System.lineSeparator()
                        + palindrome
                        + System.lineSeparator()
                        + félicité
                        + System.lineSeparator()
                        + auRevoir;
        assertEquals(attendu, résultat);
    }
}