package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    private int N;

    @Override
    int getCountOfEggsPerMonth() {
        return N = 20;
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.UKRAINE
                + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
