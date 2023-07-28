package org.example;

public class BonusMilesService { //Метод для расчета количества миль
    public int calculate(int price) {
        if (price < 20) {
            return 0; // Если цена билета меньше 20руб., то не начесляется ни одной мили
        }
        return (int) (price / 20); //Начисляем количество миль, равное количеству целых частей от деления цены на 20
    }
}
