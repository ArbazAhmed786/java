class A
{
    int i = 1;
    void display()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    int i = 2;
    void display()
    {
        System.out.println("class B");
    }
    
}

class P4
{
    public static void main(String args[]) {

        B obj = new B();
        obj.display();     
        System.out.println(obj.i); 

        A a = new B();
        a.display();

        // B b = new A(); gives error child refernce cannot access parent refernce
        // b.display();

    }
}




