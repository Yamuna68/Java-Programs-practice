import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {10,30,40,70,80,90};
        int left = 0;
        int right = arr.length-1;
        int target = 60;
        int index = -1;
        while(left <= right){
            int mid = (left + right)/2;
            
            if(arr[mid] == target){
                index = target;
                break;
            }
            else if (target > arr[mid]){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        if(index != -1){
            System.out.println("element found : " +index);
        }else{
            System.out.println("element not found ");
        }
       
    }
}
