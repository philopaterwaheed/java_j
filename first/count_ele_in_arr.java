import java.util.Scanner ;
public class philo{
	public static void main(String[]args){
	Scanner input = new Scanner (System.in);
	int[]  philo = new int[5];
        int [] count =new int[5];

    for(int i =0 ;i<philo.length;i++ )
                {
                        philo[i]=input.nextInt();
                      //  System.out.println(philo[i]);
                        for ( int c =0; c < count.length ; c++ )
                                {
                                    if (philo[i]==philo[c])
                                        count[i]++;                 



                                }



                        {
                            if ( philo[i]==0)
                            break;
                        }
                }


    for ( int i = 0 ;i<philo.length;i++)
                System.out.println(philo[i]+" is repeited" + count[i]+" times ");               

        }
}
