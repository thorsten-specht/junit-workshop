package com.workshop.team;

import com.workshop.story.Status;
import com.workshop.story.Story;

public class Engineer {
    // attributes
    int workingHoursToday = 0;

    // methods
    public void takeStoryInStatus(Story story, Status status) {
        story.setStatus(status);
    }

    // methods
    public int workSomeHours(int hours) {
        return workingHoursToday = workingHoursToday + hours;
    }
}
