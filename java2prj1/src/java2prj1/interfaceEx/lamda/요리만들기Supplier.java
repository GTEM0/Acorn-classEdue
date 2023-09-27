package java2prj1.interfaceEx.lamda;

import java.util.function.Supplier;

public class 요리만들기Supplier {

    public static void main(String[] args) {

        Supplier<String> cookingSteps = () -> {
            String steps = "";
            steps += "1. 끓는 물에 면을 넣고 12분간 끓인다\n";
            steps += "2. 베이컨을 먹기 좋은 크기로 썬다\n";
            steps += "3. 팬에 베이컨을 넣고 굽는다\n";
            steps += "4. 베이컨이 적당히 익으면 팬에 알리오올리오 소스를 넣는다\n";
            steps += "5. 12분이 지나 면이 익으면 건져서 팬에 넣고 잘 섞는다\n";
            steps += "6. 적당히 섞이면 그릇에 옮겨담아 맛있게 먹는다\n";
            return steps;
        };
        String cookingInstructions = cookingSteps.get();
        System.out.println(cookingInstructions);
    }
}
