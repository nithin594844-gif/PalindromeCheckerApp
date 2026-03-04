import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "level";
        boolean isPalindrome = true;
        long start = System.nanoTime();
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
            stack.push(c);
        for(char c : input.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution time : " + (end - start) + " ns");
    }
}
