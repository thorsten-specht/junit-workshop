package com.workshop.events;

import com.workshop.story.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class SprintSpec {
    @Test
    @DisplayName("A sprint always has one more story than provided")
    void sprintSetupWorks() {
        Sprint sprint = new Sprint(3);

        int amountStories = sprint.getAmountStories();
        assertEquals(3, amountStories);
    }

    @Test
    void addStoryInSprintTest() {
        Story firstStory = new Story(5, "Test");
        Story secondStory = new Story(5, "Test");
        Sprint sprint = new Sprint(20);

        assertEquals(Collections.emptyList(), sprint.getStories());

        sprint.addStoryInSprint(firstStory);
        assertSame(firstStory, sprint.getStories().get(0));
        sprint.addStoryInSprint(secondStory);
        assertEquals(2, sprint.getStories().size());
    }

}
