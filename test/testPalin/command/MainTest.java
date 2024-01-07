package testPalin.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testPalin.utilities.MockInputReader;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    //J'ai pas réussi à faire HeureProvider et LangueProvider
    //Donc J'ai simplement écrit un test pour system langue en francais et pour soir
    @Test
    void testMainWithNonEmptyInput() {
        // Arrange
        InputReader mockInputReader = new MockInputReader("testInput"); // Simule une entrée non vide
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Act
        Main.main(mockInputReader);

        // Assert
        // Remettez la sortie système à la normale
        System.setOut(System.out);
        String expectedOutput = "Entrez quelque chose : Bonsoir !" + System.lineSeparator() +
                "tupnItset" + System.lineSeparator() +
                "Bonne soirée, au revoir !" + System.lineSeparator();
        Assertions.assertEquals(expectedOutput, outputStream.toString());
    }
}