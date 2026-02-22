class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        calculate(n,result);
        return result;
        
        
        
        
       
        
    }
    private void calculate(int num, ArrayList<Integer> result){
            result.add(num);
            if(num<=0){
                return;
            }
            calculate(num-5,result);
            result.add(num);
        }
}