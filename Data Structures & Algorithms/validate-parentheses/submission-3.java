class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character,Character> mp = new HashMap<>();
        mp.put('(',')');
        mp.put('{','}');
        mp.put('[',']');
        Set<Character> ope = new HashSet<>();
        ope.add('(');
        ope.add('{');
        ope.add('[');
        
        for(Character c:s.toCharArray()){
            if(ope.contains(c)){
                stk.push(c);
            }
            else  if(stk.isEmpty()){return false;}else{
                if( c == mp.get(stk.peek())){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        if(stk.isEmpty() == false) return false;
        return true;
    }
}
