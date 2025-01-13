package phonesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Phone {
    private String serialNumber;
    private String model;
    private double weight;
    private double price;

    public Phone(String serialNumber, String model, double weight, double price)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString()
    { //вывод хар-ик телефонов
        return "телефон {" +
                "серийный номер = '" + serialNumber + '\'' +
                ", модель = '" + model + '\'' +
                ", вес = " + String.format("%.0f", weight) + "g" +
                ", цена = " + String.format("%.0f", price) + "$" +
                '}';
    }

    public double getWeight() {        //возвращение веса
        return weight;
    }

    public double getPrice() {         //возвращение цены
        return price;
    }

    public static List<Phone> generateRandomPhones(int count) //создание списка для хранения телефонов
    {
        List<Phone> phones = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++)
        {
            String serialNumber = "SG" + String.format("%04d", random.nextInt(10000)); // создание новых телефон со случайными хар-ми
            String model = "model" + (i + 1);
            double weight = 100 + (random.nextDouble() * 200);
            double price = 50 + (random.nextDouble() * 500);

            phones.add(new Phone(serialNumber, model, weight, price));
        }
        return phones;
    }
}