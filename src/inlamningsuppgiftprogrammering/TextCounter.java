package inlamningsuppgiftprogrammering;

public class TextCounter {
//logikklassen räknar rader och tecken

    private int lines;
    private int characters;

    public TextCounter() {
        lines = 0;
        characters = 0;

    }

    public void addText(String text) {
        if (!text.equals("stop")) {
            lines++;
            characters += text.length();
        }
    }

    public int getLines() {
        return lines;
    }

    public int getCharacters() {
        return characters;
    }
}
