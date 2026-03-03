class PalindromeService{
    String input;
    boolean isPalindrome = true;
    public boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length() - 1;
        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + input);
        return isPalindrome;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input  = "racecar";
        PalindromeService PS = new PalindromeService();
        System.out.println("Is Palindrome? : " + PS.checkPalindrome(input));
    }
}
