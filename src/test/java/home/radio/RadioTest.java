package home.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    int radioStation = 100;


    @Test
    public void correctOverMaxParametrsRadioStation() { //номер станции за пределами(верх предел)
        Radio radio = new Radio(null, radioStation, radioStation + 1, 0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctOverMinParametrsRadioStation() { //номер станции за пределами(нижний предел)

        Radio radio = new Radio(null, radioStation, radioStation - (radioStation + 1), 0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseRadioStation() { //переключение станции в пределах +1
        Radio radio = new Radio("next", radioStation, 0, 0);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioStation() {// переключение станции за пределы +1
        Radio radio = new Radio("next", radioStation, radioStation - 1, 0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioStation() { //переключение станции за пределы -1
        Radio radio = new Radio("prev", radioStation, 0, 0);

        int expected = radioStation - 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStation() {//переключение станции в пределах -1
        Radio radio = new Radio("prev", radioStation, radioStation - 1, 0);

        int expected = radioStation - 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStation() {// установка номера станции
        Radio radio = new Radio(null, radioStation, radioStation - 1, 0);

        int expected = radioStation - 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctOverMaxParametrsRadioStationDefault() { //номер станции за пределами(верх предел) по умолчанию
        Radio radio = new Radio(null, 10, 1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctOverMinParametrsRadioStationDefault() { //номер станции за пределами(нижний предел) по умолчанию

        Radio radio = new Radio(null, -1, 1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseRadioStationDefault() { //переключение станции в пределах +1 по умолчанию
        Radio radio = new Radio("next", 0, 1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioStationDefault() {// переключение станции за пределы +1 по умолчанию
        Radio radio = new Radio("next", 9, 1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioStationDefault() { //переключение станции за пределы -1 по умолчанию
        Radio radio = new Radio("prev", 0, 1);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationDefault() {//переключение станции в пределах -1 по умолчанию
        Radio radio = new Radio("prev", 9, 1);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationDefault() {// установка номера станции по умолчанию
        Radio radio = new Radio(null, 5, 1);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMaxParametrsRadioVolume() {//уровень громкочти за пределами(верх предел)
        Radio radio = new Radio(null, radioStation, 1, 101);


        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMinParametrsRadioVolume() { //уровень громкости за пределами(нижн предел)
        Radio radio = new Radio(null, radioStation, 1, -1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume() {// повышение уровня громкости в пределах +1
        Radio radio = new Radio("+", radioStation, 1, 1);

        int expected = 2;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioVolume() {// повышение уровня громкости за пределами +1
        Radio radio = new Radio("+", radioStation, 1, 100);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolume() {// уменьшение уровня громкости в пределах -1
        Radio radio = new Radio("-", radioStation, 1, 100);

        int expected = 99;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioVolume() {// уменьшение уровня громкости за пределами -1
        Radio radio = new Radio("-", radioStation, 1, 0);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMaxParametrsRadioVolumeDefault() {//уровень громкочти за пределами(верх предел) по умолчанию
        Radio radio = new Radio(null, 1, 101);


        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMinParametrsRadioVolumeDefault() { //уровень громкости за пределами(нижн предел) по умолчанию
        Radio radio = new Radio(null, 1, -1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeDefault() {// повышение уровня громкости в пределах +1 по умолчанию
        Radio radio = new Radio("+", 1, 1);

        int expected = 2;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverRadioVolumeDefault() {// повышение уровня громкости за пределами +1 по умолчанию
        Radio radio = new Radio("+", 1, 100);

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolumeDefault() {// уменьшение уровня громкости в пределах -1 по умолчанию
        Radio radio = new Radio("-", 1, 100);

        int expected = 99;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceOverRadioVolumeDefault() {// уменьшение уровня громкости за пределами -1 по умолчанию
        Radio radio = new Radio("-", 1, 0);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
