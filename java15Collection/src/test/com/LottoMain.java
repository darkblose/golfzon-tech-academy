package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LottoMain {
    public static void main(String[] args) throws IOException {
//        �ζǹ�ȣ ������
//        1~45 ���̿��� 6���� �ߺ� ���� ���� �����Ͽ� ��� > Set Ȱ���ϸ� ��

        System.out.println("��ġ �帱���?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int won = Integer.parseInt(br.readLine());
        int Lotto_Row = won / 1000;
        ArrayList<List> Lotto_NumSets = new ArrayList<>();
        Set<Integer> Lotto_Num6 = new HashSet<>();
        Random ran = new Random();

        for (int i = 0; i < Lotto_Row; i++) {
            Lotto_Num6.clear();
            while (Lotto_Num6.size() != 6) {
                int Num = ran.nextInt(45 + 1);
                Lotto_Num6.add(Num);
            }
            List<Integer> Lotto_Sorted = new ArrayList<>(Lotto_Num6);
            Collections.sort(Lotto_Sorted);
            Lotto_NumSets.add(Lotto_Sorted);
        }

        for (int i = 0; i < Lotto_NumSets.size(); i++) {
            System.out.println(i + 1 + " : " + Lotto_NumSets.get(i));
        }


    }
}
