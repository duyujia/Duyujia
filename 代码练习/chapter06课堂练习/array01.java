public class array01 {
	public static void main(String[] args) {
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;
		// double totalweight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
		// double avgweight = totalweight / 6;
		// System.out.println(avgweight);

		//����һ������
		//1.double[]��ʾ��double���͵����飬������hens
		//2.{3,5,1,3.4,2,50}��ʾ�����ֵ/Ԫ�أ�һ�α�ʾ����ĵڼ���Ԫ��
		//3.
		double[] hens = {3,5,1,3.4,2,50};

		//��������õ����������Ԫ�صĺͣ�ʹ��for
		//1.���ǿ���ͨ��hens[�±�]�����������Ԫ�أ���һ��Ԫ�ؾ���hens[0]
		//2.ͨ��for�Ϳ���ѭ���ķ��������Ԫ��/ֵ
		//3.ʹ��һ������totalweight
		double totalweight = 0;
		for(int i = 0;i < hens.length;i++) {
			System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ=" + hens[i]);
			totalweight += hens[i];
		}
		System.out.println("������=" + totalweight + "ƽ������=" +totalweight / hens.length);
	}
} 