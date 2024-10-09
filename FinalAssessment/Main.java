package FinalAssessment;

public class Main {
public static void main(String[] args) {
        FinalAssessment.Shop shop = new FinalAssessment.Shop();

        // Добавление нескольких ноутбуков в магазин
        shop.addNotebook(new Notebook("Laptop1", 256, 8, "Windows 10", "Черный"));
        shop.addNotebook(new Notebook("Laptop2", 512, 16, "Linux", "Белый"));
        shop.addNotebook(new Notebook("Laptop3", 1024, 32, "Windows 10", "Серебристый"));

        shop.getFilters();
    }
}

