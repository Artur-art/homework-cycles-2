public class Main {
    public static void main(String[] args) {

        System.out.println("задача №1");
        int deposit2 = 15000;
        int total2 = 0;
        int i = 0;
        while(total2 <= 2_459_000){
            total2 = total2+deposit2;
            total2 = total2+total2/100;
            total2++;
            i++;
            System.out.println("месяц "+i+" сумма накоплений равна "+ total2);
        }
        System.out.println("Задача №2");
        int a =0;
        while(a!=10){
            a++;
            System.out.println(a);

        }
        for(a = 10; a>=0; a--){
            System.out.println(a);
        }
        System.out.println("Задача №3");
        int totalPopulation = 12000000;
        int fertility = 17;
        int mortality = 8;
        int dif = fertility - mortality;
        for(int b = 1; b <= 10; b++){
            totalPopulation += totalPopulation * dif / 1000;
        }
        System.out.println("год 2032, численность населения составляет "+ totalPopulation);

        System.out.println("Задача №3");
        int deposit3 = 15000;
        int total = 0;
        for(int c = 0; total < 10_000_000; c++){
            total = total + total * 7/100;
            total = total + deposit3;
            System.out.println("месяц " + c + " итого " + total);
        }

        System.out.println("Задача №4");
        int deposit4 = 15000;
        int total3 = 0;
        int c = 0;
        for(; total3 < 10_000_000; c++){
            total3 = total3 + total3 * 7/100;
            total3 = total3 + deposit4;
            if(c % 6 == 0){
                System.out.println("месяц " + c + " итого " + total3);
            }
        }
        System.out.println("Задача №5");
        int Friday = 1;
        for(int numberOfMounth = 1; numberOfMounth <= 31; numberOfMounth++){
            if(Friday % numberOfMounth == 0){
                System.out.println("Сегодня пятница " + Friday +" число. Надо подготовить отчет");
                Friday +=7;
            }
        }
        System.out.println("Задача №6");
        int startObservation = 1822;
        int endObservation = 2122;
        for(int t = 1822; t < 1922; t++){
            if(t % 79==0){
                System.out.println("Камета появилась в " + t + " году");
            }
        }
        for(int t = 1922; t < 2022; t++){
            if(t % 79 == 0){
                System.out.println("Камета появилась в " + t + " году");
            }
        }
        for(int t = 2022; t < 2122; t++){
            if(t % 79 == 0){
                System.out.println("Камета появилась в " + t + " году");
            }
        }
        System.out.println("Задача №7");
        int num = 20;
        for(int i2 = 2; i2 <= 20 ; i2=i2+2){
            System.out.println(i2);
        }
    }
}
