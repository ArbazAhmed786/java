import java.util.*;
class Emp
{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    int sum = 0;
    Emp()
    {
       System.out.println("Enter name: ");
       name = sc.nextLine();
        System.out.println("Enter the id: ");
        id = sc.nextInt();
        
        

    }
    void putdata()
    {
        System.out.println("Employee details are :" + name + " " + id);
    }
}


class Prog3
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter number of employees ");
         n = sc.nextInt();


        Emp[] ob = new Emp[n];
        for(int i=0;i<n;i++){
            ob[i] = new Emp();
            //ob[i].putdata();
        }

        for(int i=0;i<n;i++){
            ob[i].putdata();
        }

        
    }
}
