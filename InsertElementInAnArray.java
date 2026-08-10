//insert the element if the size is fixed

class InsertElement {
    public static void main(String[] args) {
        int [] arr ={10, 20, 30, 40, 50};
        int position = 4;
        int element = 55;
        
        int[] newArr = new int[arr.length + 1];
        for (int i = 0 ; i<newArr.length ; i++){
            if(i < position){
                newArr[i] = arr[i];
            }else if (i == position){
                newArr[i] = element;
            }else{
                newArr[i] = arr[i -1];
            }
        }
        for(int i = 0 ; i < newArr.length ; i++){
            System.out.print(newArr[i] + " ");
        }
        
    }
}

// insert the element if the size is not fixed
class InsertElement {
    public static void main(String[] args) {
        int [] arr= new int [6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2]= 30;
        arr[3]= 40;
        arr[4]= 50;
        
        int size =5;
        int position = 5;
        int element = 35;
        
        for(int i=4 ; i>=position ; i--){
            arr[i+1] = arr[i];
        }
        arr[position] = element;
        size++;
        for(int i=0 ; i<size ; i++){
        System.out.print(arr[i] + " ");
        }
       
    }
}

