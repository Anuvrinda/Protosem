class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        checkPalindrome(str);

    }

    static void checkPalindrome(String str) {
        if (str.length() == 1) {
            System.out.println("String is a Palindrome");
            return;
        } else if(str.length() == 2) {
            if(str.charAt(0) == (str.charAt(str.length() - 1)))
            System.out.println("String is a Palindrome");
            else
            System.out.println("String is not a Palindrome");
            return;
        }

        if (str.charAt(0) == (str.charAt(str.length() - 1)))
            checkPalindrome(str.substring(1, str.length() - 1));
        else
            System.out.println("String is not a Palindrome");

    }
}