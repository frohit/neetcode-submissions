class MyHashSet {
    ArrayList<Integer>[] hashSet = new ArrayList[1000];
    public MyHashSet() {
        for(int i = 0;i<1000;i++){
            hashSet[i] = new ArrayList<>();
        }
    }
    private int hashfn(int key){
        return key%1000;
    }
    
    public void add(int key) {
        if(!this.contains(key))
            {
                int hash = hashfn(key);
                hashSet[hash].add(key);
            }
    }
    
    public void remove(int key) {
        if(this.contains(key))
            {
                int hash = hashfn(key);
                hashSet[hash].remove(Integer.valueOf(key));
            }
        
    }
    
    public boolean contains(int key) {
        int hash = hashfn(key);
        if(hashSet[hash] == null) return false;
        for(int i:hashSet[hash]){
            if(i == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */