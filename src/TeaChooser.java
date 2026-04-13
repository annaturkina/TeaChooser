import java.util.Scanner;

public class TeaChooser {


    public static String chooseTeaByProperty(String property) {
        if (property == null) {
            return "Свойство не указанно.";
        }

        switch (property.toLowerCase()) {
            case "бодрит":
                return "Пуэр";
            case "сосредотачивает":
                return "Тигуаньинь (Тигуанинь)";
            case "расслабляет":
                return "Габа (Габа алишань)";
            default:
                return "Чай с таким свойством не найден. Доступные свойства: 'бодрит', 'сосредотачивает', 'расслабляет'.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Подбор чая по желаемому свойству ===");
        System.out.println("Доступные свойства:");
        System.out.println("- бодрит");
        System.out.println("- сосредотачивает");
        System.out.println("- расслабляет");
        System.out.print("Введите желаемое свойство: ");

        String desiredProperty = scanner.nextLine();
        String recommendedTea = chooseTeaByProperty(desiredProperty);

        System.out.println("\nРекомендация: " + recommendedTea);

        scanner.close();
    }
}
