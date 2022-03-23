package com.workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeveloperTest {

    @Test
    void developerHasNoStoryInProgressPerDefault() {
        Developer developer = new Developer();
        boolean hasStoryInProgress = developer.isHasStoryInProgress();

        assertFalse(hasStoryInProgress);
    }

    @Test
    void developerHasStoryInProgressWhenHeTookAStory() {
        Developer developer = new Developer();
        Sprint sprint = new Sprint(3);
        developer.takeOneStoryInProgress(sprint);

        boolean hasStoryInProgress = developer.isHasStoryInProgress();

        assertTrue(hasStoryInProgress);
    }

    @Test
    void developerMustNotTakeAStoryInProgressWhenHeAlreadyHasAStoryInProgress() {
        Developer developer = new Developer();
        Sprint sprint = new Sprint(3);

        // 0
        int initialAmountOfStoriesInProgress = sprint.getStoriesInProgress();
        developer.takeOneStoryInProgress(sprint);

        // 1
        int changedAmountOfStoriesInProgress = sprint.getStoriesInProgress();
        developer.takeOneStoryInProgress(sprint);

        // 1
        int finalAmountOfStoriesInProgress = sprint.getStoriesInProgress();

        assertEquals(changedAmountOfStoriesInProgress, finalAmountOfStoriesInProgress);
    }

    @Test
    void takeOneStoryInProgressTest() {
        Sprint sprint = new Sprint(7);
        int amountStories = sprint.getAmountStories();
        assertEquals(7, amountStories);

        Developer developer = new Developer();
        developer.takeOneStoryInProgress(sprint);

        int storiesInProgress = sprint.getStoriesInProgress();
        assertEquals(1, storiesInProgress);
    }

    @Test
    void takeOneStoryInProgressReducesOpenStoriesByOne() {
        Sprint sprint = new Sprint(7);

        int initialOpenStories = sprint.getOpenStories();

        Developer developer = new Developer();
        developer.takeOneStoryInProgress(sprint);

        int changedOpenStories = sprint.getOpenStories();

        assertEquals(changedOpenStories, initialOpenStories-1);
    }

    @Test
    void workSomeHoursTest() {
        Developer developer = new Developer();
        int alreadyWorkedHours = developer.workSomeHours(3);

        assertEquals(5+alreadyWorkedHours, developer.workSomeHours(5));
    }



}
