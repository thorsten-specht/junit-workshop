package com.workshop;

public class Sprint {
    // attributes
    int amountStories;
    int openStories;
    int storiesInProgress;
    int closedStories;
    boolean isFinished = false;

    public Sprint(int amountStories) {
        this.amountStories = amountStories;
        this.openStories = amountStories;
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

    public boolean isFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean finished) {
        isFinished = finished;
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
