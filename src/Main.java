import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____Задача №1_____\n");
        System.out.println("1 вариант: ");
        int[] numberOfVacationDaysInHalfAEear = new int[2];
        numberOfVacationDaysInHalfAEear[0] = 7;
        numberOfVacationDaysInHalfAEear[1] = 14;
        System.out.println("Первый отпуск в году равен " + numberOfVacationDaysInHalfAEear[0] + " дней");
        System.out.println("Второй отпуск в году равен " + numberOfVacationDaysInHalfAEear[1] + " дней \n");

        System.out.println("2 вариант: ");
        double[] averageTemperatureInTheSeasonOfTheYear = new double[]{-10.5, 12.5, 25.5, 15.5};
        double winter = averageTemperatureInTheSeasonOfTheYear[0];
        double spring = averageTemperatureInTheSeasonOfTheYear[1];
        double summer = averageTemperatureInTheSeasonOfTheYear[2];
        double autumn = averageTemperatureInTheSeasonOfTheYear[3];

        System.out.println("Средняя Температура зимой в Краснодаре составляет: " + averageTemperatureInTheSeasonOfTheYear[0] + " градусов");
        System.out.println("Средняя Температура весной в Краснодаре составляет: " + averageTemperatureInTheSeasonOfTheYear[1] + " градусов");
        System.out.println("Средняя Температура летом в Краснодаре составляет: " + averageTemperatureInTheSeasonOfTheYear[2] + " градусов");
        System.out.println("Средняя Температура осенью в Краснодаре составляет: " + averageTemperatureInTheSeasonOfTheYear[3] + " градусов \n");

        System.out.println("3 вариант: ");

        int[] numberOfFloorsInTheHouse = new int[10];
        for (int index = 0; index < numberOfFloorsInTheHouse.length; index++) {
            numberOfFloorsInTheHouse[index] = index + 1;
            System.out.print(numberOfFloorsInTheHouse[index] + " Этаж \n");
        }

        System.out.println("\n_____Задача №2____\n");
        System.out.println(Arrays.toString(numberOfVacationDaysInHalfAEear));
        System.out.println(Arrays.toString(averageTemperatureInTheSeasonOfTheYear));
        System.out.println(Arrays.toString(numberOfFloorsInTheHouse));


        System.out.println("\n_____Задача №3_____\n");


        System.out.print(numberOfVacationDaysInHalfAEear[1] + ", ");
        System.out.print(numberOfVacationDaysInHalfAEear[0] + "\n");


        System.out.print(averageTemperatureInTheSeasonOfTheYear[3] + ", ");
        System.out.print(averageTemperatureInTheSeasonOfTheYear[2] + ", ");
        System.out.print(averageTemperatureInTheSeasonOfTheYear[1] + ", ");
        System.out.print(averageTemperatureInTheSeasonOfTheYear[0] + " \n");


        for (int index = numberOfFloorsInTheHouse.length - 1; index >= 0; index--) {
            if (index > 0) {
                System.out.print(numberOfFloorsInTheHouse[index] + ", ");
            } else {
                System.out.print(numberOfFloorsInTheHouse[index] + " ");
            }
        }


        System.out.println("\n\n_____Задача №4_____\n");


        int index0 = numberOfVacationDaysInHalfAEear[0];
        int index1 = numberOfVacationDaysInHalfAEear[1];

        for (; ; ) {
            if (index0 % 2 == 0) {
                System.out.println(index0);
                break;
            } else if (index0 % 2 >= 0) index0 = index0 + 1;
            System.out.println(index0);
            break;
        }
        for (; ; ) {
            if (index1 % 2 == 0) {
                System.out.println(index1);
                break;
            } else if (index1 % 2 >= 0) index0 = index0 + 1;
            System.out.println(index1);
            break;
        }








    }
}