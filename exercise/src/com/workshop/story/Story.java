package com.workshop.story;

import java.util.Locale;

public class Story {
    Status status;
    int points;
    String name;

    public Story(int points, String name) {
        this.status = Status.OPEN;
        this.points = points;
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusInLowerCase() {
        return status.toString().toLowerCase(Locale.ROOT);
    }


}
