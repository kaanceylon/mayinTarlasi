import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Welcome to Mine Sweeper Game!");
        System.out.println("Please enter a Row and Column size !");
        System.out.println("Enter a Row size : ");
        row = scan.nextInt();
        System.out.println("Please enter a Column size : ");
        column = scan.nextInt();
        MineSweeper mayin = new MineSweeper(row,column);
        mayin.run();


    }


}
