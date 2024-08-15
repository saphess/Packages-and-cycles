package ru.netology.homework5.service;

public class RecreationModelService {
    public int calculate(long income, long expense, long threshold){
        long money = 0;
        int cnt = 0;
        for (int mounth = 0; mounth < 12; mounth++){
            if (money >= threshold){
                cnt++;
                money -= expense;
                money /= 3;
            }
            else {
                money += income;
                money -= expense;
            }
        }
        return cnt;
    }
}