
public class test {
	public static void main(String[] args)
	{
		Car[] cars;
		cars = new Car[2];

		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i = 0; i < cars.length; i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("��" + (i + 1) + "�Ӫ������O�O" + cl);
		}
	}

}

class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������" + num + "�A�T�o�q��" + gas + "�����l");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��" + gas);
	}
	
	public String toString()
	{
		String str = "����" + num + "�T�o�q" + gas;
		return str;
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}	
	
	public RacingCar(int n, double g, int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����" + course + "���ɨ�");
	}

	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);
	}

	public void show()
	{
		System.out.println("�ɨ���������" + num);
		System.out.println("�T�o�q�O" + gas);
		System.out.println("�ɨ��s���O" + course);
	}
}