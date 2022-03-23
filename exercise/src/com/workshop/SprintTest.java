package com.workshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SprintTest {
    @Test
    @DisplayName("A sprint always has one more story than provided")
    void sprintSetupWorks() {
        Sprint sprint = new Sprint(3);

        int amountStories = sprint.getAmountStories();
        assertEquals(3, amountStories);
    }

}
