package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ID管理を想定してHashMapを選択
        Map<Integer, Cat> catProfileMap = new HashMap<>();

//       Mapにプロフィール情報の追加
        catProfileMap.put(8538, new Cat("にゃんこ", 1, "日本猫", true));
        catProfileMap.put(4291, new Cat("ミミ", 2, "アメショ", true));
        catProfileMap.put(1394, new Cat("チャチャ", 0, "マンチカン", false));


//        猫ごとにプロフィール情報を格納してviewProfile()へ渡す
        for (Map.Entry<Integer, Cat> catProfile : catProfileMap.entrySet()) {

            Cat cat = catProfile.getValue();
            viewProfile(cat);

        }


    }

    public static void viewProfile(Cat cat) {
        System.out.println(cat.getName() + " : 年齢は" + cat.getAge() + "才。種類は\"" + cat.getColor() + "\"です。");

//        予防接種の有無で追加メッセージを表示
        if (!cat.isInoculation()) {
            System.out.println("※まだ予防接種を受けていません");
        }
    }
}