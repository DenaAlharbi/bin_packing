// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int numContainers =input.nextInt();
        ArrayList<Integer> originalarray = new ArrayList<Integer>();

        System.out.println("Enter the weights: ");
        for(int i=0;i<numContainers;i++) {
            originalarray.add(input.nextInt()) ;
        }
        input.close();
        //int numOfBins=0;
		/*for(int i=0;i<originalarray.length;i++) {
		System.out.println(originalarray[i]);
		}*/
        ArrayList<Integer> container_current_weights = new ArrayList<Integer>();
        //this should run unti the entered valuesbare all removed
        while (!originalarray.isEmpty()) {
            //go through it one by one
            for(int i=0;i<originalarray.size();i++) {
                //go through each container to check if it can pack the new weight
                for(int j=0;j<container_current_weights.size();j++) {
                    //getting the sum in order to check availability
                    int[] sums = new int[container_current_weights.size()];
                    if(sums[j]+ originalarray.get(i)<10) {
                        //Integer num = originalarray.get(i); ignore
                        //if yes-it should add the weight to the container and remove it from the original
                        container_current_weights.get(j).add((int)originalarray.get(i));
                        originalarray.remove(i);
                    }
                    //if all containers are full a new one it added
                    if(j==container_current_weights.size()) {
                        //this should create a new container
                        //idk if this would work (maybe it needs a new array?) i cant check cause the code stops at line35
                        container_current_weights.add(originalarray.get(i));

                    }
                }
            }
        }
        //just print statements
        System.out.println("Number of containers needed: " + container_current_weights.size());
        for (int i = 0; i < container_current_weights.size(); i++) {
            System.out.println("Container " + (i + 1) + ": " + container_current_weights.get(i));
        }
    }
}