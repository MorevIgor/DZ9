package home.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio2Test {

    @Test
    public void increaseRadioStation(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(0);

        radio.next();

        int expected= 1;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseRadioStationMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(8);

        radio.next();

        int expected= 9;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseRadioStationOverMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected= 0;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioStation(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected=8;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioStationMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected=0;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioStationOverMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected= 9;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseRadioVolume(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(5);

        radio.plus();

        int expected = 6;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseRadioVolumeMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(9);

        radio.plus();

        int expected = 10;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void increaseRadioVolumeOverMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(10);

        radio.plus();

        int expected = 10;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioVolume(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(5);

        radio.minus();

        int expected = 4;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioVolumeMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(1);

        radio.minus();

        int expected = 0;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void reduceRadioVolumeOverMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(0);

        radio.minus();

        int expected = 0;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void correctRadioStationMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(10);

        int expected= 0;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void correctRadioStationMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioStation(-1);

        int expected= 0;
        int actual= radio.getCurrentRadioStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void correctRadioVolumeStationMax(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(11);

        int expected = 0;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void correctRadioVolumeStationMin(){
        Radio2 radio = new Radio2();

        radio.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual= radio.getCurrentRadioVolume();

        Assertions.assertEquals(expected,actual);
    }
}
