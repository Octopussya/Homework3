import java.util.*;
import java.util.stream.*;

class Student
{
    static class StudentInfo
    {
        String department;
        String name;
    };

    static class DepartmentInfo
    {
        String department;
        int count;

        DepartmentInfo(String d, int c) { department = d; count = c; }
    }

    public static void main(String[] args)
    {
        List<StudentInfo> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter : Department Name_of_student. At the end press ctrl+d ");
        while(scanner.hasNext())
        {
            StudentInfo info = new StudentInfo();
            info.department = scanner.next();
            info.name = scanner.next();
            students.add(info);
        }
        System.out.println("Top of departments :");
        students
                .stream()
                .sorted((a, b) -> { return a.department.compareTo(b.department); })
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(info -> { return info.department; }),
                                map -> { return map.entrySet().stream(); }
                        )
                )
                .map(entry -> { return new DepartmentInfo(entry.getKey(), entry.getValue().size()); })
                .sorted((a, b) -> { return Integer.compare(b.count, a.count); })
                .limit(3)
                .forEach(info -> { System.out.println(info.department + " " + info.count); });
        System.out.println("Alphabet order :");
        String[] arr = new String[students.size()];
        int i = 0;
        for(StudentInfo s : students)
        {
            arr[i] = s.department;
            i++;
        }
        Arrays
                .stream(arr)
                .distinct()
                .sorted((a, b) -> { return a.compareTo(b); })
                .forEach(a -> { System.out.println(a); });

    }
}