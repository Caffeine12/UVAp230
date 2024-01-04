import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> bookList = new ArrayList();
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        
        while(!input.equals("END"))
        {
            String[] bookArr= input.split("\"", 0);
            bookList.add(bookArr[1]);
            input=sc.nextLine();

        }

        System.out.println(bookList);

        input= sc.nextLine();
        while(!input.equals("END"))
        {
            String[] manage = input.split("\"",0);

            /*if(manage[0]=="BORROW")
            {

            } */
            input= sc.nextLine();
            System.out.println(manage[0]);
        }
    
        
    }
}
