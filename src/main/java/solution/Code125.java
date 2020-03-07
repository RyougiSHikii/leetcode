package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/25 23:34
 */
public class Code125 {

    public static void main(String[] args) {
        Code125 code125 = new Code125();
        System.out.println(code125.isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true;
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else{
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                l++;
                r--;
            }
        }
        return true;
    }

    private boolean isNotLetter(char c) {
        return (c < 'a' || c > 'z') && (c < '0' || c > '9');
    }
}
