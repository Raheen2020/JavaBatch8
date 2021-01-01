package Com.Syntax.Class31;

import java.util.ArrayList;

public class Task {

        public static void main(String[] args) {
            ArrayList<Integer> number=new ArrayList<>();
            for(int i=1; i<=50;i++)
            {
                if(i%2==0)
                {
                    number.add(i);
                }
            }
            System.out.println(number);
            number.removeIf(next -> next % 5 == 0);
            System.out.println(number);
        }
    }




