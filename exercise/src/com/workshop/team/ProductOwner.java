package com.workshop.team;

import com.workshop.events.Sprint;
import com.workshop.story.Story;

public class ProductOwner {

    void putStoryInSprint(Story story, Sprint sprint) {
        if(sprint.getVelocity()-sprint.getLoad() <= story.getPoints()) {
            sprint.setLoad(sprint.getLoad()+story.getPoints());
        }
    }
}
