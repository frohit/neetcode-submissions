class MyHashMap {
    ArrayList<ArrayList<int[]>> map = new ArrayList<>(1000);
    public MyHashMap() {
        for(int i = 0;i<1000;i++){
            map.add(new ArrayList<int[]>()); 
        }
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        ArrayList<int[]> pair = map.get(idx);
        for(int[] p: pair){
            p[0] = key;
            p[1] = value;
            return;
        }
        pair.add(new int[]{key,value});
        // map.get(idx).add(new int[]{key,value});
    }
    private int hash(int key){
        return key%1000;
    }
    
    public int get(int key) {
        int idx = hash(key);
        ArrayList<int []> pair = map.get(idx);
        for(int[] p: pair){
            if(p[0] == key)
                return p[1];
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        ArrayList<int []> pair = map.get(idx);
        for(int i = 0;i<pair.size();i++){
            if(pair.get(i)[0] == key)
                pair.remove(i) ;
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */