package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> family1 = new ArrayList<Human>();
        Human kid1 = new Human("KID1", true, 15, new ArrayList<Human>());
        Human kid2 = new Human("KID2", true, 14, new ArrayList<Human>());
        Human kid3 = new Human("KID3", false, 13, new ArrayList<Human>());
        family1.add(kid1);
        family1.add(kid2);
        family1.add(kid3);

        ArrayList<Human> family2 = new ArrayList<Human>();
        ArrayList<Human> family3 = new ArrayList<Human>();
        Human father = new Human("FATHER", true, 36, family1);
        Human mother = new Human("MOTHER", false, 35, family1);
        family2.add(father);
        family3.add(mother);

        Human gFather1 = new Human("GrandFather1", true, 60, family2);
        Human gMother1 = new Human("GrandMother1", false, 59, family2);

        Human gFather2 = new Human("GrandFather2", true, 58, family3);
        Human gMother2 = new Human("GrandMother2", false, 57, family3);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
