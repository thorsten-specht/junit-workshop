package com.workshop.team;

import com.workshop.events.Sprint;

public class Developer extends Engineer {
    boolean hasStoryInProgress = false;
    int workingHoursToday = 0;

    public int getWorkingHoursToday() {
        return workingHoursToday;
    }

    public void setWorkingHoursToday(int workingHoursToday) {
        this.workingHoursToday = workingHoursToday;
    }

    public boolean isHasStoryInProgress() {
        return hasStoryInProgress;
    }

    int workSomeHours(int hours) {
        return workingHoursToday = workingHoursToday + hours;
    }

}
