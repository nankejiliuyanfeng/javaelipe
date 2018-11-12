package javaone;

public class Car
{
	//猫的名字
   private String name;
   
   //猫的颜色
   private String color;
   
   public void showCarInfo()
   {
	   //this表示当前对象，表示谁调用this,就代表谁
	   System.out.println(this.name+",颜色为:"+this.color);
   }
   
 public static void main(String[] args)
{
	 Car c1 = new Car();
	  c1.name="小环";
	  c1.color="小红";
	  
	  
	  c1.showCarInfo();
	  System.out.println("---------------------------");
	  
	  
	 Car c2 = new Car();
	  c2.name="小黑";
	  c2.color="黑色";
	  
	  c2.showCarInfo();
			  
}
  
	 
	  
	   
   
   
   
}
