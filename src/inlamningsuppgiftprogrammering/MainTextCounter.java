package inlamningsuppgiftprogrammering;

import java.util.Scanner;
//main läser in och skriver ut
public class MainTextCounter {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TextCounter counter = new TextCounter();

        System.out.println("===Texträknaren===");
        System.out.println("***Skriv in valfri text rad för rad. För att avsluta, skriv ordet stop.***");

        String text = scan.nextLine();

        while (!text.equals("stop")) {
            counter.addText(text);
            text = scan.nextLine();
        }

        System.out.println("Antal rader: " + counter.getLines());
        System.out.println("Antal tecken: " + counter.getCharacters());
    }
}