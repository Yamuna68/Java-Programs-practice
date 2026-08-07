import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,3,45,67,89,30};
        int target = 30;
        int index = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                index=i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Element found : " +index);
        }else{
            System.out.println("element not found");
        }
       
    }
}
