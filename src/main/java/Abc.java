import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Abc {

    static int def (String s ,I i){
        return i.abc(s);
    }

    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
//
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
//
//        words.stream().map(String::toUpperCase).forEach(System.out::println);
//
//        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
//
//        System.out.println(nums.stream().reduce((a, b) -> a+b).get());
//
//        List<Integer> duplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//        duplicates.stream().distinct().forEach(System.out::println);
//
//        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
//
//        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
//
//        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
//
//        System.out.println(fruits.stream().anyMatch("apple"::equals));
//
//        List<String> words1 = Arrays.asList("apple", "banana", "apricot", "berry", "avocado");
//
//        Map <Character, List<String>> grouped = words1.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
//
//        System.out.println(grouped);
//
//        List<String> list = Arrays.asList("Java", "is", "awesome");
//
//        System.out.println(list.stream().reduce((a,x) -> a + " " + x).get());
//
//        List<Integer> numbers1 = Arrays.asList(42, 17, 99, 23, 55);
//
//        System.out.println(numbers1.stream().max(Comparator.naturalOrder()).get());
//
//        List<Integer> bigList = IntStream.range(1, 10_000).boxed().collect(Collectors.toList());
//
//        List<Integer> bigList2 = bigList.parallelStream().map(x -> x*2).toList();
//
//        System.out.println(bigList2);

        //ЗАДАНИЯ ИЗ ГУГЛ ЧАТА НАЧИНАЮТСЯ ТУТ

        //1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //2
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //3
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers2.stream().filter(x -> x>5).count());
        System.out.println("---------------------------------------------");

        //4
        List<Integer> numbers3 = Arrays.asList(1, 2, 1, 3, 5, 4, 7, 8, 9, 10);
        numbers3.stream().filter(x -> x > 3).findFirst();
        System.out.println("---------------------------------------------");

        //5
        List<Integer> numbers4 = Arrays.asList(1, 2, 1, 3, -5, 4, 7, 8, 9, 10);
        List<Integer> numbers5 = Arrays.asList(1, 2, 1, 3, 5, 4, 7, 8, 9, 10);

        System.out.println(numbers4.stream().anyMatch(x -> x < 0));
        System.out.println(numbers5.stream().anyMatch(x -> x < 0));
        System.out.println("---------------------------------------------");

        //6

        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Artyom", 21);
        Person person2 = new Person("Pashka", 22);
        Person person3 = new Person("Nastya", 17);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.stream().filter(x -> x.age > 18).forEach(x -> System.out.println("Name = "+ x.name));
        System.out.println("---------------------------------------------");

        //7
        personList.stream().sorted(Comparator.comparingInt(x -> x.age)).forEach(x -> System.out.println("Name: "+x.name+" Age: "+ x.age));
        System.out.println("---------------------------------------------");

        //8
        Person person4 = new Person("Max", 17);
        Person person5 = new Person("Alesya", 22);
        personList.add(person4);
        personList.add(person5);
        Map <Integer, List<Person>> listMap = personList.stream().collect(Collectors.groupingBy(x -> x.age));
        listMap.forEach((age, persons) -> {
            System.out.println("Возраст " + age + ":");
            persons.forEach(person -> System.out.println("  - " + person.name));
        });
        System.out.println("---------------------------------------------");

        //9

        List<String> Names = personList.stream()
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println(Names);
        System.out.println("---------------------------------------------");

        //10
        System.out.println(personList.stream().map(a -> a.age).collect(Collectors.averagingInt(a -> a.intValue())));
        System.out.println("---------------------------------------------");

        //11

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList = listOfLists.stream()
                .flatMap(innerList -> innerList.stream())
                .collect(Collectors.toList());

        System.out.println(flatList);
        System.out.println("---------------------------------------------");

        //12
        numbers3.stream().distinct().sorted().forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //13
        Map <String, Integer> nameAgeMap = personList.stream().collect(Collectors.toMap(x -> x.name,x -> x.age));
        System.out.println(nameAgeMap);
        System.out.println("---------------------------------------------");

        Person person6 = new Person("Alesya", 26);
        personList.add(person6);

        //duplicates
        Map <String, Integer> nameAgeMapDuplicates = personList.stream().collect(Collectors.toMap(x -> x.name,x -> x.age, (o, n) -> o));
        System.out.println(nameAgeMapDuplicates);
        System.out.println("---------------------------------------------");

        //14

        Map <Boolean, List<Integer>> evenAndOdd = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        List<Integer> oddNum = evenAndOdd.get(false);
        List<Integer> evenNum = evenAndOdd.get(true);

        System.out.println("Чётные: " + evenNum);
        System.out.println("Нечётные: " + oddNum);
        System.out.println("---------------------------------------------");

        //15

        personList.stream().filter(x -> x.age > 21 && x.name.charAt(0) == 'A').forEach(x -> System.out.println("Name = " + x.name + ", age = "+ x.age));
        System.out.println("---------------------------------------------");

        //16

        List<String> strings = Arrays.asList(
                "Hello",
                "World",
                "it's",
                "Java",
                "Stream",
                "API",
                "asd"
        );

        String str = strings.stream().reduce((a, x) -> (a + ", "+ x)).get();
        System.out.println(str);
        System.out.println("---------------------------------------------");

        //17

        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println("---------------------------------------------");

        //18

        System.out.println(strings.stream().map(x -> x.length()).reduce((x, a) -> x + a).get());

        System.out.println(strings.stream().mapToInt(x -> x.length()).sum());

        System.out.println("---------------------------------------------");

        //19

        strings.stream().map(x -> x.charAt(0)).forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //20

        strings.stream().filter(x -> x.length() < 5).forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //21

        System.out.println(numbers2.stream().map(x -> x*x).reduce(0, (a,x) -> a + x));

        System.out.println(numbers2.stream().mapToInt(x -> x*x).sum());

        System.out.println("---------------------------------------------");

        //22

        System.out.println(numbers2.stream().reduce(1, (a, x) -> a*x));

        System.out.println("---------------------------------------------");

        //23

        System.out.println(numbers.stream().max(Integer::compareTo).get());
        System.out.println(numbers.stream().min(Comparator.comparingInt(x -> x)).get());
        System.out.println("---------------------------------------------");

        //24
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Статистика:");
        System.out.println("Количество: " + stats.getCount());
        System.out.println("Сумма: " + stats.getSum());
        System.out.println("Минимум: " + stats.getMin());
        System.out.println("Максимум: " + stats.getMax());
        System.out.println("Среднее: " + stats.getAverage());
        System.out.println("---------------------------------------------");

        //25
        System.out.println(factorial(20));
        System.out.println("---------------------------------------------");

        //26
        class Product {
            private String name;
            private String category;
            private int price;

            public Product(String name, String category, int price) {
                this.name = name;
                this.category = category;
                this.price = price;
            }

            @Override
            public String toString() {
                return "Product{" +
                        "name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        '}';
            }

            public String getName() {
                return name;
            }

            public String getCategory() {
                return category;
            }

            public int getPrice() {
                return price;
            }
        }

        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 13", "Смартфоны", 79900));
        products.add(new Product("Samsung Galaxy S21", "Смартфоны", 69900));
        products.add(new Product("Xiaomi Mi 11", "Смартфоны", 54900));
        products.add(new Product("MacBook Pro 14", "Ноутбуки", 149900));
        products.add(new Product("ASUS ROG Zephyrus", "Ноутбуки", 129900));
        products.add(new Product("Sony WH-1000XM4", "Наушники", 29900));
        products.add(new Product("Apple AirPods Pro", "Наушники", 19900));
        products.add(new Product("PlayStation 5", "Игровые консоли", 49900));
        products.add(new Product("Xbox Series X", "Игровые консоли", 45900));
        products.add(new Product("Kindle Paperwhite", "Электронные книги", 11900));

        Map<String, Product> mostExpensiveByCategory = products.stream()
                .collect(Collectors.toMap(
                        p -> p.category,
                        p -> p,
                        (p1, p2) -> p1.price > p2.price ? p1 : p2
                ));

        System.out.println(mostExpensiveByCategory);
        System.out.println("---------------------------------------------");

        //27
        int n = 5;
        products.stream().sorted(Comparator.comparingInt(Product::getPrice).reversed()).limit(n).forEach(System.out::println);

        System.out.println("---------------------------------------------");

        //28
        System.out.println(numbers.stream().filter(x -> x%2 == 0).map(x -> x*x).reduce(0, (x, a) -> x+a));
        System.out.println("---------------------------------------------");

        //29

        List<Person> people = Arrays.asList(
                new Person("Anna", 12),
                new Person("Boris", 25),
                new Person("Alex", 8),
                new Person("Kate", 30),
                new Person("Artem", 17),
                new Person("Maria", 22),
                new Person("Alice", 14),
                new Person("Bob", 40)
        );

        Map<String, Map<Character, List<Person>>> groupedPeople = people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.getAge() >= 18 ? "Взрослые" : "Дети",
                        Collectors.groupingBy(
                                p -> p.getName().charAt(0)
                        )
                ));
        System.out.println(groupedPeople);
        System.out.println("---------------------------------------------");

        //30

        System.out.println(strings.stream().filter(s -> s.length() > 3).map(s -> s.toUpperCase()).sorted().reduce((s, x) -> s + "|" + x).get());;

//        List<String> words = Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Kotlin");
//
//        words.stream().filter(x -> x.length()>3).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        numbers.stream().map(x -> x%2==0?x*2:x).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        List<String> duplicates = Arrays.asList("A", "B", "A", "C", "B", "D");
//        duplicates.stream().distinct().forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        List<Integer> nums = Arrays.asList(1, 3, -2, 5, 0);
//        System.out.println(nums.stream().anyMatch(x -> x<0));
//        System.out.println("---------------------------------------------");
//
//        List<Integer> values = Arrays.asList(-1, 2, -3, 4, 0, -5);
//        Map <String, List<Integer>> OddEven = values.stream().filter(x -> x!= 0).collect(Collectors.groupingBy(x -> x > 0?"Положительные":"Отрицательные"));
//        System.out.println(OddEven);
//        System.out.println("---------------------------------------------");
//
//        List<String> languages = Arrays.asList("Java", "C++", "Python", "Ruby", "Go");
//        Map <Integer, List<String>> stringLength = languages.stream().collect(Collectors.groupingBy(x -> x.length()));
//        System.out.println(stringLength);
//        System.out.println("---------------------------------------------");
//
//        List<Product> products = Arrays.asList(
//                new Product("Laptop", "Electronics", 1000),
//                new Product("Phone", "Electronics", 800),
//                new Product("Shirt", "Clothing", 30)
//        );
//        Map<String, Double> avgPriceByCategory= products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingInt(Product::getPrice)));
//        System.out.println(avgPriceByCategory);
//        System.out.println("---------------------------------------------");
//
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Blueberry");
//        Map <Character, Long> firstLetter = fruits.stream()
//                .collect(Collectors.groupingBy(x -> Character.toUpperCase(x.charAt(0)),Collectors.counting()));
//        System.out.println(firstLetter);
//        System.out.println("---------------------------------------------");
//
//        List<Product> products2 = Arrays.asList(
//                new Product("Mouse", "Electronics", 20),
//                new Product("Keyboard", "Electronics", 50),
//                new Product("Socks", "Clothing", 5)
//        );
//        Map <String, Optional<Product>> cheapByCategory = products2.stream()
//                .collect(Collectors.groupingBy(Product::getCategory, Collectors.minBy(Comparator.comparingInt(Product::getPrice))));
//        System.out.println(cheapByCategory);
//        System.out.println("---------------------------------------------");
//
//        class Person {
//            private String name;
//            private int age;
//
//            public Person(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public int getAge() {
//                return age;
//            }
//
//            @Override
//            public String toString() {
//                return "Person{" +
//                        "name='" + name + '\'' +
//                        ", age=" + age +
//                        '}';
//            }
//        }
//        List<Person> people = Arrays.asList(
//                new Person("Alice", 15),
//                new Person("Bob", 25),
//                new Person("Charlie", 12),
//                new Person("David", 33),
//                new Person("Eve", 17),
//                new Person("Frank", 22),
//                new Person("Grace", 8)
//        );
//
//        Map <String, List<Person>> peopleByAge= people.stream()
//                .collect(Collectors
//                        .groupingBy(x ->
//                        {if (x.age <11) return "Дети";
//                            else if (x.age < 21) return "Подростки";
//                            else if (x.age< 31) return "Взрослые";
//                            else return "Пожилые";
//                        }));
//        System.out.println(peopleByAge);
//        System.out.println("---------------------------------------------");
//
//        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");
//        colors.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        people.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).limit(3).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        List<String> names = Arrays.asList("alice", "bob", "charlie");
//        names.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        List<String> items = Arrays.asList("Coffee", "Tea", "Juice");
//        System.out.println(items.stream().reduce((x, a) -> x + ", "+ a).get());
//        System.out.println("---------------------------------------------");
//
//        String text = "hello";
//        List<Character> uniqueChars = text.chars()
//                .mapToObj(c -> (char) c)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(uniqueChars);
//        System.out.println("---------------------------------------------");
//
//        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(nums2.stream().filter(n -> n%2 == 0).map(x -> x*x).reduce(0,(a,x) -> a+x));
//        System.out.println("---------------------------------------------");
//
//        List<String> words2 = Arrays.asList("cat", "elephant", "dog");
//        System.out.println(words2.stream().max(Comparator.comparingInt(String::length)).get());
//        System.out.println("---------------------------------------------");
//
//        List<Integer> numbers3 = Arrays.asList(2, 4, 5, 7, 10, 11, 12, 13);
//        Map <String, List<Integer>> primeAndComposite = numbers3.stream().collect(Collectors.groupingBy(x -> isPrime(x)?"Простое":"Составное"));
//
//        System.out.println(primeAndComposite);
//        System.out.println("---------------------------------------------");
//
//        String word = "abracadabra";
//        Map <Character, Long> characterLongMap= word.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
//        System.out.println(characterLongMap);
//        System.out.println("---------------------------------------------");
//
//        List<String> list1 = Arrays.asList("A", "B");
//        List<String> list2 = Arrays.asList("1", "2");
//        List<String> result = IntStream.range(0, list1.size())
//                .mapToObj(i -> list1.get(i) + list2.get(i))
//                .collect(Collectors.toList());
//        System.out.println("Результат: " + result);
//        System.out.println("---------------------------------------------");






    }

    public static Long factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("Отрицательное");
        }
        return LongStream.rangeClosed(1,n).reduce(1, (a,x) -> a*x);
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
@FunctionalInterface
interface I{
    int abc (String s);
}
