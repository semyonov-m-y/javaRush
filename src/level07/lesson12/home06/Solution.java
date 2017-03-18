package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gDad1 = new Human("д Петя", true, 88, null, null);
        Human gDad2 = new Human("д Коля", true, 89, null, null);
        Human gMam1 = new Human("б Евдокия", false, 78, null, null);
        Human gMam2 = new Human("б Тамара", false, 77, null, null);
        Human father = new Human("п Юра", true, 58, gDad1, gMam2);
        Human mother = new Human("м Таня", false, 47, gDad2, gMam1);
        Human child1 = new Human("Макс", true, 38, father, mother);
        Human child2 = new Human("Влад", true, 28, father, mother);
        Human child3 = new Human("Лена", false, 33, father, mother);

        System.out.println(gDad1);
        System.out.println(gDad2);
        System.out.println(gMam1);
        System.out.println(gMam2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
