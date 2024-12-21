public class Constructor_overloading{
    int id;
    String name;

    Constructor_overloading()
    {
        System.out.println("this a default constructor");
    }
    Constructor_overloading(int i,String n)
    {
        id=i;
        name=n;
    }
    public static void main(String[]args){
        Constructor_overloading s1=new Constructor_overloading();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student ID:"+s1.id+"\nStudent Name:"+s1.name);

        System.out.println("\nParameterized Constructor values: \n");
        Constructor_overloading s2=new Constructor_overloading(10,"Abc");
        System.out.println("Student ID:"+s2.id+"\nStudent Name:"+s2.name);
    }
}




