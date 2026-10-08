package inlamningsuppgiftprogrammering;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCounterTest {

    @Test
    public void testOneLineIsCounted(){
        //Arrange
        TextCounter counter = new TextCounter();
        //Act
        counter.addText("Hello");
        int actual = counter.getLines();
        //Assert
        assertEquals(1, actual);

    }
    @Test
    public void testFiveCharactersAreCounted(){
        TextCounter counter = new TextCounter();

        counter.addText("Hello");
        int actual = counter.getCharacters();

        assertEquals(5, actual);
    }

    @Test
    public void testStopIsNotCounted(){
        TextCounter counter = new TextCounter();

        counter.addText("stop");
        int actual = counter.getLines();

        assertEquals(0, actual);
    }
}
