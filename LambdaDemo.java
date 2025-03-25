interface MyLambda
{
	void sayHello();
}
interface MathOperation
{
	int operate(int a ,int b);
}
public class LambdaDemo
{
	public static void main(String args[])
	{
		MyLambda greeting = () -> System.out.println("Hello,Lambda!");
		greeting.sayHello();
		
		MathOperation add = (a,b) -> (a+b);
		MathOperation sub = (a,b) -> (a-b);
		MathOperation mul = (a,b) -> (a*b);
		MathOperation div = (a,b) -> (a/b);
		System.out.println(add.operate(1,2));
		System.out.println(sub.operate(1,2));
		System.out.println(mul.operate(1,2));
		System.out.println(div.operate(1,2));
	}
}