package Array;

import java.util.Arrays;
import java.util.Collections;

public class Q1RevArray {

    public static void main(String[] args) {

        //Method 1
            //int[] arr={2,3,4,5,6,7};
            //int[] rev=new int[arr.length];
             //int k=0;
             //for (int i= arr.length-1;i>=0;i--){
            //    rev[k]=arr[i];
             //    k++;
            //
            //}






        //Method 2
//        int[] arr={2,3,5,6,7};
//
//        int temp=0;
//        for(int i= arr.length-1,j=0;i>=arr.length/2;i--,j++){
//
//            temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//
//        for (int ele: arr)
//              {
//            System.out.println(ele);
//              }


           //Printing Method 1-> Using Stream Api
//        Arrays.stream(rev).forEach(System.out::println);


        //Printing method 2 -> For Each Loop
//        for ( int ele: rev ) {
//            System.out.println(ele);
//        }



        //Method 3-> Via Wrapper Classes
        Integer[] arr={3,9,2,4,5,6,6,74,33,3333,9990};
        Arrays.sort(arr, Collections.reverseOrder());


        for(int ele:arr){
            System.out.println(ele);
        }





    }

}
