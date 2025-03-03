class Box<T>
{
	T value;
	Box(T value)
	{
		this.value = value;
	}
	
	T getvalue()
	{
		return value;
	}
	
	void setValue(T value)
	{
		this.value = value;
	}
	
	void showType()
	{
		System.out.println("Type of T:"+value.getClass().getName());
	}
}

class GenericDemo
{
	public static void main(String args[])
	{
		Box<Integer> intBox = new Box<Integer>(100);
		System.out.println("integer value:"+intBox.getvalue());
		intBox.showType();
		
		Box<String> stringBox = new Box<String>("CSN");
		System.out.println("String value:"+stringBox.getvalue());
		stringBox.showType();
		
		Box<Double> doubleBox = new Box<Double>(100.0);
		System.out.println("Double value:"+doubleBox.getvalue());
		doubleBox.showType();
	}
}
	