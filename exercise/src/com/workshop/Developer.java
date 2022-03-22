package com.workshop;

public class Developer {
    boolean hasStoryInProgress = false;

    // Developer must not work on more than one story at a time!
    void takeStoryInProgress(Sprint sprint) {
        if (!hasStoryInProgress) {
            int storiesInProgress = sprint.getStoriesInProgress();
            sprint.setStoriesInProgress(storiesInProgress+1);

            int openStories = sprint.getOpenStories();
            sprint.setOpenStories(openStories-1);

            hasStoryInProgress = true;
        } else {
            System.out.println("Developer already has one story in progress!");
        }
    }
}
