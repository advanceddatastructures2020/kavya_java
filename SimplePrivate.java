class A{
private int data=40;
pivate void msg()
{
System.out.println("Hello java");}
}
 public class SimplePrivate{
  public static void main(String args[]){
     A obj=new A();
     System.out.println(obj.data);//comple Time Error
     obj.msg();//comple Time Error
      }
}