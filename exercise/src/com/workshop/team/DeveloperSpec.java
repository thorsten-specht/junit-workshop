package com.workshop.team;

import com.workshop.story.Status;
import com.workshop.story.Story;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class DeveloperSpec {

    @Test
    void developerHasNoStoryInProgressPerDefault() {
        Developer developer = new Developer();
        boolean hasStoryInProgress = developer.isHasStoryInProgress();

        assertFalse(hasStoryInProgress);
    }

    @Test
    void developerCanTakeStoryInProgress() {
        Developer developer = new Developer();
        Story story = new Story(5, "Some story");

        assertFalse(developer.hasStoryInProgress);
        developer.takeStoryInProgress(story);
        assertTrue(developer.hasStoryInProgress);

        assertEquals(Status.IN_PROGRESS, story.getStatus());
    }

    @Test
    void developerCanTakeOnlyOneStoryInProgress() {
        Developer developer = new Developer();
        Story story = new Story(5, "Some story");
        developer.setHasStoryInProgress(true);

        // set OutputStream to get access to console output
        final ByteArrayOutputStream sysOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sysOut));

        developer.takeStoryInProgress(story);

        assertEquals(Status.OPEN, story.getStatus());
        assertEquals("Developer must not work on more than one story\n", sysOut.toString());
    }
}
