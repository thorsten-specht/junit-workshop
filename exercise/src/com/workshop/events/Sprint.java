package com.workshop.events;

import com.workshop.story.Status;
import com.workshop.story.Story;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sprint {
    // attributes
    int amountStories;
    long openStories;
    long storiesInProgress;
    long closedStories;
    int velocity;
    int load;
    List<Story> stories;

    boolean isFinished = false;

    public Sprint(int velocity) {
        this.velocity = velocity;
        stories = new ArrayList<>();
        load = 0;
    }

    // Getter and Setter
    public int getAmountStories() {
        return amountStories = getStories().size();
    }

    public void setAmountStories(int amountStories) {
        this.amountStories = amountStories;
    }

    public long getOpenStories() {
        Stream<Story> openStories = stories.stream().filter(story -> story.getStatus().equals(Status.OPEN));
        return this.openStories = openStories.count();
    }

    public void setOpenStories(long openStories) {
        this.openStories = openStories;
    }

    public long getStoriesInProgress() {
        Stream<Story> storiesInProgress = stories.stream().filter(story -> story.getStatus().equals(Status.IN_PROGRESS));
        return this.storiesInProgress = storiesInProgress.count();
    }

    public void setStoriesInProgress(long storiesInProgress) {
        this.storiesInProgress = storiesInProgress;
    }

    public long getClosedStories() {
        Stream<Story> closedStories = stories.stream().filter(story -> story.getStatus().equals(Status.CLOSED));
        return this.closedStories = closedStories.count();
    }

    public void setClosedStories(long closedStories) {
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

    public int addStoryToSprint(Story story) {
        stories.add(story);
        return load = load + stories.size();
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
