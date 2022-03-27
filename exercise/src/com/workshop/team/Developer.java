package com.workshop.team;

import com.workshop.events.Sprint;

public class Developer extends Engineer {
    // attributes
    boolean hasStoryInProgress = false;


    // constructor
    public Developer() {
    }

    // getter and setter
    public int getWorkingHoursToday() {
        return workingHoursToday;
    }

    public void setWorkingHoursToday(int workingHoursToday) {
        this.workingHoursToday = workingHoursToday;
    }

    public boolean isHasStoryInProgress() {
        return hasStoryInProgress;
    }

}
