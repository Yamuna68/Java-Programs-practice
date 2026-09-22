class FirstNonRepeatingElement {
    public static void main(String[] args) {
        String str = "progrmming";
        for(int i = 0; i<=str.length(); i++){
            boolean repeated = false;
            for(int j=0 ; j<=str.length(); j++){
                if(i!= 0 && str.charAt(i) == str.charAt(j)){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                System.out.print("First non repeating elemnt is ; " + str.charAt(i));
                break;
                
            }
            
        }
       
    }
}
