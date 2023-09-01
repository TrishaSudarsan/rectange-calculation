public class Main {
    public static void main(String[] args) {
        rectangle r1=new rectangle(5,6);
        System.out.println(r1.calcArea());
        System.out.println(r1.calcperimeter());
        rectangle r2=new rectangle(2,4);
        System.out.println(r2.calcArea());
        System.out.println(r2.calcperimeter());
    }
}
class rectangle{
    double length,breadth;
    public rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calcArea(){
        return (length*breadth);
    }
    double calcperimeter(){
        return (2*(length+breadth));
    }
}