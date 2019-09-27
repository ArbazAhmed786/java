import java.lang.*;
class Emp
{
    String name;
    Double salary;
    Emp(String n,double s)
    {
        name = n;
        salary = s;
    }

    void getdetails(String n,double s)
    {
         name = n;
         salary = s;
    }
    void print(){
        System.out.println("details are : " + name + " " + salary);
    }
}

class P5
{
    public static void main(String args[]) {
        Emp[] e1 = new Emp[3];



        e1[0] = new Emp("Arbaz Ahmed",200000);
        e1[1] = new Emp("Saif Ahmed",200000);
        e1[2] = new Emp("Shehzan",200000);

        for(int i = 0;i<3;i++)
        {
            e1[i].print();
        }

        for(int i = 0; i < 3; i++)
        {
            e1[i].getdetails("madiha rafi", 300000);
        }

         for(int i = 0;i<3;i++)
        {
            e1[i].print();
        }    
    }
}