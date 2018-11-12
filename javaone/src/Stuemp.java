
public class Stuemp
{
	//定实例变量
    String name;
    
    boolean flag;
    
    double money;
    
    //定义静态变量
    
    //公司员工数量
    static int count;
    
    //单位名字
    static String dname;
    
    void empDm()
    {
    	name="刘燕凤";
    	
    	
    }
    
    //main方法是个特殊方法，static是关键字，静态修饰的方法
    public static void main(String[] args)
	{
	System.out.println("1-->"+count);
		
		//在main方法中，实例化类的对象
		
    Stuemp ol = new  Stuemp();
    System.out.println(ol.name+","+ol.flag);
	ol.name="梅梅";
    ol.money=200;
	ol.dname="南科技";
	
	count++;
	
	 Stuemp dl = new  Stuemp();
	 System.out.println(ol.name+","+ol.flag);
	 dl.name="李磊";
	 dl.money=100;
	 count++;
	 
	 System.out.println("现在员工的数量是:"+count);
	 ol.dname="扬子南科技";
	 System.out.println(ol.name+"-->"+ol.dname);
	 System.out.println(dl.name+"-->"+dl.dname);
		
		 
		 
	}
    
   
    	
    	
    
    
    
    
}
