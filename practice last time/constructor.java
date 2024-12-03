class rectangle{
    int length;
    int breadth;
    rectangle(){
        System.out.println("constructor have the zero parameters");
        length=breadth=0;

    }
    rectangle(int l){
        System.out.println("constructor have one parameter");
        length=breadth=l;
    }
    rectangle(int l, int b){
        System.out.println("constructor have two parameters");
        length=l;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}
class constructorOverloading{
    public static void main(String args[]){
        rectangle r1=new rectangle();
        rectangle r2=new rectangle(5);
        rectangle r3=new rectangle(7,8);
        System.out.println("Area of rectangle r1: "+r1.area());
        System.out.println("Area of rectangle r1: "+r2.area());
        System.out.println("Area of rectangle r1: "+r3.area());
}
}