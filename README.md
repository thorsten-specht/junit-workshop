# junit-workshop
This workshop is created to teach unit testing concepts to software testers who have no development experience.

## Goal of this workshop
- Get a basic understanding of unit testing
- Learn to write simple unit tests using JUnit 5
- Understand the idea of test driven development


## Exercise: Abstract model of a scrum sprint
In this repository you find a simple program which should be understandable for each tester with basic knowledge of java. The program is a model of a scrum sprint with the following rules:
- A sprint is basically a set of stories which have to be completed.
- A story is either open, in progress or completed.
- A sprint is finished when all stories are closed.
- A developer can take an open story in progress.
- A developer must not work on more than one story at a time.
- A developer must not take a story in progress if there is no open story left.
- A developer can pull another story in the sprint. He is only allowed to do so if there is no open story left.
- Once a story was taken in progress we assume that it is ready to be tested. This means, a tester can test a story when it's in progress.
- Once a tester tested a story it will be closed.
