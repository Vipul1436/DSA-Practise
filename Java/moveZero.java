import java.util.*;
public class moveZero {

    public static void main(String[] args) {
        
        int[] nums = {1, 0, 5, 0, 8, 5, 10, 0, 48, 50, 0, 87, 0, 85};
        int insertPos = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        while(insertPos < nums.length){
            nums[insertPos] = 0;
            insertPos++;
        }

        System.out.println(Arrays.toString(nums));

    }
}
