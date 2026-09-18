class Solution {
    public String reorderSpaces(String text) {
        String[]words=text.trim().split("\\s+");
        int spaces=0;
        for(char ch:text.toCharArray()){
            if(ch==' '){
                spaces++;
            }
        }
        if(words.length==1){
            return words[0]+" ".repeat(spaces);
        }
        int bet=spaces/(words.length-1);
        int ext=spaces%(words.length-1);
        String ans=String.join(" ".repeat(bet),words);
        ans+=" ".repeat(ext);
        return ans;
    }
}