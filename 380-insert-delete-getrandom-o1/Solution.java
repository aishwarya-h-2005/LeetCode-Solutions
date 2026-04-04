class RandomizedSet {
        HashMap<Integer, Integer>map;
        ArrayList<Integer>list;
        Random rand;

    public RandomizedSet() {
      map=new HashMap<>();
      list=new ArrayList<>();
      rand=new Random();
    }
    
    public boolean insert(int val) {
       
       if(map.containsKey(val))
       {
        return false;
       }
        else
        {
            map.put(val,list.size());
            list.add(val); 
            return true;
        }
       }
    
    public boolean remove(int val) {
   if(!map.containsKey(val)) {
        return false;
   }

   int index = map.get(val);
   int last = list.get(list.size() - 1);

   // swap
   list.set(index, last);
   map.put(last, index);

   // remove last
   list.remove(list.size() - 1);
   map.remove(val);

   return true;
}
    public int getRandom() {
       int i = rand.nextInt(list.size());
        return list.get(i);
    }   
    
}
