package java2prj1.interfaceEx.lamda;

import java.util.function.Consumer;

public class 삼만원장보기Consumer {
    
    private static int remainingMoney = 30000;

    public static void main(String[] args) {

        Consumer<Integer> shopping = amount -> {
            if (amount <= remainingMoney) {
                remainingMoney -= amount;
                System.out.println("구매금액: " + amount + "원");
                System.out.println("잔액: " + remainingMoney + "원");
            } else {
                System.out.println("잔액 부족");
            }
        };

        shopping.accept(7000);   // 베이컨
        shopping.accept(4500);   // 링귀니면
        shopping.accept(8000);   // 알리오올리오소스 1+1
        shopping.accept(4500);   // 베라파인트(KT할인)
        shopping.accept(3900);   // 제로콜라 1+1
        shopping.accept(2100);   // 다음 장보기로 넘김
    }
    

//지피티로 한것
//        private static int remainingMoney = 30000;
//        private static Map<String, Integer> itemPrices = new HashMap<>();
//
//        public static void main(String[] args) {
//            itemPrices.put("베이컨", 7000);
//            itemPrices.put("링귀니면", 4500);
//            itemPrices.put("알리오올리오소스 1+1", 8000);
//            itemPrices.put("베라파인트(KT할인)", 4500);
//            itemPrices.put("제로콜라 1+1", 3900);
//            itemPrices.put("다음 장보기로 넘김", 2100);
//
//            Consumer<String> shopping = item -> {
//                int price = itemPrices.getOrDefault(item, 0);
//                if (price > 0 && price <= remainingMoney) {
//                    remainingMoney -= price;
//                    System.out.println(item + " : " + price + "원");
//                    System.out.println("잔액: " + remainingMoney + "원");
//                } else if (price > 0) {
//                    System.out.println(item + " : 잔액 부족");
//                } else {
//                    System.out.println("유효하지 않은 항목: " + item);
//                }
//            };
//
//            shopping.accept("베이컨");
//            shopping.accept("링귀니면");
//            shopping.accept("알리오올리오소스 1+1");
//            shopping.accept("베라파인트(KT할인)");
//            shopping.accept("제로콜라 1+1");
//            shopping.accept("다음 장보기로 넘김");
//            shopping.accept("존재하지 않는 항목"); // 유효하지 않은 항목 테스트
//        }
//    }

}


