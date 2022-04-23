import java.util.*;
public class philo{
public static void main(String[]args){
	Scanner input = new Scanner(System.in);

  int x,y;
  x=input.nextInt();

  y=input.nextInt();

 System.out.print(gcd (x,y));
    }




 static int  gcd (int x, int y)
{
    int gcd_o ;
      gcd_o = (x%y ==0)?  y : gcd (x, x%y );

return gcd_o;
  }
    }
