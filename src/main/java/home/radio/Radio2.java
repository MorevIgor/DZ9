package home.radio;

public class Radio2 {

    private int currentRadioStation;
    private int currentRadioVolume;

    public void next(){
        if (currentRadioStation <9) {
            currentRadioStation ++;
        } else currentRadioStation = 0;
    }

    public void prev(){
        if (currentRadioStation >0){
            currentRadioStation --;
        }else currentRadioStation=9;
    }

    public void plus() {
        if (currentRadioVolume < 10) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public  void minus() {
        if (currentRadioVolume>0){
            currentRadioVolume = currentRadioVolume -1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if(currentRadioStation>9){
            return;
        }
        if(currentRadioStation<0){
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if(currentRadioVolume>10){
            return;
        }
        if(currentRadioVolume<0){
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }
}
