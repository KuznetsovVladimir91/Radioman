package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStations = 10;

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void increaseRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            this.currentVolume = 100;
            return;
        }
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume = currentVolume - 1;
    }

}
