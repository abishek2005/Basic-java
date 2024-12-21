public class Method_overloading {
    int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    int add(int a,int b,int c)
    {
        int sum=a+b+c;
        return sum;
    }
    double add(double a,double b)
    {
        double sum=a+b;
        return sum;
    }

    public static void main(String[]args){
        Method_overloading obj=new Method_overloading();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10.6,20.5));
    }
}
