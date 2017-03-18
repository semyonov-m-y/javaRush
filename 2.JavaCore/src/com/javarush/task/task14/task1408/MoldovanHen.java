package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    private int N;

    @Override
    int getCountOfEggsPerMonth() {
        return N = 30;
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.MOLDOVA
                + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
