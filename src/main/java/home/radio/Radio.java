package home.radio;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;
    private int stationCount;

    public Radio() {
        stationCount = 10;
    }

    public Radio(int station) {
        this.stationCount = station;
    }

    public void next() {
        if (currentRadioStation < (stationCount - 1)) {
            currentRadioStation++;
        } else currentRadioStation = 0;
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else currentRadioStation = stationCount - 1;
    }

    public void plus() {
        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void minus() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > (stationCount - 1)) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume > 100) {
            return;
        }
        if (currentRadioVolume < 0) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }
}


