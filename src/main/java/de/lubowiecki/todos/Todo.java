package de.lubowiecki.todos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "todos")
public class Todo {

    @Id // Primärschlüssel
    @GeneratedValue // Autoincrement
    private int id;

    @Column(length = 100)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
