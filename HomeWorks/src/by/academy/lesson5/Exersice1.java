package by.academy.lesson5;
import java.util.Arrays;
import java.util.Scanner;
public class Exersice1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите n строк:");
        int n =sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<arr.length; i++){
                arr[i]=sc.next();
            }
        String sMin=arr[0];
        for(int i=1;i<arr.length;i++){
    if(sMin.length()>arr[i].length()){
        sMin=arr[i];
    }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}


