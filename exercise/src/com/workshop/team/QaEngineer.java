package com.workshop.team;

import com.workshop.events.Sprint;
import com.workshop.story.Status;
import com.workshop.story.Story;

public class QaEngineer extends Engineer {

    // methods
    public void testStory(Sprint sprint, Story story) {
        if (sprint.getStoriesInProgress() != 0) {
            takeStoryInStatus(story, Status.CLOSED);
            if (sprint.getClosedStories() == sprint.getAmountStories()) {
                sprint.setIsFinished(true);
                System.out.println("Hurra! You finished the sprint.");
            }
        } else {
            System.out.println("There is nothing to test!");
        }
    }
}
