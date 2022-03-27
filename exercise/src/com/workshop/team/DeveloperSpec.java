package com.workshop.team;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeveloperSpec {

    @Test
    void developerHasNoStoryInProgressPerDefault() {
        Developer developer = new Developer();
        boolean hasStoryInProgress = developer.isHasStoryInProgress();

        assertFalse(hasStoryInProgress);
    }

    @Test
    void workSomeHoursTest() {
        Developer developer = new Developer();
        int alreadyWorkedHours = developer.workSomeHours(3);

        assertEquals(5+alreadyWorkedHours, developer.workSomeHours(5));
    }
}
