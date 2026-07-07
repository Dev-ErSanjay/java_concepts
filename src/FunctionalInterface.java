import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import utils.Student;

//Supplier: supplier.get()
//Function: function.apply()
//Consumer: consumer.accept()
//Predicate: predicate.test()
public class FunctionalInterface {

    public static void main(String[] args) {

        // Supplier
        Supplier<List<Student>> studentSupplier = () -> {
            List<Student> list = new ArrayList<>();
            list.add(new Student("1", "Sanjay", 85.0));
            list.add(new Student("2", "John", 76.0));
            list.add(new Student("1", "Mary", 46.0));
            list.add(new Student("1", "David", 22.5));

            return list;
        };

        // Prdicate
        Predicate<Student> hasPassed = student -> student.getMarks() > 50.0;

        // Function
        Function<Student, String> nameExtracter = student -> student.getName();

        // Consumer
        Consumer<String> printName = name -> System.out.println("Passed: " + name);

        List<Student> students = studentSupplier.get();
        for (Student student : students) {
            if (hasPassed.test(student)) {

                String studentName = nameExtracter.apply(student);
                printName.accept(studentName);
            }
        }
    }
}
