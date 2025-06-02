class Person {
    String name;
    int age;
    String email; // Шинэ атрибут

    public Person(String name, int age, String email) { // Конструкторыг шинэчлэх
        this.name = name;
        this.age = age;
        this.email = email; // Эхний утгыг оноох
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        System.out.println("My email is: " + email); // Имэйл хаягийг нэмж хэвлэх
    }

    // Email-ийн Getter
    public String getEmail() {
        return email;
    }

    // Email-ийн Setter
    public void setEmail(String email) {
        // "@" тэмдэгтийг шалгах
        if (email != null && email.contains("@")) {
            this.email = email;
            System.out.println("Email updated successfully to: " + email);
        } else {
            System.out.println("Invalid email format. Email must contain '@' symbol. Current email: " + this.email);
        }
    }
}