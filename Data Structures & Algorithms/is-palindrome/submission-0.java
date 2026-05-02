class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");
        s = s.replaceAll("[^a-z0-9]","");
        System.out.println(s);
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
