package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    private int N;

    @Override
    int getCountOfEggsPerMonth() {
        return N = 10;
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.RUSSIA
                + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
