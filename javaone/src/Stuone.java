
public class Stuone
{
      //ѧ������
	String name;
	
	//ѧ������
	byte age;
	
	//ѧУ����
	static String schoolName;
	
	//ѧ������
	static int stuCount;
	
	public static void main(String[] args)
	{
		//��̬��������ֱ��ʹ�þ�̬����
		schoolName="�Ͼ��Ƽ�ְҵѧԺ";
		//Ҫ��ʵ�����е�ʵ�����������ȴ������ʵ������
		Stuone one = new Stuone();
		one.name="�����";
		one.age=20;
		System.out.println(one.schoolName);
		
		
		Stuone three = new Stuone();
		three.name="·͢�";
		three.age=19;
		System.out.println(three.schoolName);
		
		
		three.schoolName="�Ͼ��Ƽ�ְҵѧԺ";
		System.out.println(one.schoolName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
