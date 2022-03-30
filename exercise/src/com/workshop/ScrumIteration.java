package com.workshop;

import com.workshop.events.Sprint;
import com.workshop.story.Story;
import com.workshop.team.Developer;
import com.workshop.team.ProductOwner;
import com.workshop.team.QaEngineer;

public class ScrumIteration {

    public static void main(String[] args) {
        // 1. Sprint begins with 0 Stories and a given amount of points
        System.out.println("Der Sprint beginnt");
        Sprint firstSprint = new Sprint(20);
        Story firstStory = new Story(5, "Govindas story");
        Story secondStory = new Story(4, "Fabis Story");
        Story thirdStory = new Story(3, "Noch eine");
        ProductOwner stefan = new ProductOwner();
        Developer fabian = new Developer();
        Developer govinda = new Developer();
        QaEngineer thorsten = new QaEngineer();

        stefan.putStoryInSprint(firstStory, firstSprint);
        stefan.putStoryInSprint(secondStory, firstSprint);
        stefan.putStoryInSprint(thirdStory, firstSprint);

        fabian.takeStoryInProgress(secondStory);
        fabian.workSomeHours(4);
        fabian.takeStoryInProgress(firstStory);

        govinda.takeStoryInProgress(firstStory);
        thorsten.testStory(firstSprint, firstStory);
        thorsten.testStory(firstSprint, secondStory);
        thorsten.testStory(firstSprint, thirdStory);

        firstSprint.printStatus();
    }
}
