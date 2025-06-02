public class Main {
    public static void main(String[] args) {

        // Person обьект үүсгэхдээ имэйл хаягийг дамжуулна
        Person person1 = new Person("John Doe", 30, "john.doe@example.com");
        person1.greet();

        // Email-ийг шинэчлэх оролдлого
        person1.setEmail("new.john@company.com");
        person1.setEmail("invalid-email"); // Буруу имэйл шалгах

        System.out.println("\n--- Second Person ---");
        Person person2 = new Person("Jane Smith", 25, "jane.smith@example.com");
        person2.greet();
        person2.setEmail("jane@co.org");
    }
}

