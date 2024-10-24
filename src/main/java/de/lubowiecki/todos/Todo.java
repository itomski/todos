package de.lubowiecki.todos;

import java.time.LocalDateTime;

// POJO - Plain Old Java Object
public class Todo {

    private String titel;
    private String beschreibung;
    private LocalDateTime erzeugtAm;
    private boolean erledigt;

    public Todo() {
        erzeugtAm = LocalDateTime.now();
    }

    public Todo(String titel, String beschreibung, boolean erledigt) {
        this();
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.erledigt = erledigt;
    }

    public Todo(String titel, String beschreibung) {
        this(titel, beschreibung, false);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDateTime getErzeugtAm() {
        return erzeugtAm;
    }

    public void setErzeugtAm(LocalDateTime erzeugtAm) {
        this.erzeugtAm = erzeugtAm;
    }

    public boolean isErledigt() {
        return erledigt;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }
}
