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
