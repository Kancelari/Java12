package chapter7;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class exercise7_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int nrOfStudents=input.nextInt();
        int[] grades=new int[nrOfStudents];
        System.out.print("Enter 4 scores: ");
        for (int i=0; i<nrOfStudents;i++){
            grades[i]= input.nextInt();
        }
        int max= Arrays.stream(grades).max().getAsInt();
        for (int j=0;j<nrOfStudents;j++){
            if(grades[j] >= (max - 10)){
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is A");
            }
            else if(grades[j] >= (max - 20)){
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is B");
            }
            else if(grades[j] >= (max - 30)){
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is C");
            }
            else if(grades[j] >= (max - 40)){
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is D");
            }
            else{
                System.out.println("Student " + j + " score is " + grades[j] + " and grade is F");
            }
        }
    }
}
