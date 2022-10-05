package test.com.hello;

import java.math.BigInteger;

public class Test02type_variable {

	/* final */ byte b = 0;//0
	//��������,����� �ƴҶ��� �ʱ�ȭ���� ������ �⺻���� �Ҵ�.
	//����: final����ô� �ݵ�� �ʱ�ȭ.
	
	public static void main(String[] args) {
		//Ÿ�԰� ����
		//Ÿ������ : �⺻Ÿ��,����Ÿ��(��ü,�迭)
		//���� : �ҹ��ڷ� �����ϴ� ��� ����.
		//		: ��������, ��������
		//final ǥ��� ���(����Ұ���)����,�б������� �ǹ�.
		
		//�⺻Ÿ��:
		//1.����(byte,short,char,int,long)�⺻��0
		/* final */ byte b = 0;//���� + �ʱ�ȭ
		//��� = ������(�ʱ�ȭ)
		b = 10;//1����Ʈ �뷮1byte==8bit:0000 0000
		System.out.println(b);//��Ȯ��
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		
		short s = 100;//2byte
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		char c = 100;//2byte,0 �Ǵ� ���� ����
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		char c2 = 'A';//
		c2 = (char) 70000;//
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		
		int su = 100;//4byte
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		long ll = 3000000000L;//8byte
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		//2.�Ǽ�(float,double)0.0�⺻��
		float f = 3.14f;
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		double d = 3.14;
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		//3.������(boolean) 0-false(�⺻��),1-true, 
		boolean bool = false;//true
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		//����Ÿ�� ��,null �⺻��(�ּҰ� �Ҵ�ȵǾ���.)
		//1.���ڿ�(String)
		String name = "A";
		System.out.println(name);
		name = "lee";
		System.out.println(name);
		
		String name2 = new String(new char[] {'A'});
		System.out.println(name2);
		
		String name3 = new String("A");
		System.out.println(name3);
		
		//********ū������ü : BigInteger

		int money = 2100000000;
		int ea = 100000000;
//		int money = 2100000000,ea = 100000000;
//		int money,ea,a22,b22,c22;
		

		System.out.println(money + ea);
		//4byte������ ����� �ڵ� ĳ�����̵ȴ�.

		System.out.println(money - ea);

		System.out.println(money * ea);

		System.out.println(money / ea);

		System.out.println(money % ea);

		System.out.println((int)2200000000L);

		System.out.println("=================");
		
		//BigInteger�� ����ϸ� �ڵ�ĳ������ �ȵǰ� �������� ���Եȴ�.

		BigInteger bmoney = new BigInteger("2100000000");

		BigInteger bcount = new BigInteger("100000000");

		System.out.println(bmoney.add(bcount));

		System.out.println(bmoney.subtract(bcount));

		System.out.println(bmoney.multiply(bcount));

		System.out.println(bmoney.divide(bcount));

		System.out.println(bmoney.remainder(bcount));
		
		//2.�迭(���Ÿ��[],{},new)
		//3.��ü(new,SxxxxŬ����)

		
		String user_name = "lee";
		//String �̸� = "��";
		System.out.println("���ڿ� 'ȿ���϶�'");
		System.out.println("���ڿ� \"ȿ���϶�\"");
		System.out.println("���ڿ� 5\\3");
		
		byte x2 = 99;
		int y2 = x2;
		byte z2 = (byte) y2;
		
		//(type),(������),(��,��,��,),(type var,,,)
		
		byte su1 = 10;
		byte su2 = 20;
		byte sum = (byte) (su1 + su2) ;
		
		int total = 299;
//		double avg = total/3.0;
		double avg = (double)total/3;
		System.out.println("avg:"+(avg+100));
		System.out.printf("avg:%.2f\n",avg);
		
		//double class
		
		//�⺻Ÿ���� �����Ǵ� ���� ���ڿ��� ��ȯ�ϱ�.
		//100+100 >> "100"+100
		int score = 100;
		System.out.println(score+100);
		System.out.println(String.valueOf(score)+100);
		
		System.out.println(new Integer(score).toString()+100);
		
		//���ڿ��ε� �����Ǵ� ���� �⺻Ÿ������ ��ȯ�ϱ�.
		//"1000"+1000 >> 1000 + 1000
		String point = "1000";
		System.out.println(point + 1000);
		System.out.println(
				Integer.parseInt(point) + 1000);
		
		String point2 = "3.14";
		System.out.println(
				Double.parseDouble(point2) + 1000);
		String t_f = "true";
		//!"true" >> false
		System.out.println(!true);
		System.out.println(!Boolean.parseBoolean(t_f));
	}//end main()

}//end class


