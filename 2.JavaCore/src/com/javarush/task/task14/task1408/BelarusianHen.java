package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    private int N;

    @Override
    int getCountOfEggsPerMonth() {
        return N = 40;
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.BELARUS
                + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
