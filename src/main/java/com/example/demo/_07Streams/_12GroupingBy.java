package com.example.demo._07Streams;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Notes :
 * groupingBy() is used to group the collections with particular value
 */
public class _12GroupingBy {
    public static void main(String[] args) {
        List<Student> students = Student.getAll();

        // Group the students by age
        Map<Integer, List<Student>> groupedByAge = students
                .stream()
                .collect(Collectors.groupingBy(Student::getAge));

        System.out.println(groupedByAge);

        // Group the students by age and get only student names associated with the particular age
        Map<Integer, List<String>> groupedByAge2 = students
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getAge,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println(groupedByAge2);
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Student {
    private String name;
    private Integer age;

    public static List<Student> getAll() {
        return List.of(
                new Student("Mahesh", 26),
                new Student("Aishwarya", 24),
                new Student("Bhumik", 26),
                new Student("Shubhangi", 25),
                new Student("Swapnil", 24)
        );
    }
}
