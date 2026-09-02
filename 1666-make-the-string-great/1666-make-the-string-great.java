class Solution {
    public String makeGood(String s) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(res.length() >0 && Math.abs(ch-res.charAt(res.length()-1))==32) res.deleteCharAt(res.length()-1);
            else res.append(ch);
        }
        return res.toString();
    }
}