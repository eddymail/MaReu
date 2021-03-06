package com.lousssouarn.edouard.mareu.model;


/**
 * Model object representing a Meeting
 */
public class Meeting {
    /**
     * color
     */
    private int color;

    /**
     * Subject
     */
    private String subject;

    /**
     * date
     */
    private String date;
    /**
     * time
     */
    private String time;

    /**
     * meeting room name
     */
    private String roomName;

    /**
     * participants
     */
    private String participants;

    public Meeting(int color, String subject, String date, String time, String roomName, String participants) {
        this.color = color;
        this.subject = subject;
        this.date = date;
        this.time = time;
        this.roomName = roomName;
        this.participants = participants;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }
}

