package testPalin.command;

import testPalin.LangueInterface;
import testPalin.VérificationPalindrome;

import java.util.Scanner;

import static testPalin.LangueSystem.getSystemLangue;
import static testPalin.VérificationPalindrome.getHour;

public class Main {
    public static void main(InputReader inputReader) {
        LangueInterface langue = getSystemLangue();
        int heure = getHour();
        
        String userInput = "";

        while (userInput.isEmpty()) {
            System.out.print("Entrez quelque chose : ");
            userInput = inputReader.readInput();

           if (userInput.isEmpty()) {
                System.out.println(langue.ChaineVide());
            }
        }
        var vérificateur = new VérificationPalindrome(langue);
        System.out.println(vérificateur.Vérifier(userInput,heure));
    }
}
