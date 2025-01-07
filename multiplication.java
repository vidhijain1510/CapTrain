import java.util.Scanner;

public class multiplication{
  public static void main(String[] args) {
    int x, y, mul;
    Scanner myObj = new Scanner(System.in);
        x = myObj.nextInt();
    y = myObj.nextInt();

    mul = x * y; 
    System.out.println("mul is: " + mul);
  }}