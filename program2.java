public class program2 
{
	/* �������� ���������, ������� ��������� �� ���� ��� ������ (a � b) � ���������� ��. � ���������� 
	   ��������� � ������� ������ ���� �������� ���� �� ���������: "������ �����������" ��� "������ ���������"
    */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		if (a.equals(b)) 
		{
            System.out.println("������ ���������");
        } 
		else 
		{
            System.out.println("������ �����������");
        }
	}
}
