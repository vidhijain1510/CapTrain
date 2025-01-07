import java.util.Scanner;

public class division {
  public static void main(String[] args) {
    int x, y, div;
    Scanner myObj = new Scanner(System.in);
        x = myObj.nextInt();
    y = myObj.nextInt();

    div = x / y; 
    System.out.println("div is: " + div);
  }}