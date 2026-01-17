package Training003;

import java.util.Scanner;

/* Training III

    Practice Exercise 3: Traffic Light System
    Create a program that tells drivers what to do based on traffic light color:
    Red: Stop
    Yellow: Prepare to stop
    Green: Go
    Blinking Red: Treat as stop sign
    Blinking Yellow: Proceed with caution
    Use
    switch expression for this
 */
public class TrafficLights {
    static void main(String[] args) {

        System.out.println("Enter 1 traffic light color from options:\nRed\nGreen\nBlinking Red\nBlinking Yellow");
        Scanner input = new Scanner(System.in);

        String color = input.nextLine();
        switch (color){
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Prepare to Stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            case "Blinking Red":
                System.out.println("Treat as Stop sign");
                break;
            case "Blinking Yellow":
                System.out.println("Proceed with caution");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
