package com.workshop;

import com.workshop.events.Sprint;
import com.workshop.story.Status;
import com.workshop.story.Story;
import com.workshop.team.Developer;
import com.workshop.team.ProductOwner;
import com.workshop.team.QaEngineer;

public class ScrumIteration {

    public static void main(String[] args) {
        // 1. Sprint begins with 0 Stories and a given amount of points
        System.out.println("Der Sprint beginnt");
        Sprint firstSprint = new Sprint(20);
        Story firstStory = new Story(5, "Some story");

        ProductOwner oli = new ProductOwner();
        Developer fabian = new Developer();
        QaEngineer thorsten = new QaEngineer();

        oli.putStoryInSprint(firstStory, firstSprint);
        fabian.takeStoryInStatus(firstStory, Status.IN_PROGRESS);

        fabian.workSomeHours(4);

        System.out.println(
                firstSprint.getStoriesInProgress()
        );


        // 2. PO puts stories in the sprint until the velocity has been reached.

        Story implementSomething = new Story(5, "Implement me");

        System.out.println(implementSomething.getStatus());


        Story stories[] = new Story[1];
        stories[0] = new Story(5, "Test");

        System.out.println(stories[0].getPoints());


    }
}
