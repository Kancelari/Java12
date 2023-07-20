package chapter7;

import java.util.Scanner;

public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] arr=new int[10];
        for (int i=0; i<10;i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Numrat e vendosur te paraqitur ne menyre te kundert");
        for (int i=9;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
