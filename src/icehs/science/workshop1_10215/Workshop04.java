package icehs.science.workshop1_10215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americanoNum = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int cafeLatteNum = getUserInput();
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagelNum = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamCheeseNum = getUserInput();
        
        long americanoPrice = americanoNum * 2000;
        long cafeLattePrice = cafeLatteNum * 3000;
        long bagelPrice = bagelNum * 1500;
        long creamCheesePrice = creamCheeseNum * 500;
        
        System.out.println( "========= �ݾ� =========" );
        System.out.print( " �Ƹ޸�ī�� : " + americanoPrice + "��\n");
        System.out.print( " ī��� : " + cafeLattePrice + "��\n");
        System.out.print( " ���̱� : " + bagelPrice + "��\n");
        System.out.print( " ũ��ġ�� : " + creamCheesePrice + "��\n");
        
        long totalPrice = americanoPrice + cafeLattePrice + bagelPrice + creamCheesePrice;
        long mileage = 0;
        System.out.println( "======================" );
        System.out.println("�� ���� �ݾ� : " + totalPrice + "��" );
        if ( totalPrice >= 30000) {
        	mileage = totalPrice / 50 ;
        }else if ( totalPrice >= 12000) {
        	mileage = totalPrice / 100 ;
        }
        System.out.println("����Ʈ ���� : " + mileage + "��" );
          
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
