public class program1 
{
	/* 
	�������� ���������, ������� ��������� �� ���� ��� ����� ����� (a � b) � ��������� � ���� ��������� ��������:
	- ���������� ��� ��� ����� � ���������� ��������� ��������� ����� ������ � ������� ������ �� ���������: "a > b", "a < b" ��� "a = b";
	- ��������� � ����� ������� �������� ��������, ���������, ������� � ��������� � ��������� ������� � �������.
    */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a > b)
		{
			System.out.println("a > b");
		}
		else if (a < b)
		{
			System.out.println("a < b");
		}
		else
		{
			System.out.println("a = b");
		}
		
		System.out.println("a+b: " + (a + b));
		System.out.println("a-b: " + (a - b));
		System.out.println("a/b: " + (a / b));
		System.out.println("axb: " + (a * b));
		
	}
}
