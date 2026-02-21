public class Practise {

    public static void main(String[] args) {
        int [] arr = {3, 3, 2, 3, 3, 2, 2};

        int currElement = arr[0];
        int count = 0;

        for(int i=0; i<arr.length; i++){

            if(count == 0){
                currElement = arr[i];
            }else if(arr[i] == currElement){
                count++;
            }else{
                count--;
            }

            
        }

        // System.out.println(count);
        System.out.println(currElement);
    }
}
