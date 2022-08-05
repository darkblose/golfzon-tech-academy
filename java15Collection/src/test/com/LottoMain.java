package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class LottoMain {
    public static void main(String[] args) throws IOException {
//        로또번호 생성기
//        1~45 사이에서 6개의 중복 없는 수를 추출하여 출력 > Set 활용하면 됨

        System.out.println("얼마치 드릴까요?");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int won = parseInt(br.readLine());
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
            System.out.println(i+1 + " : " + Lotto_NumSets.get(i));
        }


    }
}
