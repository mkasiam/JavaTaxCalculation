import java.util.Scanner;

public class ElevatorSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Floor: ");

        if (scanner.hasNext()) {

            int floor = scanner.nextInt();
            if (floor == 13) {
                System.out.println("There is no such floor exists like 13");
            } else if (floor >= 20 || floor < 0) {
                System.out.println("No Floor exits");
            }else {
                int actualFloor = floor;
                if (actualFloor > 13) {
                    actualFloor = actualFloor - 1;
                    System.out.println("Elevator will travel actual floor: " + actualFloor);
                } else{
                    System.out.println("Not an Integer Input: ");
                }
            }
        }
    }
}
