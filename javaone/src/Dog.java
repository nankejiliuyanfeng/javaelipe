public class Dog
{
   //���幷����ɫ
	String colorName;
	
	//�÷��� ˵������ϲ���Թ�ͷ
	
	public static void eat()
	{
		System.out.println("����ϲ���Թ�ͷ��");
	}
	
	//��ʵ��������ж���
	
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
		//ʵ������
		Dog c1= new  Dog();
		c1.colorName="��ɫ";
		System.out.println(c1.colorName);
	
		
	}
	
}
