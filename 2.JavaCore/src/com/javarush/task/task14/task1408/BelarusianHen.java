package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    String country = Country.BELARUS;
    @Override
    public int getCountOfEggsPerMonth() {
        return 4;
    }

    @Override
    String getDescription() {
        return super.getDescription()+ " Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
