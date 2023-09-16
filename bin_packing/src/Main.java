// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int numContainers = input.nextInt();
        ArrayList<Integer> originalarray = new ArrayList<Integer>();
        System.out.println("Enter the weights: ");
        for (int i = 0; i < numContainers; i++) {
            int user = input.nextInt();
            originalarray.add(user);
        }
        ArrayList<ArrayList<Integer>> allContainers = new ArrayList<ArrayList<Integer>>();
        while (!originalarray.isEmpty()) {
            int tot = 0; // works better than the sums method i did before and much simpiler
            int num; // to save the value from remove(this is the solution to the main issue i had before)
            ArrayList<Integer> weightInTheContainer = new ArrayList<Integer>();
            for (int i = 0; i < originalarray.size(); i++) {
                if ((tot + originalarray.get(i)) < 10) {
                    //Integer num = originalarray.get(i); ignore
                    //if yes-it should add the weight to the container and remove it from the original
                    //container_current_weights.get(j).add((int)originalarray.get(i));
                    num = originalarray.remove(i);
                    i--;
                    weightInTheContainer.add(num);
                    tot += num;
                }
            }
            allContainers.add(weightInTheContainer);
        }
        //just print statements
        System.out.println("Number of containers needed: " + allContainers.size());
        for (int i = 0; i < allContainers.size(); i++) {
            System.out.println("Container " + (i + 1) + ": " + allContainers.get(i));


        }
    }
}
