
public class Stuemp
{
	//��ʵ������
    String name;
    
    boolean flag;
    
    double money;
    
    //���徲̬����
    
    //��˾Ա������
    static int count;
    
    //��λ����
    static String dname;
    
    void empDm()
    {
    	name="�����";
    	
    	
    }
    
    //main�����Ǹ����ⷽ����static�ǹؼ��֣���̬���εķ���
    public static void main(String[] args)
	{
	System.out.println("1-->"+count);
		
		//��main�����У�ʵ������Ķ���
		
    Stuemp ol = new  Stuemp();
    System.out.println(ol.name+","+ol.flag);
	ol.name="÷÷";
    ol.money=200;
	ol.dname="�ϿƼ�";
	
	count++;
	
	 Stuemp dl = new  Stuemp();
	 System.out.println(ol.name+","+ol.flag);
	 dl.name="����";
	 dl.money=100;
	 count++;
	 
	 System.out.println("����Ա����������:"+count);
	 ol.dname="�����ϿƼ�";
	 System.out.println(ol.name+"-->"+ol.dname);
	 System.out.println(dl.name+"-->"+dl.dname);
		
		 
		 
	}
    
   
    	
    	
    
    
    
    
}
