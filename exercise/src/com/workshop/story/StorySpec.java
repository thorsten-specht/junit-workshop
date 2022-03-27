package com.workshop.story;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StorySpec {

    @Test
    void storyIsCorrectlyConstructedTest() {
        Story story = new Story(15, "Test story");

        assertEquals(15, story.getPoints());
        assertEquals("Test story", story.getName());
        assertEquals(Status.OPEN, story.getStatus());
    }

    @Test
    void settingStoryValuesTest() {
        Story story = new Story(0, "Test");

        story.setName("Example");
        story.setPoints(10);
        story.setStatus(Status.IN_PROGRESS);

        assertEquals(10, story.getPoints());
        assertEquals("Example", story.getName());
        assertEquals(Status.IN_PROGRESS, story.getStatus());
    }

    @Test
    void getStatusReturnsValueInLowerCaseTest() {
        Story story = new Story(5, "My story");

        assertNotEquals("OPEN", story.getStatusInLowerCase());
        assertEquals("open", story.getStatusInLowerCase());
    }
}
