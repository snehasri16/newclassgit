package com.prevqs;
import java.util.*;
public class PlayerOfTheYear {
    static  int findBestPlayer(int[][] a ,int n,int m){
        int result=-404;
        int[] best=new int[m];
        //1.we will store highest of each game in an array
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(a[j][i]>c){
                    c=a[j][i];
                }
            }
            best[i]=c;
        }
        //2.now find the duration of highest period best player
        int longest=0;
        int p=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==best[j]){
                    count++;
                }
            }
            if(count>longest){
                longest=count;
                p=i;
            }
        }
        result=p+1;
        return result;
    }
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        */
        int[][] series = {
                {1, 3, 4, 5},
                {7, 2, 3, 4},
                {1, 3, 2, 1}
        };
        System.out.println(findBestPlayer(series,series.length,series[0].length));
    }
}
