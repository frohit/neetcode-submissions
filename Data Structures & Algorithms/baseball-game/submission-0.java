class Solution {
    public int calPoints(String[] operations) {
        int stk[] = new int[operations.length];
        int top = -1;
        for(String s:operations){
            if(isNum(s)){
                top++;
                stk[top] = Integer.parseInt(s);
            }else if("+".equals(s)){
                int temp = stk[top] + stk[top-1];
                stk[++top] = temp;
            }else if("D".equals(s)){
                stk[++top] = stk[top-1]*2;
            }else if("C".equals(s)){
                top--;
            }
        }
        int sum = 0;
        for(int i = 0;i<=top;i++){
            sum+=stk[i];
        }
        return  sum;
    }
    private boolean isNum(String s){
        try{Integer.parseInt(s);
    }
    catch(NumberFormatException e){
        return false;
    }
    return true;
    }
}