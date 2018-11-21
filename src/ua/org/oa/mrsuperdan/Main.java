package ua.org.oa.mrsuperdan;

public class Main {

        /* Приобретаются боксы с неизвестным содержимым.
    Известна высота, ширина, глубина, стоимость приобретения и продажи,
    а также номер бокса (не обязательно по порядку)
     */

    public static void main(String[] args) {
        Box box1 = new Box(1,2.5,3,5,950,2200);

        box1.displayBoxNumber();
        box1.displayVolume();
        box1.displayProfit();


        System.out.println();


        Box box2 = new Box(2,3,4.75,12,1550,1970);

        box2.displayBoxNumber();
        box2.displayVolume();
        box2.displayProfit();
    }

}
