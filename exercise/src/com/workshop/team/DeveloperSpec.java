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
}
