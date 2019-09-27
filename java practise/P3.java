class Add
{
    void display(int a,int b)
    {
        int c = a + b;
        System.out.println("sum(1) is : " + c);
    }

    void display(double a,double b)
    {
        
        double c = a + b;
        System.out.println("sum(2) is : " + c);
    }
}

class P3
{
    public static void main(String args[]) {
        Add a = new Add();
        a.display(2,2);
        a.display(2.2,2.2);

        
    }
}