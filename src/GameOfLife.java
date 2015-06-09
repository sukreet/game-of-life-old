/**
 * Created by sukreetr on 6/1/15.
 */

import java.util.*;

public class GameOfLife {

    static int locality[][] = new int[5][5];
    int isAlive(int i,int j)
    {
        if(location[i][j]==1;
    }
}


    public static int input()
    {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dead or alive ");
        a=in.nextInt();
        return(a);
    }

    public static void initiate_locality()
    {
        System.out.println("Enter locality status");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("position " + i + " " + j);
                locality[i][j] = input();
            }

        }


    }


    public static int surr_count(int i,int j)

    {
        int count=0;

        for(int a=i-1;a<i+1;a++)
        {

        for(int b=j-1;b<j<+1;b++)
            {
                if(locality[a][b]==1 && a>=0 && b>=0 && a!=i && b!=j && a<=5 && b<=5)
                    count++;
            }
        }

    return (count)
    }

    public static void play()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(locality[i][j]==1 && surr_count(i,j)<2)
                    locality[i][j]==0;
                else if(locality[i][j]==1 && surr_count(i,j)>2)

            }

    }

}
