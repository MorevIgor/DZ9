package home.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void increaseRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationOverMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationOverMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(5);

        radio.plus();

        int expected = 6;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(99);

        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(100);

        radio.plus();

        int expected = 100;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolume() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(5);

        radio.minus();

        int expected = 4;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(1);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(0);

        radio.minus();

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctRadioVolumeStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctRadioVolumeStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(15);

        radio.next();

        int expected = 16;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationMaxCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(28);

        radio.next();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioStationOverMaxCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(29);

        radio.prev();

        int expected = 28;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationMinCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceRadioStationOverMinCount() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadioVolumeCount() {
        Radio radio = new Radio();

        radio.setCurrentRadioVolume(5);

        radio.plus();

        int expected = 6;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }


}
