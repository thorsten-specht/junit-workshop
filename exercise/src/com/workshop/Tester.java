package com.workshop;

public class Tester {

    // A tester grabs one story which will proceed from 'in progress' to 'closed'.
    void testStory(Sprint sprint) {
        if (sprint.storiesInProgress != 0) {
            int storiesInProgress = sprint.getStoriesInProgress();
            sprint.setStoriesInProgress(storiesInProgress-1);

            int closedStories = sprint.getClosedStories();
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
        if (sprint.storiesInProgress >= count) {
            for(int i = 0; i < count; i++) {
                testStory(sprint);
            }
        } else {
            System.out.println("There are less stories in the sprint as you want to test");
        }
    }
}
