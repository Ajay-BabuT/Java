import java.util.*;
public class Add2Array {
    
    public class Add{
        int [] array1=new int[100];
        int [] array2=new int[100];
        int [] array3=new int[100];
        int limit;
        void getData(){
            Scanner read=new Scanner(System.in);
            System.out.println("Enter limit : ");
            limit=read.nextInt();
            System.out.println("Enter elements for array 1 : ");
            for(int i=0;i<limit;i++){
                array1[i]=read.nextInt();
            }
            System.out.println("Enter elements for array 2 : ");
            for(int i=0;i<limit;i++){
                array2[i]=read.nextInt();
            }
        }
        void display(){
            System.out.println("\nAdded elements : ");
            for(int i=0;i<limit;i++){
                System.out.print(array3[i]+" ");
            }
        }
        void AddArray(){
            for(int i=0;i<limit;i++){
                array3[i]=array1[i]+array2[i];
            }
        }
    }
    
    public static void main(String ar[]){
        Add2Array Main=new Add2Array();
        Add ob=Main.new Add();
        ob.getData();
        ob.AddArray();
        ob.display();
    }
    
}