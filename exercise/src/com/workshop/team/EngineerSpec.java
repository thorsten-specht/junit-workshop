package com.workshop.team;

import com.workshop.story.Status;
import com.workshop.story.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineerSpec {

    @Test
    void takeStoryInStatusSpec() {
        Story story = new Story(5, "Test");
        Engineer engineer = new Engineer();

        engineer.takeStoryInStatus(story, Status.IN_PROGRESS);

        assertEquals(Status.IN_PROGRESS, story.getStatus());
    }

    @Test
    void workSomeHoursDeveloperTest() {
        Developer developer = new Developer();
        int alreadyWorkedHours = developer.workSomeHours(3);

        assertEquals(5+alreadyWorkedHours, developer.workSomeHours(5));
    }

    @Test
    void workSomeHoursQaEngineerTest() {
        QaEngineer qaEngineer = new QaEngineer();
        int alreadyWorkedHours = qaEngineer.workSomeHours(3);

        assertEquals(6+alreadyWorkedHours, qaEngineer.workSomeHours(6));
    }
}
