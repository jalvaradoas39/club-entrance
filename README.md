# Club Entrance Program

## Description
This project was a school assignment for my Java programming course. The task was to write a Java program called `ClubEntrance` that manages the number of people inside a club, ensuring it does not exceed a maximum capacity of 100 occupants.

The program controls groups entering and exiting using the following rules:
- Groups can enter or leave, with negative numbers representing group departures.
- If a group entering would cause the total occupants to exceed 100, the group is denied entry and a message is displayed, informing them they must wait until others leave.
- If a group wants to enter, all members must enter together. If there isn’t enough space for the entire group, none of them can enter.
- The program displays the current number of occupants after each entry or departure.
- When the club reaches exactly 100 occupants, the program displays the count, reports that the club is full, and then exits.

We were asked not use any `break` or `continue` statements.

## What I Learned
The week of this assignment, we learned about using branches and loops in Java. Although I have been familiar with these basics in other languages, such as JavaScript, learning them in Java was new to me. I noticed key differences in how they are used in Java compared to JavaScript, such as the use of type declarations and stricter syntax in Java. This project allowed me to deepen my understanding of controlling program flow using loops and conditional branches in Java. 