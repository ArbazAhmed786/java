import java.lang.*;
class Student
{
    String name;
    int regno;
    int marks;
    Student()
    {
        name = "madiha";
        regno = 1;
        marks = 99;
    }

    Student(String n,int r,int m)
    {
        name = n;
        regno = r;
        marks = m;
    }

    void display()
    {
        System.out.println(name + " " + regno + " " + marks);
    }
}

class P1
{
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        Student s2 = new Student("arbaz",2,98);
        s2.display();
        
    }
}