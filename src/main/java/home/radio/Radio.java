package home.radio;

public class Radio {
    int currentRadioStation;
    int currentRadioVolume;
    int radioStation = 10;
    int maxRadioStation;
    private int minRadioStation = 0;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;
    private String button;


    public Radio(String button, int radioStation, int currentRadioStation, int currentRadioVolume) {

        this.button = button;
        this.minRadioStation = minRadioStation;
        this.radioStation = radioStation;
        maxRadioStation = radioStation - 1;
        if (currentRadioStation > maxRadioStation) {   // проверка на корректность данных
            return;
        }
        if (currentRadioStation < minRadioStation) {   // проверка на корректность данных
            return;
        }
        if (button == "next") {
            if (currentRadioStation == maxRadioStation) {
                currentRadioStation = currentRadioStation - currentRadioStation;
            } else currentRadioStation = currentRadioStation + 1;
        }
        if (button == "prev") {
            if (currentRadioStation == minRadioStation) {
                currentRadioStation = maxRadioStation;
            } else currentRadioStation = currentRadioStation - 1;
        }

        if (currentRadioVolume > maxRadioVolume) {
            return;
        }
        if (currentRadioVolume < minRadioVolume) {
            return;
        }
        if (button == "+") {
            if (currentRadioVolume < maxRadioVolume) {
                currentRadioVolume = currentRadioVolume + 1;
            }
        }

        if (button == "-") {
            if (currentRadioVolume > minRadioVolume) {
                currentRadioVolume = currentRadioVolume - 1;
            }
        }
        this.currentRadioStation = currentRadioStation;
        this.currentRadioVolume = currentRadioVolume;

    }


    public Radio(String button, int currentRadioStation, int currentRadioVolume) {

        this.button = button;
        this.minRadioStation = minRadioStation;
        this.radioStation = radioStation;
        maxRadioStation = radioStation - 1;
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (button == "next") {
            if (currentRadioStation == maxRadioStation) {
                currentRadioStation = currentRadioStation - currentRadioStation;
            } else currentRadioStation = currentRadioStation + 1;
        }
        if (button == "prev") {
            if (currentRadioStation == minRadioStation) {
                currentRadioStation = maxRadioStation;
            } else currentRadioStation = currentRadioStation - 1;
        }

        if (currentRadioVolume > maxRadioVolume) {
            return;
        }
        if (currentRadioVolume < minRadioVolume) {
            return;
        }
        if (button == "+") {
            if (currentRadioVolume < maxRadioVolume) {
                currentRadioVolume = currentRadioVolume + 1;
            }
        }

        if (button == "-") {
            if (currentRadioVolume > minRadioVolume) {
                currentRadioVolume = currentRadioVolume - 1;
            }
        }
        this.currentRadioStation = currentRadioStation;
        this.currentRadioVolume = currentRadioVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }
}

