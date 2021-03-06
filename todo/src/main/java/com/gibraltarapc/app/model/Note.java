package com.gibraltarapc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table

public class Note {

    @Id
    private int id;
    private String message;
    private Date date;
    @ManyToOne
    private User user;


    public Note(int id, String message, Date date, User user) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.user = user;
    }

    public Note() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
