import java.lang.StringBuffer;
public class palindrome{
    public static void main(String[]args)
    {
        String str="madam";
        StringBuffer newstr=new StringBuffer();
        for(int i=(str.length()-1);i>=0;i--)
        {
            newstr=newstr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newstr.toString()))
        {
            System.out.println("String is a Palindrome");
        }
        else
        {
            System.out.println("String is not a Palindrome");
        }
    }
}