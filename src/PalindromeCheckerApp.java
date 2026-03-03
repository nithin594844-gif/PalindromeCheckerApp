public class PalindromeCheckerApp {
    public static void main(String[] args){
        String str1 = "madam";
        String str2 = "";
        for(int i = str1.length()-1;i>=0;i--){
            char ch = str1.charAt(i);
            str2 = str2 + ch;
        }
        if(str1.equals(str2))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
