package com.workshop.team;

import com.workshop.events.Sprint;
import com.workshop.story.Story;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOwnerSpec {

    @Test
     void putStoryInSprintIncreasesLoadTest() {
        Story story = new Story(5, "Test PO function");
        Sprint sprint = new Sprint(5);
        ProductOwner productOwner = new ProductOwner();

        int initLoad = sprint.getLoad();

        productOwner.putStoryInSprint(story, sprint);

        int finalLoad = sprint.getLoad();

        assertTrue(finalLoad > initLoad);
        assertEquals(5, finalLoad);
    }

    @Test
    void putStoryInSprintDoesNotAffectSprintScopeTest() {
        Story story = new Story(5, "Test PO function");
        Sprint sprint = new Sprint(5);
        ProductOwner productOwner = new ProductOwner();

        int initVelocity = sprint.getVelocity();

        productOwner.putStoryInSprint(story, sprint);

        int finalVelocity = sprint.getVelocity();

        assertEquals(initVelocity, finalVelocity);
        assertEquals(5, finalVelocity);
    }
}
