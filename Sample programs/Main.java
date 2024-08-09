import java.lang.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int [][] a=new int[10][10];
        int m,n;
        System.out.println("Enter order of matrix : ");
        m=read.nextInt();
        n=read.nextInt();
        System.out.println("Enter elements of matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               a[i][j]=read.nextInt();
            }
        }
        System.out.println("Eneterd matrix is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Main Main=new Main();
        Matrix ob=Main.new Matrix();
        ob.trace(a,m,n);
        ob.transpose(a,m,n);
    }
    public class Matrix{
        void trace(int a[][],int m,int n){
        int tr=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if(i==j){
                tr=tr+a[i][j];
            }
            }
        }
        System.out.println("Trace is : "+tr);
    }
        void transpose(int a[][],int m,int n){
            System.out.println("Transpose is :");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}