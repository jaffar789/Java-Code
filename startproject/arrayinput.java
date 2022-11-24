package startproject;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinput {

	public int peakElement(int[] arr,int n)
    {
       int max=0;
       for(int i=0 ; i<n ; i++){
            if(max<arr[i]){
              max = arr[i];   
            }
       }
       
        for(int i=0;i<n;i++){

           if(arr[i]==max){

               return i;

           }

       }
       return -1;

    }




}
