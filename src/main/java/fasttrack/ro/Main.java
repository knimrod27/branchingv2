package fasttrack.ro;

import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5};
        System.out.println(reverseProd(arr));
        System.out.println(reverseProdWithFor(arr));

    }

    public static int reverseProd(int[] arr) {
        int index = arr.length -1;
        int prod = 1;
        while(index > 0) {
            prod *= arr[index];
            index--;
        }

return prod;
    }

    public static int reverseProdWithFor(int[] arr) {
        int prod = 1;
        for(int i = 0; i< arr.length; i ++) {
            prod *=arr[i];

        }
        return prod;
    }
}