package sortemployee;
import java.util.Random;

public class Arr {

    public static String arrCompany()
    {
        String[] arrCompany = new  String[10];
        arrCompany[0] = "Apple";
        arrCompany[1] = "Samsung";
        arrCompany[2] = "Sony";
        arrCompany[3] = "Dyson";
        arrCompany[4] = "Acer";
        arrCompany[5] = "Asus";
        arrCompany[6] = "Intel";
        arrCompany[7] = "Sunlight";
        arrCompany[8] = "Valve";
        arrCompany[9] = "Dodo";
        Random rand = new Random();

        return (arrCompany[rand.nextInt(arrCompany.length)]);
    }

    public static String arrName()
    {
        String[] arrName = new String[10];
        arrName[0] = "Ekaterina";
        arrName[1] = "Alice";
        arrName[2] = "Sofya";
        arrName[3] = "Evgenii";
        arrName[4] = "Sergey";
        arrName[5] = "Vladimir";
        arrName[6] = "Alexander";
        arrName[7] = "Anna";
        arrName[8] = "Viktor";
        arrName[9] = "Veronika";
        Random rand = new Random();

        return (arrName[rand.nextInt(arrName.length)]);
    }
}