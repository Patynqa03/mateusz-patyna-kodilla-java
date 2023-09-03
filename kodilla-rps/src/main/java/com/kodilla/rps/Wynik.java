package com.kodilla.rps;

enum Wynik {
    WYGRANA("Wygrałeś!"),
    PRZEGRANA("Komputer wygrał!"),
    REMIS("Remis!");

    private final String komunikat;

    Wynik(String komunikat) {
        this.komunikat = komunikat;
    }

    @Override
    public String toString() {
        return komunikat;
    }
}