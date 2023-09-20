class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       ArrayList<Integer>basket[]=new ArrayList[nums.length+1];
       HashMap<Integer,Integer>map=new HashMap<>();
       for(Integer i:nums){
           map.put(i,map.getOrDefault(i,0)+1);

       }
       for(Integer key:map.keySet()){
           int frequency=map.get(key);
           if(basket[frequency]==null){
               basket[frequency]=new ArrayList<>();

           }
           basket[frequency].add(key);
       }
       int res[]=new int[k];
       int counter=0;
       for(int i=basket.length-1;i>=0&&counter<k;i--){
           if(basket[i]!=null){
               for(Integer it:basket[i]){
                   res[counter++]=it;
               }
           }
       }
       return res;
    }
}
