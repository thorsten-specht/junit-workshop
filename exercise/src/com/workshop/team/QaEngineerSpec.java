package com.workshop.team;

import com.workshop.events.Sprint;
import com.workshop.story.Status;
import com.workshop.story.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QaEngineerSpec {

    @Test
    void sprintIsFinishedWhenLastStoryWasTested() {
        Sprint sprint = new Sprint(5);
        QaEngineer qaEngineer = new QaEngineer();
        Story story = new Story(5, "Story");

        story.setStatus(Status.IN_PROGRESS);
        sprint.addStoryToSprint(story);

        qaEngineer.testStory(sprint, story);
        assertTrue(sprint.isFinished());
    }
}
