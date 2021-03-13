package com.wolf.noteScout.model;

import javax.persistence.*;

@Entity
@Table(name = "`group`")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "groupId")
    private int groupId;

    @Column(name = "groupOwner")
    private String groupOwner;

    public Group() {}

    public Group(int id, int groupId, String groupOwner) {
        this.id = id;
        this.groupId = groupId;
        this.groupOwner = groupOwner;
    }

    public Group(int groupId, String groupOwner) {
        this.groupId = groupId;
        this.groupOwner = groupOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupOwner() {
        return groupOwner;
    }

    public void setGroupOwner(String groupOwner) {
        this.groupOwner = groupOwner;
    }
}
