package com.workshop.events;

import com.workshop.story.Story;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class SprintSpec {

    @Test
    void addStoryToSprintTest() {
        Story firstStory = new Story(5, "Test");
        Story secondStory = new Story(5, "Test");
        Sprint sprint = new Sprint(20);

        assertEquals(Collections.emptyList(), sprint.getStories());

        sprint.addStoryToSprint(firstStory);
        assertSame(firstStory, sprint.getStories().get(0));

        sprint.addStoryToSprint(secondStory);
        assertEquals(2, sprint.getStories().size());
    }

    @Test
    void filterStoriesWorks() {
        Sprint sprint = new Sprint(5);
        Story story = new Story(3, "SomeStory");

        sprint.addStoryToSprint(story);
        System.out.println(
                sprint.getOpenStories()
        );
    }

}
