class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        int overwrite_len = overwrite_string.length();
        for(int i = 0; i < overwrite_len; i++){
            sb.setCharAt(s + i, overwrite_string.charAt(i));
        }
        return sb.toString();
    }
}