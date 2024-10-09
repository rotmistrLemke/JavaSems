package FinalAssessment;



public class Main {
    
public static void main(String[] args) {
        Shop shop = new Shop();

        // Добавление нескольких ноутбуков в магазин
        shop.addNotebook(new Notebook("Laptop1", 256, 8, "Windows", "Black"));
        shop.addNotebook(new Notebook("Laptop2", 512, 16, "Linux", "White"));
        shop.addNotebook(new Notebook("Laptop3", 1024, 32, "Windows", "Black"));

        shop.getFilters();
    }
}

