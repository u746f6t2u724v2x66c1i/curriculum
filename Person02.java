import java.util.Scanner;

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, set age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void yearPasses() {
        age++;
    }

    public void amIOld() {
        if (age < 13)
            System.out.println("You are young.");
        else if (age >= 13 && age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }
}

public class Person02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            int initialAge = Integer.parseInt(scanner.nextLine());
            Person person = new Person(initialAge);

            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();
            System.out.println();
        }

        scanner.close();
    }
}

