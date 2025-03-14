
            import java.util.*;

            public class vow {
                public static void main(String[] args) {
                    String x[] = {"a", "e", "i", "o", "u"};
                    Scanner input = new Scanner(System.in);
                    String s = input.nextLine();
                    int detect = 0;
                    int i=0;
                    while(i<=4){
                        if(s.equals(x[i])){
                            detect=1;
                      }
                      i=i+1;
                    }
                       if (detect==1){
                      System.out.println("vowels");

                       }
                       else{
                        System.out.println("not a vowels");
                       }
                    }
                 }
             
            