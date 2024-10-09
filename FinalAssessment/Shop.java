package FinalAssessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;





public class Shop {
    private List<Notebook> notebooks;
    private Scanner scanner;

    public Shop() {
        this.notebooks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void getFilters() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Map<String, String> filters = new HashMap<>();
        boolean filterAdd = false;

        while (!filterAdd) {
            int filter = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после ввода числа
            switch (filter) {
                case 1:
                    System.out.print("Введите минимальный объем ОЗУ: ");
                    filters.put("ОЗУ", scanner.nextLine());
                    filterAdd = true;
                    break;
                case 2:
                    System.out.print("Введите минимальный объем ЖД: ");
                    filters.put("ЖД", scanner.nextLine());
                    filterAdd = true;
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    filters.put("ОС", scanner.nextLine());
                    filterAdd = true;
                    break;
                case 4:
                    System.out.print("Введите цвет: ");
                    filters.put("ЦВЕТ", scanner.nextLine());
                    filterAdd = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }

        noteBookFilter(filters);
    }

    private void noteBookFilter(Map<String, String> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean equalsFilter = true;

            for (Map.Entry<String, String> entry : filters.entrySet()) {
                switch (entry.getKey()) {
                    case "ОЗУ":
                        if (notebook.getRamVolume() < Integer.parseInt(entry.getValue())){
                            equalsFilter = false;
                            break;
                        }
                        break;
                    case "ЖД":
                        if (notebook.getHddVolume() < Integer.parseInt(entry.getValue())) {
                            equalsFilter = false;
                            break;
                        }
                        break;
                    case "ОС":
                        if (!notebook.getOsName().equals(entry.getValue())) {
                            equalsFilter = false;
                            break;
                        }
                        break;
                    case "ЦВЕТ":
                        if (!notebook.getColor().equals(entry.getValue())) {
                            equalsFilter = false;
                            break;
                        }
                        break;
                }
            }

            if (equalsFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        printFilteredNotebooks(filteredNotebooks);
    }

    private void printFilteredNotebooks(List<Notebook> filteredNotebooks) {
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Нет ноутбуков, соответствующих заданным критериям.");
        } else {
            System.out.println("Найдено ноутбуков, соответствующих условиям:");
            for (Notebook ноутбук : filteredNotebooks) {
                System.out.println(ноутбук);
            }
        }
    }

}
