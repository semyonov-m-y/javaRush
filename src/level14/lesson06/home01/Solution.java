package com.javarush.test.level14.lesson06.home01;

/* Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen)
1. Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainianHen, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур
9. Все созданные вами классы должны быть в отдельных файлах
*/

public class Solution
{
    public static void main(String[] args)
    {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        Hen hen1 = HenFactory.getHen(Country.MOLDOVA);
        hen.getCountOfEggsPerMonth();
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //add your code here
            if (hen instanceof RussianHen) {
                country.contains(Country.RUSSIA);
            }
            if (hen instanceof UkrainianHen) {
                country.contains(Country.UKRAINE);
            }
            if (hen instanceof MoldovanHen) {
                country.contains(Country.MOLDOVA);
            }
            if (hen instanceof BelarusianHen) {
                Hen hen1 = hen;
                country.equals(Country.BELARUS);
            }
            return hen;
        }
    }

    public abstract class Hen {

        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я курица.";
        }
    }

    public class RussianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth()
        {
            return 100;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + HenFactory.getHen(Country.RUSSIA)
                    + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class UkrainianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth()
        {
            return 200;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + HenFactory.getHen(Country.UKRAINE)
                    + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class MoldovanHen extends Hen {

        @Override
        int getCountOfEggsPerMonth()
        {
            return 300;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + HenFactory.getHen(Country.MOLDOVA)
                    + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    public class BelarusianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth()
        {
            return 400;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + HenFactory.getHen(Country.BELARUS)
                    + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

}
