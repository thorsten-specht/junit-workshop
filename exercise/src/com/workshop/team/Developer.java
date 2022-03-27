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

    // Developer must not work on more than one story at a time!
    void takeOneStoryInProgress(Sprint sprint) {
        if (!hasStoryInProgress) {
            int storiesInProgress = sprint.getStoriesInProgress();
            sprint.setStoriesInProgress(storiesInProgress + 1);

            int openStories = sprint.getOpenStories();
            sprint.setOpenStories(openStories - 1);

            hasStoryInProgress = true;
        } else {
            System.out.println("Developer already has one story in progress!");
        }
    }

    int workSomeHours(int hours) {
        return workingHoursToday = workingHoursToday + hours;
    }

}
