class Solution {
    public int candy(int[] ratings) {
        int[] arr = new int[ratings.length];
        Arrays.fill(arr, 1);
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length; i++) {
                int leftval = 0, rightval = 0;
                if (i != 0 && ratings[i - 1] < ratings[i] &&arr[i - 1] >= arr[i]) {
                    changed=true;
                    leftval = arr[i - 1];
                }
                if (i != arr.length - 1 && ratings[i + 1] < ratings[i]&& arr[i + 1] >= arr[i]) {
                    changed=true;
                    rightval = arr[i + 1];
                }
                if(leftval!=0||rightval!=0){
                    arr[i]=Math.max(leftval,rightval)+1;
                }
            }
        }
        int res=0;
        for(int i = 0; i < arr.length; i++){
        // System.out.println(arr[i]);
            res+=arr[i];
        }
        return res;
    }
}