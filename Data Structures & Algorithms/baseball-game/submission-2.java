class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int result = 0;
        for(String s:operations){
            if(s.equals("+")){
                int top = stk.pop();
                int newTop = stk.peek() + top;
                stk.push(top);
                stk.push(newTop);
                result+=newTop;
            }else if(s.equals("D")){
                int newTop = stk.peek()*2;
                stk.push(newTop);
                result+=newTop;

            }else if(s.equals("C")){
                result = result - stk.pop();
                
            }else{
                int newTop = Integer.parseInt(s);
                stk.push(newTop);
                result+=newTop;
            }
        }
        return result;
    }
}