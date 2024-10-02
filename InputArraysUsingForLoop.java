
import java.util.Arrays;
import java.util.Scanner;

public class InputArraysUsingForLoop {
    public static void main(String[] args) {
        int []arr=new int[4];
        Scanner in=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for (int i = 0;  i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
//        for(int arr1 : arr){
//            System.out.print(arr1+" ");
//        }
    }

}
