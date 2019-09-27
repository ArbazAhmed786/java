class Emp
{
    String name;
    int id;
    void getData(String n,int i)
    {
        name = n;
        id = i;
    }

    void putData(){
        System.out.println("Employee details are: " + " " + name + " " + id);
    }


}

class P2
{
    public static void main(String args[]) {
        Emp e1 = new Emp();
        e1.getData("Shehzan",5);
        e1.putData();
        
    }
}