
class Additionwithouttemp{
public static void main(String [] args){
int num1 = 9;
int num2 = 20;
System.out.println("Before Swapping");
System.out.println(num1);
System.out.println(num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After Swapping");
System.out.println(num1);
System.out.println(num2);
}
}
