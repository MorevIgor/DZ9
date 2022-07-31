package home.radio;

public class Radio {
    int currentRadioStation;
    int currentRadioVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    void setCurrentRadioStation(int newCurrentRadioStation, String buttonStation) {

        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;

        if (buttonStation == "next") {
            if (currentRadioStation < 9) {
                newCurrentRadioStation = currentRadioStation + 1;
            } else newCurrentRadioStation = currentRadioStation - 9;
        }
        if (buttonStation == "prev") {
            if (currentRadioStation > 0) {
                newCurrentRadioStation = currentRadioStation - 1;
            } else newCurrentRadioStation = currentRadioStation + 9;
        }

        currentRadioStation = newCurrentRadioStation;
    }


    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    void setCurrentRadioVolume(int newCurrentRadioVolume, String buttonVolume) {
        if (newCurrentRadioVolume > 10) {
            return;
        }
        if (newCurrentRadioVolume < 0) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;

        if (buttonVolume == "+"){
            if (currentRadioVolume < 10) {
                currentRadioVolume = currentRadioVolume + 1;
            }
        }

        if (buttonVolume == "-"){
            if (currentRadioVolume > 0) {
                currentRadioVolume = currentRadioVolume - 1;
            }
        }
    }


}

