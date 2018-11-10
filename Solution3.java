package leetcode;

public class Solution3 {
    public String longestCommonPrefix(String[] strs) {
        String str = null;
        if(strs.length == 0){
            return "";
        }else if(strs[0].equals("") && strs.length == 1){
            return "";
        }
        if(strs[0] == null){
            return null;
        }
        for(int i = 0;i <= strs[0].length();++i){
            str = strs[0].substring(0,i);
            for(int j = 1;j < strs.length;++j){
                if(!strs[j].startsWith(str)){
                    if(i == 0){
                        return null;
                    }else if("".equals(str)){
                            return null;
                    }else{
                        return str.substring(0,i - 1);
                    }

                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] str = {"fl","flo"};

        System.out.println(new Solution3().longestCommonPrefix(str));
    }
}
