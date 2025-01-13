package products;

import java.util.ArrayList;
import java.util.List;

public class MyProducts {

    private double maxProtein;
    private double maxFat;
    private double maxCarbohydrates;
    private double maxCalories;

    private List<Products> products;

    public MyProducts(double maxProtein, double maxFat, double maxCarbohydrates, double maxCalories)
    {
        this.maxProtein = maxProtein;
        this.maxFat = maxFat;
        this.maxCarbohydrates = maxCarbohydrates;
        this.maxCalories = maxCalories;
        this.products = new ArrayList<>();
    }

    public String addProduct(Products product)
    {
        if (product.getName() == null)
        {
            return "нельзя добавить null";
        }
        if (product.getProtein() > maxProtein)
        {
            return "продукт " + product.getName() + " нельзя добавить: слишком много белков";
        }
        if (product.getFat() > maxFat)
        {
            return "продукт " + product.getName() + " нельзя добавить: слишком много жиров";
        }
        if (product.getCarbohydrates() > maxCarbohydrates)
        {
            return "продукт " + product.getName() + " нельзя добавить: слишком много углеводов";
        }
        if (product.getCalories() > maxCalories)
        {
            return "продукт " + product.getName() + " нельзя добавить: слишком много калорий";
        }
        product.add(product);
        return "продукт " + product.getName() + " добавлен";
    }
}
