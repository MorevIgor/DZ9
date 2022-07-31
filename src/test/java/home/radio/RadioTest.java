package home.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void correctOverMaxParametrsRadioStation() { //номер станции за пределами(верх предел)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10, null);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctOverMinParametrsRadioStation() { //номер станции за пределами(нижний предел)
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1, null);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseRadioStation() { //переключение станции в пределах +1
        Radio radio = new Radio();

        //String next;
        radio.setCurrentRadioStation(0, "next");

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioStation() {// переключение станции за пределы +1
        Radio radio = new Radio();

        //String next;
        radio.setCurrentRadioStation(9, "next");

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioStation() { //переключение станции за пределы -1
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0, "prev");

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStation() {//переключение станции в пределах -1
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9, "prev");

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStation() {// установка номера станции
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5, null);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMaxParametrsRadioVolume() {//уровень громкочти за пределами(верх предел)
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(11, null);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMinParametrsRadioVolume() { //уровень громкости за пределами(нижн предел)
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1, null);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume() {// повышение уровня громкости в пределах +1
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0, "+");

        int expected = 1;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioVolume() {// повышение уровня громкости за пределами +1
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(10, "+");

        int expected = 10;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolume() {// уменьшение уровня громкости в пределах -1
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(10, "-");

        int expected = 9;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioVolume() {// уменьшение уровня громкости за пределами -1
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0, "-");

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
