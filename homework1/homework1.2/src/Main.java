public class Main {
    public static void main(String[] args) {
        int dayOfWeek = 01;
        switch (dayOfWeek) {
            case "01":
            case "1":
                System.out.println("Понедельник");
                break;
            case "02":
            case "2":
                System.out.println("Вторник");
                break;
            case "03":
            case "3":
                System.out.println("Среда");
                break;
            case "04":
            case "4":
                System.out.println("Четверг");
                break;
            case "05":
            case "5":
                System.out.println("Пятница");
                break;
            case "06":
            case "6":
                System.out.println("Суббота");
                break;
            case "07":
            case "7":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня недели");
        }
    }
}
