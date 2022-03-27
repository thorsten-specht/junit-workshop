package com.workshop.team;

import com.workshop.events.Sprint;

public class QaEngineer extends Engineer {

    // A tester grabs one story which will proceed from 'in progress' to 'closed'.
    void testStory(Sprint sprint) {
        if (sprint.getStoriesInProgress() != 0) {
            long storiesInProgress = sprint.getStoriesInProgress();
            sprint.setStoriesInProgress(storiesInProgress-1);

            long closedStories = sprint.getClosedStories();
            sprint.setClosedStories(closedStories+1);

            if (sprint.getClosedStories() == sprint.getAmountStories()) {
                sprint.setIsFinished(true);
                System.out.println("Hurra! You finished the sprint.");
            }
        } else {
            System.out.println("There is nothing to test!");
        }
    }

    // A tester grabs multiple stories which will proceed from 'in progress
    void testMultipleStories(Sprint sprint, int count) {
        if (sprint.getStoriesInProgress() >= count) {
            for(int i = 0; i < count; i++) {
                testStory(sprint);
            }
        } else {
            System.out.println("There are less stories in the sprint as you want to test");
        }
    }
}
