import java.util.Scanner;

public class Check_palindrome{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String word,emp="";
        char c;
        System.out.println("Enter Word to check: ");
        word=input.nextLine();
        word=word.toLowerCase();
        for(int i=word.length()-1;i>=0;i--){
            c=word.charAt(i);
            emp=emp+c;
        }
        System.out.println(emp);
        if(word.equals(emp)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }
}