import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String r;
        int l, i;
        String r2 = "";

        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        r= sc.nextLine();
        l = r.length();

        for (i = l-1; i >= 0; i--) {
            r2= r2 + r.charAt(i);

        }
        System.out.println("reversed string " + r2);
    }
}
