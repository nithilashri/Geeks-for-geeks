import java.util.HashSet;
class Solution {
    boolean twoSum(int arr[], int target) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            int comp = target - num;
            if(set.contains(comp)){
                return true;
            }else{
                set.add(num);
            }
        }
        
        return false;
        
        // code here
        
    }
}