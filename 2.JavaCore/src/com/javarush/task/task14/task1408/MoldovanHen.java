package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    String country = Country.MOLDOVA;
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }
    @Override
    String getDescription() {
        return super.getDescription()+ " Моя страна - "+country+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
