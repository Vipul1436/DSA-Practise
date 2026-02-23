class maxSubarray {

    public static void main(String[] args) {
        int [] num = {1};
        int currSum = num[0];
        int sum = num[0];

        for(int i=1; i<num.length; i++){
        currSum = currSum + num[i];
        if(currSum<num[i]){
            currSum = num[i];
        }
        sum = Math.max(sum, currSum);
        }

        System.out.println(sum);


    }
    
}
