package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.increaseRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheFirstStationAfterTheLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.decreaseRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheLastStationAfterTheFirst() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMinimumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnOnTheFirstStationWhenANonExistentNumberIsEntered() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnOnTheFirstStationWhenEnteredANumberLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldLeaveTheMaximumVolumeTheSame() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldLeaveTheMinimumVolumeTheSame() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-11);
        assertEquals(0, radio.getCurrentVolume());
    }

}