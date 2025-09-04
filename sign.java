import java.util.Scanner;
  public class sign{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    if(n<0)
    {
        System.out.print("negative");
    }
    else{
        System.out.print("positive");
    }
  }}