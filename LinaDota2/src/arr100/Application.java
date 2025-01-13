package arr100;
import java.util.Scanner;



public class Application {
    public static void main(String[] args)
    {
        Array arrayManager = new Array(100);
        Array.fillArray();

        System.out.println("сгенерированный массив: ");
        arrayManager.printArray();

        Scanner scanner = new Scanner(System.in);

        // Поиск элемента
        System.out.print("эведите элемент для поиска: ");
        int searchElement = scanner.nextInt();
        if (arrayManager.searchElement(searchElement))
        {
            System.out.println("элемент " + searchElement + " найден");
        } else {
            System.out.println("элемент " + searchElement + " не найден");
        }

        // Удаление элемента
        System.out.print("введите элемент для удаления: ");
        int removeElement = scanner.nextInt();
        arrayManager.removeElement(removeElement);

        // Вывод массива после удаления
        System.out.println("массив после удаления: ");
        arrayManager.printArray();

        scanner.close();
    }
}