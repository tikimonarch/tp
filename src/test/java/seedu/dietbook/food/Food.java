package seedu.dietbook.food;


public class Food {
    private final String name;
    private final int calorie;
    private final int carbohydrate;
    private final int protein;
    private final int fats;

    public Food(String name, int calorie, int carbohydrate, int protein, int fats) {
        this.name = name;
        this.calorie = calorie;
        this.carbohydrate = carbohydrate;
        this.protein = protein;
        this.fats = fats;
    }

    public int getFat() {
        return fats;
    }

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public int getProtein() {
        return protein;
    }

    @Override
    public String toString() {
        return name + " | calorie : " + calorie + " | protein : " + protein + " | carbohydrate : " + carbohydrate
                + " | fats : " + fats;
    }
}
