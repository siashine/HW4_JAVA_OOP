import java.math.BigDecimal;


public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * Перегруженный конструктор класса горячих напитков
     *
     * @param name   Наименование напитка
     * @param price  Цена напитка
     * @param volume Объем напитка
     * @param temp   Температура напитка
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}