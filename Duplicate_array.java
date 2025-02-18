import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int array[] = { 1, 2, 3, 1 };
        Arrays.sort(array);

        int flag=0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                flag=1;
            } else {
                return false;
            }
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}