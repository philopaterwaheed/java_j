import java.util.*;
public class philo{
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
// fac(i)= 1/2+2/3+........(x/x+1)
  int x;
  x=input.nextInt();


 System.out.print(fac(x));
    }




 static double  fac (int x)
{
    double fac_o ;
      if (x==1)
		return 1/2 ;

	else
	{
	fac_o=	((x/x+1.0)+fac(x-1));
		return fac_o;

	}




  }
    }
