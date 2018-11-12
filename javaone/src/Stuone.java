
public class Stuone
{
      //学生姓名
	String name;
	
	//学生年龄
	byte age;
	
	//学校名字
	static String schoolName;
	
	//学生数量
	static int stuCount;
	
	public static void main(String[] args)
	{
		//静态方法可以直接使用静态变量
		schoolName="南京科技职业学院";
		//要想实例类中的实例变量，首先创建类的实例对象
		Stuone one = new Stuone();
		one.name="刘燕凤";
		one.age=20;
		System.out.println(one.schoolName);
		
		
		Stuone three = new Stuone();
		three.name="路廷炜";
		three.age=19;
		System.out.println(three.schoolName);
		
		
		three.schoolName="南京科技职业学院";
		System.out.println(one.schoolName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
