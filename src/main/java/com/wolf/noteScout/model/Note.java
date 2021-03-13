package com.wolf.noteScout.model;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int checked;
    private String username;
    private int groupID;

    public Note() {}

    public Note(String name, int checked, String username, int groupID) {
        this.name = name;
        this.checked = checked;
        this.username = username;
        this.groupID = groupID;
    }

    public Note(int id, String name, int checked, String username, int groupID) {
        this.id = id;
        this.name = name;
        this.checked = checked;
        this.username = username;
        this.groupID = groupID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsChecked() {
        return checked;
    }

    public void setIsChecked(int isChecked) {
        this.checked = isChecked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", checked='" + checked + '\'' +
                ", username='" + username + '\'' +
                ", groupID='" + groupID + '\'' +
                '}';
    }
}

