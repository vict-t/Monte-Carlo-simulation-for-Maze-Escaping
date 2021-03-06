# Monte Carlo simulation for Maze Escaping

## Description

A mouse is trying to escape from a maze where it starts moving from the top-left corner (0,0) to the exit in the bottom-right corner (6,6). It moves according to the following rules:

1. The mouse randomly goes to one of the four directions - north, east, south and west based on the probability specified below.<br />East: 0.3 <br />South: 0.3 <br />West: 0.2 <br />North: 0.2
2. The new position must be within the boundaries of the maze.
3. The new position must not have been visited previously.
4. If the new position does not fulfil the criteria above, the mouse will randomly pick a new direction again. Every decision is independent of the others.
5. If the mouse reaches a dead-end - all directions are not enterable, it fails to leave the maze.
6. The mouse continues to move until it reaches the exit.

![image](https://user-images.githubusercontent.com/44689459/168558078-eb0341e4-7ecf-4118-9ea5-6a92e75e5fcb.png)

This is a java simulation program using the **Monte Carlo method** to estimate the probability (P) of the mouse successfully escaping from the maze. It simulates the success escape rate that the mouse run one million times.

The success rate **p** is calculate by P = (number of success escape attempts) / (total number of simulation).

## Output

The output rate P should be between 0.405 - 0.410.
![image](https://user-images.githubusercontent.com/44689459/169756451-0ad68b4d-e2c9-4eed-9bfd-20cdda91b6eb.png)

