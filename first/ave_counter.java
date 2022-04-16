import java.util.Scanner ;
public class philo{
	public static void main(String[]args){
	Scanner input = new Scanner (System.in);
	int[]  philo = new int[5];
        int count = 0;
        int count_2 = 0;

    for(int i =0 ;i<philo.length;i++ )
        {

            philo[i]=input.nextInt();
            if ( philo[i]<0)
                break;
        }
    for (int c = 0 ; c<philo.length;c++  ) {
            count += philo[c] ;
            count_2++;
        }

            System.out.println("ave is " + count/count_2 );
    }


}
