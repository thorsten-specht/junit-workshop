package com.workshop;

import com.workshop.events.Sprint;
import com.workshop.story.Story;

public class ScrumIteration {

    public static void main(String[] args) {
        // 1. Sprint begins with 0 Stories and a given amount of points
        System.out.println("Der Sprint beginnt");
        Sprint firstSprint = new Sprint(20);

        // 2. PO puts stories in the sprint until the velocity has been reached.

        Story implementSomething = new Story(5, "Implement me");

        System.out.println(implementSomething.getStatus());


        Story stories[] = new Story[1];
        stories[0] = new Story(5, "Test");

        System.out.println(stories[0].getPoints());


    }
}
