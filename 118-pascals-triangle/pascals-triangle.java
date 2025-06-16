class Solution {
    public List<List<Integer>> generate(int nums) {
    List<List<Integer> > ll = new ArrayList<>();
    for(int i= 1; i <= nums; i++) {
        List<Integer> l = new ArrayList<>();
        if(i==1){
            l.add(1);
            ll.add(l);
            continue;
        }
        int ad=1;
         for(int j= 0; j <i; j++) {
             if(j==0){
                l.add(ad);
                 continue;
             }
             ad=ad*(i-j);
             ad=ad/j;
             l.add(ad);
          }
        ll.add(l);
      }
    return ll;
    }
}