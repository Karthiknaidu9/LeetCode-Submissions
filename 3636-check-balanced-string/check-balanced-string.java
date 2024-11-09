class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0, oddSum = 0;
        for(int i=0; i<num.length(); i++){
            int ch = Character.getNumericValue(num.charAt(i));
            if(i%2 == 0){
                evenSum += ch;
            }
            else{
                oddSum += ch;
            }
        }
        if(evenSum == oddSum){
            return true;
        }
        else{
            return false;
        }
    }
}