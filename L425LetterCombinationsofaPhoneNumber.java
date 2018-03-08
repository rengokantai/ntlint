public class L425LetterCombinationsofaPhoneNumber {
    //jz gp dfs1
    /**
     * @param digits: A digital string
     * @return: all posible letter combinations
     */
    List<String> ans = new ArrayList<String>();
    void dfs(int x,int l,String str,String digits,String[] phone){
        if(x==l){
            ans.add(str);
            return;
        }
        int num=digits.charAt(x)-'0';
        for(int i=0;i<phone[num].length();i++){
            dfs(x+1,l,str+phone[num].charAt(i),digits,phone);
        }
    }
    public List<String> letterCombinations(String digits) {
        // write your code here
        String[] phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            return ans;
        }
        
        dfs(0,digits.length(),"",digits,phone);
        return ans;
    }
}
