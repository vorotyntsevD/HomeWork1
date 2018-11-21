package ua.org.oa.mrsuperdan;

public class Box {

    private int boxNumber;
    private double height;
    private double width;
    private double depth;
    private int paid;
    private int sold;


    public Box(int boxNumber, double height, double width, double depth, int paid, int sold) {
        this.boxNumber = boxNumber;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.paid = paid;
        this.sold = sold;
    }

    void displayBoxNumber() {
        if (boxNumber <= 0) { // номер бокса
            System.out.println("Wrong Box Number");
        } else {
            System.out.println("Box №" + boxNumber);
        }
    }

    void displayProfit() { // прибыль
        int profit = sold - paid;            // paid - стоимость приобретения, sold - стоимость продажи
        if (paid < 0 || sold < 0) {
            System.out.println("ERROR");
        } else if (profit >= 0) {
            System.out.println("Прибыль = " + profit + "$");
        } else {
            System.out.println("Убыток + " + profit);
        }
    }

    void displayVolume() { // объем
        double volume = height * width * depth;                     // height - высота, width - ширина, depth - глубина
        if (height <= 0 || width <= 0 || depth <= 0) {
            System.out.println("ERROR");
        } else {
            System.out.println("Объем = " + volume);
        }
    }


}