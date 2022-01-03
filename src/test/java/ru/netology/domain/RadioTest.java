package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(3);
        radio.increaseRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheFirstStationAfterTheLast() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.decreaseRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheLastStationAfterTheFirst() {
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMaximumVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMinimumVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnOnTheFirstStationWhenANonExistentNumberIsEntered() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheFirstStationWhenEnteredANumberLessThanZero() {
        radio.setCurrentRadioStation(-10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldLeaveTheMaximumVolumeTheSame() {
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMinimumVolumeTheSame() {
        radio.setCurrentVolume(-11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetTheNumberOfRadioStation() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getNumberOfRadioStations());
    }

}


