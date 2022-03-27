package com.workshop.events;

import com.workshop.story.Story;

import java.util.ArrayList;
import java.util.List;

public class Sprint {
    // attributes
    int amountStories;
    int openStories;
    int storiesInProgress;
    int velocity;
    int load;
    List<Story> stories;

    int closedStories;
    boolean isFinished = false;

    public Sprint(int velocity) {
        this.velocity = velocity;
        stories = new ArrayList<>();
        load = 0;
    }

    // Getter and Setter
    public int getAmountStories() {
        return amountStories;
    }

    public void setAmountStories(int amountStories) {
        this.amountStories = amountStories;
    }

    public int getOpenStories() {
        return openStories;
    }

    public void setOpenStories(int openStories) {
        this.openStories = openStories;
    }

    public int getStoriesInProgress() {
        return storiesInProgress;
    }

    public void setStoriesInProgress(int storiesInProgress) {
        this.storiesInProgress = storiesInProgress;
    }

    public int getClosedStories() {
        return closedStories;
    }

    public void setClosedStories(int closedStories) {
        this.closedStories = closedStories;
    }

    public List<Story> getStories() {
        return stories;
    }

    public int getLoad() { return load; }

    public void setLoad(int load) {this.load = load;}

    public int getVelocity() { return load; }

    public void setVelocity(int velocity) {this.velocity = velocity;}

    public boolean isFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean finished) {
        isFinished = finished;
    }

    void addStoryInSprint(Story story) {
        stories.add(story);
        System.out.println(stories);
    }

    public void printStatus() {
        System.out.println(" ");
        System.out.println("####################");
        System.out.println(" ");
        System.out.println("Stories (total):      " + amountStories);
        System.out.println("Open Stories:         " + openStories);
        System.out.println("Stories in Progress:  " + storiesInProgress);
        System.out.println("Closed Stories:       " + closedStories);
        System.out.println("Sprint finished:      " + isFinished);
    }

}
