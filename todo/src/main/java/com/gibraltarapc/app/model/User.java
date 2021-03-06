package com.gibraltarapc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table

public class User {

    @Id
    private int id;
    @OneToMany(mappedBy = "user")
    private List<Note> notes;

    public User(int id, List<Note> notes) {
        this.id = id;
        this.notes = notes;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNotes(List Notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", notes=" + notes +
                '}';
    }
}
