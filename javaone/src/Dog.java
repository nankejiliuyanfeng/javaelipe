public class Dog
{
   //定义狗的颜色
	String colorName;
	
	//用方法 说明狗都喜欢吃骨头
	
	public static void eat()
	{
		System.out.println("狗都喜欢吃骨头破");
	}
	
	//对实例对象进行对象化
	
	public void setColorName(String colorName)
	{
		this.colorName=colorName;
		
	}
	
	public String getColorName()
	{
		return	this.colorName;
	}
	public static void main(String[] args)
	{
		//实例对象
		Dog c1= new  Dog();
		c1.colorName="黄色";
		System.out.println(c1.colorName);
	
		
	}
	
}
