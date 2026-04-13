import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Map<String, String> teaByProperty = new HashMap<>();
        teaByProperty.put("бодрит", "Пуэр");
        teaByProperty.put("сосредотачивает", "Тегуанинь");
        teaByProperty.put("расслабляет", "Габа");

        System.out.println("Выберите желаемое свойство чая:");
        System.out.println("1. бодрит");
        System.out.println("2. сосредотачивает");
        System.out.println("3. расслабляет");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер свойства (1-3): ");
        int choice = scanner.nextInt();

        String selectedProperty = "";
        switch (choice) {
            case 1:
                selectedProperty = "бодрит";
                break;
            case 2:
                selectedProperty = "сосредотачивает";
                break;
            case 3:
                selectedProperty = "расслабляет";
                break;
            default:
                System.out.println("Неверный ввод. Пожалуйста, выберите 1, 2 или 3.");
                scanner.close();
                return;
        }

        String recommendedTea = teaByProperty.get(selectedProperty);
        System.out.println("Рекомендуемый чай: " + recommendedTea);
        System.out.println("Свойство: " + selectedProperty);

        scanner.close();
    }
}