package com.workshop.team;

import com.workshop.story.Status;
import com.workshop.story.Story;

public class Engineer {

    public void takeStoryInStatus(Story story, Status status) {
        story.setStatus(status);
    }
}
