import java.util.Scanner;
  public class div{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    if(n%3==0||n%5==0)
    {
        System.out.print("divisible");
    }
    else{
        System.out.print(" not divisible");
    }
  }}