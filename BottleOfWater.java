import java.math.BigDecimal;

public class BottleOfWater extends Drinkables {
    /**
     * Перегруженный конструктор класса Бутилированных напитков
     *
     * @param name   Наименование напитка
     * @param price  Стоимость напитка
     * @param volume Объем напитка
     */
    public BottleOfWater(String name, BigDecimal price, Double volume) {
        super(name, price, volume);
    }
}