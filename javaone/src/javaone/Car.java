package javaone;

public class Car
{
	//è������
   private String name;
   
   //è����ɫ
   private String color;
   
   public void showCarInfo()
   {
	   //this��ʾ��ǰ���󣬱�ʾ˭����this,�ʹ���˭
	   System.out.println(this.name+",��ɫΪ:"+this.color);
   }
   
 public static void main(String[] args)
{
	 Car c1 = new Car();
	  c1.name="С��";
	  c1.color="С��";
	  
	  
	  c1.showCarInfo();
	  System.out.println("---------------------------");
	  
	  
	 Car c2 = new Car();
	  c2.name="С��";
	  c2.color="��ɫ";
	  
	  c2.showCarInfo();
			  
}
  
	 
	  
	   
   
   
   
}
