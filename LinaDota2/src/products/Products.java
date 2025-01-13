package products;

public class Products {

    private String name;
    private double protein;
    private double fat;
    private double carbohydrates;
    private double calories;

    public Products(String name, double protein, double fat, double carbohydrates, double calories)
    {
        if(protein < 0 || fat < 0 || carbohydrates < 0 || calories < 0) {
            return;
        }

        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCalories() {
        return calories;
    }

    public void add(Products product) {
    }
}