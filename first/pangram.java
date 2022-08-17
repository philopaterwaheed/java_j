public class pangram{


    static public  void main (String [] args ) {
        System.out.println("works like a sharm"); 
        System.out.print(check("The quick brown fox jumps over the lazy dog"));

    }

    public  static boolean check(String sentence){

        char [] letters = new char [26] ;  
        for (int a = 0;  a <= 25  ; a++)
           { letters[a]= (char) (a+49+48);
             System.out.print(letters[a]);
           }
           char [] sen = new char [sentence.length()] ;
        for (int i =0 ; i < sentence.length() ;i++)
            sen[i] = Character.toLowerCase(sentence.charAt(i));
        for (int c =0 ; c < letters.length; c++ )
           {
                  boolean l_is_there = false;
            for (int i  = 0 ; i < sentence.length(); i++)
              { 
     
                if (sen[i] == letters[c] )
                   {
                    System.out.print(sen[i] + " " + letters[c]);
                     l_is_there =true; 
                   }

              }
              System.out.println(c);
              if(l_is_there == true)
                continue;
              if (l_is_there == false)
                return false;
            
           }
        return true ; 
      }
      /*
       * ####
       *  just like math lol :)
       * passed 
       * 
       * 
       */

}
