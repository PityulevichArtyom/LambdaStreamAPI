import org.w3c.dom.ls.LSOutput;

import java.text.Format;
import java.util.*;

public class Collections {
    // #1
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        Set<Integer> set = new LinkedHashSet<>(numbers);
        return new ArrayList<>(set);
    }
    //#2
    public static Map<String, Integer> countFrequency(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }
    //#3
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int totalSize = list1.size() + list2.size();

        for (int k = 0; k < totalSize; k++) {
            if (i < list1.size() && (j >= list2.size() || list1.get(i) <= list2.get(j))) {
                result.add(list1.get(i++));
            } else if (j < list2.size()) {
                result.add(list2.get(j++));
            }
        }

        return result;
    }

    //#4
    public static Set<String> findIntersection(Set<String> set1, Set<String> set2) {
        Set<String> set = new LinkedHashSet<>(set1);
        set.retainAll(set2);
        return set;
    }

    //#5
    static class Student {
        private String name;
        private int grade;

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public int getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }

    //#5
    public static Map<Integer, List<Student>> groupByGrade(List<Student> students) {
        Map<Integer, List<Student>> groupMap = new HashMap<>();

        for (Student student : students) {
            int grade = student.getGrade();
            List<Student> studentsWithGrade = groupMap.getOrDefault(grade, new ArrayList<>());
            studentsWithGrade.add(student);
            groupMap.put(grade, studentsWithGrade);
        }

        return groupMap;
    }

    //#6
    public static List<Integer> rotateLeft(List<Integer> list, int k) {
        List<Integer> firstPart = new ArrayList<>(list.subList(k, list.size()));
        for (int i = 0; i < k; i++){
            firstPart.add(list.get(i));
        }
        return firstPart;
    }

    //#7
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);

        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            Integer count = charCountMap.get(c);
            if (count == null || count == 0) {
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        return true;
    }


    public static void main(String[] args) {
        //#1
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println("Вывод чисел до обработки: "+ numbers);
        System.out.println("Вывод после обработки: "+ removeDuplicates(numbers));

        //#2
        List<String> stringList = List.of("Строка1", "Строка2", "Строка3", "Строка1", "Строка5", "Строка2", "Строка2");

        System.out.println(stringList);
        System.out.println(countFrequency(stringList));

        //#3
        List<Integer> numbersList1 = Arrays.asList(1,3,4,5,6,7,8,9,0,1,23,4,5,6,7,8);
        List<Integer> numbersList2 = Arrays.asList(6,5,7,3,2,12,5,7,89,90,23,5,6,8,9,3,4,567,8,5,34,2);
        numbersList1.sort(Comparator.comparingInt(x -> x));
        numbersList2.sort(Comparator.comparingInt(x -> x));
        System.out.println(numbersList1);
        System.out.println(numbersList2);

        System.out.println(mergeSortedLists(numbersList1,numbersList2));

        //#4

        Set<String> set1 = new LinkedHashSet<>(Set.of("Привет", "Как", "Твои", "Дела", "Мой", "Други"));
        Set<String> set2 = new LinkedHashSet<>(Set.of("Привет", "Как", "Дела"));

        System.out.println(findIntersection(set1,set2));

        //#5

        List<Student> students = List.of(
                new Student("Иван", 5),
                new Student("Мария", 4),
                new Student("Петр", 5),
                new Student("Анна", 3),
                new Student("Сергей", 4)
        );

        System.out.println(groupByGrade(students));

        //#6
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(rotateLeft(integers, 3));

        //#7

        String str1 = "Папаша";
        String str2 = "Паша";
        String str3 = "Шапа";

        System.out.println(areAnagrams(str1,str2) + " " + areAnagrams(str2, str3));


    }
}
