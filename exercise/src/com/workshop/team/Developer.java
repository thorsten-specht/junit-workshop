package com.workshop.team;

import com.workshop.story.Status;
import com.workshop.story.Story;

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

    public void setHasStoryInProgress(boolean hasStoryInProgress) {
        this.hasStoryInProgress = hasStoryInProgress;
    }

    public boolean isHasStoryInProgress() {
        return hasStoryInProgress;
    }

    public void takeStoryInProgress(Story story) {
        if (!hasStoryInProgress) {
            super.takeStoryInStatus(story, Status.IN_PROGRESS);
            hasStoryInProgress = true;
        } else {
            System.out.println("Developer must not work on more than one story");
        }
    }
}
