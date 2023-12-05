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
        catProfileMap.put(3759, new Cat(null, 3, "ソマリ", false));
        catProfileMap.put(7532, new Cat("しゃけ", -4, "スコティッシュフォールド", false));
        catProfileMap.put(5893, new Cat("ふぐ", 7, null, true));


//        猫ごとにプロフィール情報を格納し、例外処理後viewProfile()へ渡す
        for (Map.Entry<Integer, Cat> catProfile : catProfileMap.entrySet()) {

            Cat cat = catProfile.getValue();

//          以下、3つの値に対して例外処理
            String name = cat.getName();
            String color = cat.getColor();
            int age = cat.getAge();


            try {
                if (name == null) {
                    throw new IllegalArgumentException("エラー：名前を入力してください。");
                }
                if (color == null) {
                    throw new IllegalArgumentException("エラー：種類を入力してください。");
                }
                if (age < 0) {
                    throw new IllegalArgumentException("エラー：正しい年齢を入力してください。");
                }
                viewProfile(cat);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println(
                        "  name: " + name +
                        ", age: " + age +
                        ", color: " + color
                );
            }


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