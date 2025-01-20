import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       double[] scores = new double[5]; 
	       double total = 0; 
	       
	       for (int i = 0; i < scores.length; i++) {
	           System.out.print("Input score of student " + (i + 1) + ": ");
	           scores[i] = scanner.nextDouble();
	       }
	       
	       for (double score : scores) {
	           total += score;
	       }
	      
	       double average = total / scores.length;
	       System.out.println();
	       System.out.printf("Average of 5 Students is %.2f\n", average);
	       
	       int index = 1;
	       for (double score : scores) {
	           if (score > average) {
	               System.out.printf("> Student %d (%.2f)\n", index, score);
	           }
	           index++; 
	       }
	      

	}

}
