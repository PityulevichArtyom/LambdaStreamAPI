import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.List;

public class StreamApiTraining {

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
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.stream().filter(x -> x%2 == 0).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        //2
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        words.stream().map(String::toUpperCase).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        //3
//        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numbers2.stream().filter(x -> x>5).count());
//        System.out.println("---------------------------------------------");
//
//        //4
//        List<Integer> numbers3 = Arrays.asList(1, 2, 1, 3, 5, 4, 7, 8, 9, 10);
//        numbers3.stream().filter(x -> x > 3).findFirst();
//        System.out.println("---------------------------------------------");
//
//        //5
//        List<Integer> numbers4 = Arrays.asList(1, 2, 1, 3, -5, 4, 7, 8, 9, 10);
//        List<Integer> numbers5 = Arrays.asList(1, 2, 1, 3, 5, 4, 7, 8, 9, 10);
//
//        System.out.println(numbers4.stream().anyMatch(x -> x < 0));
//        System.out.println(numbers5.stream().anyMatch(x -> x < 0));
//        System.out.println("---------------------------------------------");
//
//        //6
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
//        List<Person> personList = new ArrayList<>();
//
//        Person person1 = new Person("Artyom", 21);
//        Person person2 = new Person("Pashka", 22);
//        Person person3 = new Person("Nastya", 17);
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//
//        personList.stream().filter(x -> x.age > 18).forEach(x -> System.out.println("Name = "+ x.name));
//        System.out.println("---------------------------------------------");
//
//        //7
//        personList.stream().sorted(Comparator.comparingInt(x -> x.age)).forEach(x -> System.out.println("Name: "+x.name+" Age: "+ x.age));
//        System.out.println("---------------------------------------------");
//
//        //8
//        Person person4 = new Person("Max", 17);
//        Person person5 = new Person("Alesya", 22);
//        personList.add(person4);
//        personList.add(person5);
//        Map <Integer, List<Person>> listMap = personList.stream().collect(Collectors.groupingBy(x -> x.age));
//        listMap.forEach((age, persons) -> {
//            System.out.println("Возраст " + age + ":");
//            persons.forEach(person -> System.out.println("  - " + person.name));
//        });
//        System.out.println("---------------------------------------------");
//
//        //9
//
//        List<String> Names = personList.stream()
//                .map(person -> person.name)
//                .collect(Collectors.toList());
//        System.out.println(Names);
//        System.out.println("---------------------------------------------");
//
//        //10
//        System.out.println(personList.stream().map(a -> a.age).collect(Collectors.averagingInt(a -> a.intValue())));
//        System.out.println("---------------------------------------------");
//
//        //11
//
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//
//        List<Integer> flatList = listOfLists.stream()
//                .flatMap(x -> x.stream())
//                .collect(Collectors.toList());
//
//        System.out.println(flatList);
//        System.out.println("---------------------------------------------");
//
//        //12
//        numbers3.stream().distinct().sorted().forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        //13
//        Map <String, Integer> nameAgeMap = personList.stream().collect(Collectors.toMap(x -> x.name,x -> x.age));
//        System.out.println(nameAgeMap);
//        System.out.println("---------------------------------------------");
//
//        Person person6 = new Person("Alesya", 26);
//        personList.add(person6);
//
//        //duplicates
//        Map <String, Integer> nameAgeMapDuplicates = personList.stream().collect(Collectors.toMap(x -> x.name,x -> x.age, (o, n) -> o));
//        System.out.println(nameAgeMapDuplicates);
//        System.out.println("---------------------------------------------");
//
//        //14
//
//        Map <Boolean, List<Integer>> evenAndOdd = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
//
//        List<Integer> oddNum = evenAndOdd.get(false);
//        List<Integer> evenNum = evenAndOdd.get(true);
//
//        System.out.println("Чётные: " + evenNum);
//        System.out.println("Нечётные: " + oddNum);
//        System.out.println("---------------------------------------------");
//
//        //15
//
//        personList.stream().filter(x -> x.age > 21 && x.name.charAt(0) == 'A').forEach(x -> System.out.println("Name = " + x.name + ", age = "+ x.age));
//        System.out.println("---------------------------------------------");
//
//        //16
//
//        List<String> strings = Arrays.asList(
//                "Hello",
//                "World",
//                "it's",
//                "Java",
//                "Stream",
//                "API",
//                "asd"
//        );
//
//        String str = strings.stream().reduce((a, x) -> (a + ", "+ x)).get();
//        System.out.println(str);
//        System.out.println("---------------------------------------------");
//
//        //17
//
//        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).get());
//        System.out.println("---------------------------------------------");
//
//        //18
//
//        System.out.println(strings.stream().map(x -> x.length()).reduce((x, a) -> x + a).get());
//
//        System.out.println(strings.stream().mapToInt(x -> x.length()).sum());
//
//        System.out.println("---------------------------------------------");
//
//        //19
//
//        strings.stream().map(x -> x.charAt(0)).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        //20
//
//        strings.stream().filter(x -> x.length() < 5).forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//
//        //21
//
//        System.out.println(numbers2.stream().map(x -> x*x).reduce(0, (a,x) -> a + x));
//
//        System.out.println(numbers2.stream().mapToInt(x -> x*x).sum());
//
//        System.out.println("---------------------------------------------");
//
//        //22
//
//        System.out.println(numbers2.stream().reduce(1, (a, x) -> a*x));
//
//        System.out.println("---------------------------------------------");
//
//        //23
//
//        System.out.println(numbers.stream().max(Integer::compareTo).get());
//        System.out.println(numbers.stream().min(Comparator.comparingInt(x -> x)).get());
//        System.out.println("---------------------------------------------");
//
//        //24
//        IntSummaryStatistics stats = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .summaryStatistics();
//
//        System.out.println("Статистика:");
//        System.out.println("Количество: " + stats.getCount());
//        System.out.println("Сумма: " + stats.getSum());
//        System.out.println("Минимум: " + stats.getMin());
//        System.out.println("Максимум: " + stats.getMax());
//        System.out.println("Среднее: " + stats.getAverage());
//        System.out.println("---------------------------------------------");
//
//        //25
//        System.out.println(factorial(20));
//        System.out.println("---------------------------------------------");
//
//        //26
//        class Product {
//            private String name;
//            private String category;
//            private int price;
//
//            public Product(String name, String category, int price) {
//                this.name = name;
//                this.category = category;
//                this.price = price;
//            }
//
//            @Override
//            public String toString() {
//                return "Product{" +
//                        "name='" + name + '\'' +
//                        ", category='" + category + '\'' +
//                        ", price=" + price +
//                        '}';
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public String getCategory() {
//                return category;
//            }
//
//            public int getPrice() {
//                return price;
//            }
//        }
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product("iPhone 13", "Смартфоны", 79900));
//        products.add(new Product("Samsung Galaxy S21", "Смартфоны", 69900));
//        products.add(new Product("Xiaomi Mi 11", "Смартфоны", 54900));
//        products.add(new Product("MacBook Pro 14", "Ноутбуки", 149900));
//        products.add(new Product("ASUS ROG Zephyrus", "Ноутбуки", 129900));
//        products.add(new Product("Sony WH-1000XM4", "Наушники", 29900));
//        products.add(new Product("Apple AirPods Pro", "Наушники", 19900));
//        products.add(new Product("PlayStation 5", "Игровые консоли", 49900));
//        products.add(new Product("Xbox Series X", "Игровые консоли", 45900));
//        products.add(new Product("Kindle Paperwhite", "Электронные книги", 11900));
//
//        Map<String, Product> mostExpensiveByCategory = products.stream()
//                .collect(Collectors.toMap(
//                        p -> p.category,
//                        p -> p,
//                        (p1, p2) -> p1.price > p2.price ? p1 : p2
//                ));
//
//        System.out.println(mostExpensiveByCategory);
//        System.out.println("---------------------------------------------");
//
//        //27
//        int n = 5;
//        products.stream().sorted(Comparator.comparingInt(Product::getPrice).reversed()).limit(n).forEach(System.out::println);
//
//        System.out.println("---------------------------------------------");
//
//        //28
//        System.out.println(numbers.stream().filter(x -> x%2 == 0).map(x -> x*x).reduce(0, (x, a) -> x+a));
//        System.out.println("---------------------------------------------");
//
//        //29
//
//        List<Person> people = Arrays.asList(
//                new Person("Anna", 12),
//                new Person("Boris", 25),
//                new Person("Alex", 8),
//                new Person("Kate", 30),
//                new Person("Artem", 17),
//                new Person("Maria", 22),
//                new Person("Alice", 14),
//                new Person("Bob", 40)
//        );
//
//        Map<String, Map<Character, List<Person>>> groupedPeople = people.stream()
//                .collect(Collectors.groupingBy(
//                        p -> p.getAge() >= 18 ? "Взрослые" : "Дети",
//                        Collectors.groupingBy(
//                                p -> p.getName().charAt(0)
//                        )
//                ));
//        System.out.println(groupedPeople);
//        System.out.println("---------------------------------------------");
//
//        //30
//
//        System.out.println(strings.stream().filter(s -> s.length() > 3).map(s -> s.toUpperCase()).sorted().reduce((s, x) -> s + "|" + x).get());;

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
//
//        List<Integer> numbers10 = List.of(1, 2, 3, 4, 5, 6);
//        IntSummaryStatistics summaryStatistics = numbers10.stream().mapToInt(x -> x).summaryStatistics();
//        System.out.println(summaryStatistics.getMax());
//
//        List<String> words = Arrays.asList("Apple", "Banana", "Orange", "Uber", "Cat", "Dog", "Elephant");
//
//        List<Double> numbers = Arrays.asList(1.5, 2.7, 3.0, 4.2, 5.1, 6.8);
//
//        Map<String, Double> doubleMap =  numbers.stream()
//                .collect(Collectors
//                        .groupingBy(x -> (int) Math.floor(x) % 2 == 0?"Even":"Odd",
//                                Collectors
//                                        .averagingDouble(Double::doubleValue)));
//
//        System.out.println(doubleMap);
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
//
//        List<Integer> integerList = list1.stream().filter(list2::contains).toList();
//        System.out.println(integerList);
//
//        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
//
//        System.out.println(nums.stream().reduce(0, (x, a) -> x+a));
//
//        List<String> words1 = Arrays.asList("cat", "dog", "bird", "elephant", "fox");
//
//        Map<Integer, List<String>> integerListMap = words1.stream().collect(Collectors.groupingBy(String::length));
//
//        System.out.println(integerListMap);
//
//        words1.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
//
//        String text = "programming";
//
//        List<Character> characterList = text.chars().mapToObj(x -> (char) x).distinct().toList();
//
//        System.out.println(characterList);
//
//        String text3 = "hello world hello java world java";
//
//        Map<String, Long> wordCounts = Arrays.stream(text3.split(" "))
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(
//                        word -> word,
//                        Collectors.counting()
//                ));
//
//        System.out.println(wordCounts);
//
//        List<String> words4 = Arrays.asList("Java", "Python", "JavaScript", "Kotlin", "C++");
//
//        System.out.println(words4.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get());
//
//        record Person(String name, int age) {}
//        List<Person> people = Arrays.asList(
//                new Person("Alice", 25),
//                new Person("Bob", 30),
//                new Person("Charlie", 20),
//                new Person("David", 30)
//        );
//
//        List<Person> result = people.stream().filter(x -> x.age > 22).sorted((x, a) -> a.name.compareTo(x.name)).toList();
//        System.out.println(result);
//
//        List<Integer> numbers5 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> list5 = Arrays.asList(1, 2, 3, 4);
//        List<Integer> list6 = Arrays.asList(3, 4, 5, 6);
//
//        Stream.concat(list5.stream(), list6.stream()).distinct().sorted().forEach(System.out::println);
//        List<Integer> numbers11 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numbers11.stream().filter(x -> x>5).count());
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
//        List<Person> personList = new ArrayList<>();
//
//        Person person1 = new Person("Artyom", 21);
//        Person person2 = new Person("Pashka", 22);
//        Person person3 = new Person("Nastya", 17);
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//
//        personList.stream().filter(x -> x.age > 18).forEach(System.out::println);
//
//        personList.stream().sorted(Comparator.comparingInt(x -> x.age)).forEach(System.out::println);
//        Person person4 = new Person("Max", 17);
//        Person person5 = new Person("Alesya", 22);
//        personList.add(person4);
//        personList.add(person5);
//
//        Map<Integer, List<Person>> integerListMap = personList.stream().collect(Collectors.groupingBy(x -> x.age));
//
//        System.out.println(integerListMap);
//
//        List<String> listString = personList.stream().map(x-> x.name).toList();
//        System.out.println(listString);
//
//        System.out.println(personList.stream().collect(Collectors.averagingInt(x -> x.age)));
//
//       List<List<Integer>> listOfLists = Arrays.asList(
//               Arrays.asList(1, 2, 3),
//               Arrays.asList(4, 5, 6),
//               Arrays.asList(7, 8, 9)
//        );
//
//        List<Integer> flatList = listOfLists.stream()
//                .flatMap(x -> x.stream())
//                .collect(Collectors.toList());
//
//        Map <String, Integer> nameAgeMap = personList.stream().collect(Collectors.toMap(x -> x.name, x -> x.age));
//
//        System.out.println(nameAgeMap);
//
//        List<Integer> numbers3 = Arrays.asList(2, 4, 5, 7, 10, 11, 12, 13);
//
//        Map<String, List<Integer>> stringListMap = numbers3.stream().collect(Collectors.groupingBy(x -> x%2==0?"Четные":"Нечетные"));
//
//        System.out.println(stringListMap);
//
//        personList.stream().filter(x -> x.age>20&&x.name.charAt(0) == 'A').forEach(System.out::println);
//
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
//
//        System.out.println(words.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get());
//
//        System.out.println(words.stream().map(x -> x.length()).reduce(0, (x, a) -> x+a));
//
//        words.stream().filter(x -> x.length()> 5).forEach(System.out::println);
//
//        words.stream().map(x -> x.charAt(0)).forEach(System.out::println);
//
//        System.out.println(numbers3.stream().map(x -> x*x).reduce(0, (x,a) -> x + a));
//
//        System.out.println(numbers3.stream().reduce(1, (x,a) -> x*a));
//
//        System.out.println(numbers3.stream().max(Integer::compareTo).get());
//
//        IntSummaryStatistics intSummaryStatistics = numbers3.stream().mapToInt(x -> (int) x).summaryStatistics();
//
//        System.out.println(intSummaryStatistics.getAverage());
//        record Stats(int min, int max) {}
//
//        List<Integer> numbers = List.of(1,2,3,4,5,6);
//        Stats stats = numbers.stream().collect(Collectors.teeing(
//                Collectors.minBy(Integer::compare),
//                Collectors.maxBy(Integer::compare),
//                (minOpt, maxOpt) -> new Stats(minOpt.get(), maxOpt.get())
//        ));
//
//        System.out.println(stats.min + " " + stats.max);
         class Sale {
            private String productName;
            private String category;
            private double amount;
            private LocalDate date;
            private String salesPerson;

            public Sale(String productName, String category, double amount, LocalDate date, String salesPerson) {
                this.productName = productName;
                this.category = category;
                this.amount = amount;
                this.date = date;
                this.salesPerson = salesPerson;
            }

             public String getProductName() {
                 return productName;
             }

             public String getCategory() {
                 return category;
             }

             public double getAmount() {
                 return amount;
             }

             public LocalDate getDate() {
                 return date;
             }

             public String getSalesPerson() {
                 return salesPerson;
             }

             @Override
            public String toString() {
                return "Sale{" +
                        "productName='" + productName + '\'' +
                        ", category='" + category + '\'' +
                        ", amount=" + amount +
                        ", date=" + date +
                        ", salesPerson='" + salesPerson + '\'' +
                        '}';
            }
         }

                List<Sale> sales = List.of(
                        new Sale("Laptop", "Electronics", 999.99, LocalDate.of(2023, 5, 10), "John Smith"),
                        new Sale("Smartphone", "Electronics", 699.99, LocalDate.of(2023, 5, 12), "Sarah Johnson"),
                        new Sale("Desk Chair", "Furniture", 149.99, LocalDate.of(2023, 5, 15), "Mike Brown"),
                        new Sale("Coffee Maker", "Appliances", 79.99, LocalDate.of(2023, 5, 18), "Emily Davis"),
                        new Sale("Running Shoes", "Sporting Goods", 89.99, LocalDate.of(2023, 5, 20), "David Wilson"),
                        new Sale("Bluetooth Speaker", "Electronics", 129.99, LocalDate.of(2023, 5, 22), "Lisa Taylor"),
                        new Sale("Notebook", "Office Supplies", 4.99, LocalDate.of(2023, 5, 25), "Robert Anderson"),
                        new Sale("Backpack", "Accessories", 49.99, LocalDate.of(2023, 5, 28), "Jennifer Martinez"),
                        new Sale("Wireless Headphones", "Electronics", 199.99, LocalDate.of(2023, 6, 1), "Thomas Clark"),
                        new Sale("Yoga Mat", "Sporting Goods", 29.99, LocalDate.of(2023, 6, 5), "Jessica Rodriguez")
                );

        Map<String, Double> topCategories = sales.stream()
                .filter(sale -> sale.getAmount() >= 40)
                .collect(Collectors.groupingBy(
                                Sale::getCategory,
                                Collectors.summingDouble(Sale::getAmount)
                        ))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                        .limit(3)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));

        System.out.println("Топ-3 категорий:");
        topCategories.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(topCategories.getClass().getName());

        class ErrorLog {
            private LocalDate date;
            private String level;
            private String service;
            private String message;

            public ErrorLog(LocalDate date, String level, String service, String message) {
                this.date = date;
                this.level = level;
                this.message = message;
                this.service = service.split(":")[0];
            }

            public LocalDate getDate() {
                return date;
            }

            public String getLevel() {
                return level;
            }

            public String getService() {
                return service;
            }

            @Override
            public String toString() {
                return "ErrorLog{" +
                        "date=" + date +
                        ", level='" + level + '\'' +
                        ", service='" + service + '\'' +
                        ", message='" + message + '\'' +
                        '}';
            }

            public String getMessage() {
                return message;
            }
        }

        List<ErrorLog> errorLogs = List.of(
                new ErrorLog(
                        LocalDate.of(2024, 1, 15),
                        "ERROR",
                        "UserService:Login",
                        "Failed to authenticate user: invalid credentials"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 15),
                        "ERROR",
                        "PaymentService:Transaction",
                        "Credit card declined: insufficient funds"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 16),
                        "ERROR",
                        "DatabaseService:Connection",
                        "Connection timeout to primary database cluster"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 16),
                        "WARNING",
                        "CacheService:Redis",
                        "High memory usage detected"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 17),
                        "ERROR",
                        "EmailService:SMTP",
                        "Failed to send email: connection refused"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 17),
                        "ERROR",
                        "OrderService:Fulfillment",
                        "Missing shipping address for order #12345"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 18),
                        "ERROR",
                        "InventoryService:Stock",
                        "Product ID 67890 out of stock"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 18),
                        "ERROR",
                        "AuthService:JWT",
                        "Token validation failed: expired"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 19),
                        "ERROR",
                        "AnalyticsService:Report",
                        "Failed to generate monthly report"
                ),
                new ErrorLog(
                        LocalDate.of(2024, 1, 19),
                        "ERROR",
                        "ShippingService:Tracking",
                        "Invalid tracking number format"
                )
        );
        System.out.println(errorLogs.stream()
                .filter(log -> LocalDate.of(2024,1,19).equals(log.getDate()))
                .filter(log -> "ERROR".equals(log.getLevel()))
                .map(ErrorLog::getService)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", ")));
        class Employee {
            private String name;
            private String department;
            private int salary;
            private int age;
            private List<String> projects;

            public Employee(String name, String department, int salary, int age, List<String> projects) {
                this.name = name;
                this.department = department;
                this.salary = salary;
                this.age = age;
                this.projects = projects;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", department='" + department + '\'' +
                        ", salary=" + salary +
                        ", age=" + age +
                        ", projects=" + projects +
                        '}';
            }

            public String getName() {
                return name;
            }

            public String getDepartment() {
                return department;
            }

            public int getSalary() {
                return salary;
            }

            public int getAge() {
                return age;
            }

            public List<String> getProjects() {
                return projects;
            }
        }
        List<Employee> employees = List.of(
                new Employee(
                        "Иван Петров",
                        "Разработка",
                        120000,
                        28,
                        List.of("Система управления заказами", "Мобильное приложение")
                ),
                new Employee(
                        "Елена Смирнова",
                        "Маркетинг",
                        95000,
                        32,
                        List.of("Кампания по продвижению", "Анализ рынка")
                ),
                new Employee(
                        "Алексей Иванов",
                        "Финансы",
                        150000,
                        35,
                        List.of("Годовой отчет", "Бюджетирование")
                ),
                new Employee(
                        "Ольга Кузнецова",
                        "HR",
                        80000,
                        29,
                        List.of("Программа адаптации", "Обучение сотрудников")
                ),
                new Employee(
                        "Дмитрий Соколов",
                        "Разработка",
                        135000,
                        31,
                        List.of("Веб-портал", "API интеграция")
                ),
                new Employee(
                        "Анна Воробьева",
                        "Продажи",
                        110000,
                        27,
                        List.of("Расширение клиентской базы", "Партнерская программа")
                ),
                new Employee(
                        "Сергей Павлов",
                        "Техподдержка",
                        75000,
                        25,
                        List.of("Система тикетов", "База знаний")
                ),
                new Employee(
                        "Мария Федорова",
                        "Аналитика",
                        130000,
                        30,
                        List.of("Дашборды KPI", "Прогнозирование продаж")
                ),
                new Employee(
                        "Андрей Николаев",
                        "Разработка",
                        140000,
                        33,
                        List.of("Микросервисная архитектура", "Оптимизация БД")
                ),
                new Employee(
                        "Юлия Козлова",
                        "Дизайн",
                        90000,
                        26,
                        List.of("Редизайн логотипа", "UI/UX мобильного приложения")
                )
        );
        Map<String, List<Employee>> employeeMap  = employees.stream()
                .collect(Collectors.teeing(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingInt(Employee::getSalary)
                        ),
                        Collectors.toList(),
                        (avgSalaries, allEmps) -> allEmps.stream()
                                .filter(emp -> avgSalaries.getOrDefault(emp.getDepartment(), 0.0) > 50000)
                                .filter(emp -> emp.getAge() > 30)
                                .filter(emp -> emp.getProjects().size() > 2)
                                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                                .collect(Collectors.groupingBy(
                                        Employee::getDepartment,
                                        LinkedHashMap::new,
                                        Collectors.toList()
                                ))
                ));

        System.out.println(employeeMap);

        class Transaction {
            private final UUID id;
            private final UUID userId;
            private final double amount;
            private final Type type;
            private final Instant timestamp;
            enum Type {
                DEBIT,
                CREDIT
            }

            public Transaction(UUID userId, double amount, Type type, Instant timestamp) {
                this.id = UUID.randomUUID();
                this.userId = userId;
                this.amount = amount;
                this.type = type;
                this.timestamp = timestamp;
            }

            public UUID getId() { return id; }
            public UUID getUserId() { return userId; }
            public double getAmount() { return amount; }
            public Type getType() { return type; }
            public Instant getTimestamp() { return timestamp; }

            @Override
            public String toString() {
                return String.format("Transaction[id=%s, userId=%s, amount=%.2f, type=%s, time=%s]",
                        id, userId, amount, type, timestamp);
            }
        }
            UUID user1 = UUID.randomUUID();
            UUID user2 = UUID.randomUUID();
            UUID user3 = UUID.randomUUID();

        List<Transaction> transactions = List.of(
                new Transaction(user1, 5000, Transaction.Type.CREDIT, Instant.parse("2023-01-15T00:00:00Z")),
                new Transaction(user1, 6000, Transaction.Type.DEBIT, Instant.parse("2023-01-20T00:00:00Z")),
                new Transaction(user1, 3000, Transaction.Type.CREDIT, Instant.parse("2023-02-10T00:00:00Z")),
                new Transaction(user2, 12000, Transaction.Type.CREDIT, Instant.parse("2023-02-05T00:00:00Z")),
                new Transaction(user2, 500, Transaction.Type.DEBIT, Instant.parse("2023-02-15T00:00:00Z")),
                new Transaction(user3, 4000, Transaction.Type.CREDIT, Instant.parse("2023-01-10T00:00:00Z")),
                new Transaction(user3, 3000, Transaction.Type.DEBIT, Instant.parse("2023-02-20T00:00:00Z"))
        );
        List <String> strings = transactions.stream()
                .collect(Collectors.teeing(
                        // Коллектор 1: Общий оборот по пользователям
                        Collectors.groupingBy(
                                Transaction::getUserId,
                                Collectors.summingDouble(t -> Math.abs(t.getAmount()))
                        ),
                        // Коллектор 2: Оборот по пользователям и месяцам
                        Collectors.groupingBy(
                                Transaction::getUserId,
                                Collectors.groupingBy(
                                        t -> YearMonth.from(t.getTimestamp().atZone(ZoneId.systemDefault())),
                                        Collectors.summingDouble(t -> Math.abs(t.getAmount()))
                                )
                        ),
                        // Обработка результатов
                        (totalTurnover, monthlyTurnover) -> monthlyTurnover.entrySet().stream()
                                .filter(entry -> totalTurnover.getOrDefault(entry.getKey(), 0.0) >= 10000)
                                .map(entry -> {
                                    UUID userId = entry.getKey();
                                    YearMonth bestMonth = entry.getValue().entrySet().stream()
                                            .max(Map.Entry.comparingByValue())
                                            .map(Map.Entry::getKey)
                                            .orElse(null);
                                    double bestMonthValue = entry.getValue().getOrDefault(bestMonth, 0.0);
                                    return new AbstractMap.SimpleEntry<>(userId,
                                            new AbstractMap.SimpleEntry<>(bestMonth, bestMonthValue));
                                })
                                .filter(e -> e.getValue().getKey() != null)
                                .sorted(Comparator.
                                        comparingDouble(e -> -e.getValue().getValue()))
                                .map(e -> String.format(
                                        "User %s: best month %s (turnover %.2f)",
                                        e.getKey(),
                                        e.getValue().getKey(),
                                        e.getValue().getValue()
                                ))
                                .collect(Collectors.toList())
                ));
        System.out.println(strings);

        class OrderItem {
            private final Long productId;
            private final int quantity;
            private final double price;

            public OrderItem(Long productId, int quantity, double price) {
                this.productId = productId;
                this.quantity = quantity;
                this.price = price;
            }

            public Long getProductId() { return productId; }
            public int getQuantity() { return quantity; }
            public double getPrice() { return price; }
        }

        class Order {
            private final String orderId;
            private final String customerId;
            private final List<OrderItem> items;

            public Order(String orderId, String customerId, List<OrderItem> items) {
                this.orderId = orderId;
                this.customerId = customerId;
                this.items = items;
            }

            public String getOrderId() { return orderId; }
            public String getCustomerId() { return customerId; }
            public List<OrderItem> getItems() { return items; }
        }


        List<Order> orders = List.of(
                new Order("ORD001", "CUST1", List.of(
                        new OrderItem(101L, 2, 150.0),
                        new OrderItem(102L, 1, 300.0)
                )),
                new Order("ORD002", "CUST2", List.of(
                        new OrderItem(102L, 3, 300.0),
                        new OrderItem(103L, 5, 50.0)
                )),
                new Order("ORD003", "CUST3", List.of(
                        new OrderItem(101L, 4, 150.0),
                        new OrderItem(104L, 2, 200.0)
                )),
                new Order("ORD004", "CUST1", List.of(
                        new OrderItem(105L, 1, 100.0),
                        new OrderItem(106L, 2, 100.0)
                )),
                new Order("ORD005", "CUST4", List.of(
                        new OrderItem(102L, 2, 300.0),
                        new OrderItem(103L, 10, 50.0)
                ))
        );
        Map<Long, Long> topProducts = orders.stream()
                .filter(order -> order.getItems().stream()
                        .mapToDouble(item -> item.getQuantity() * item.getPrice())
                        .sum() > 500)
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.groupingBy(
                        OrderItem::getProductId,
                        Collectors.summingLong(OrderItem::getQuantity)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<Long, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(topProducts);

        class Student {
            private final String name;
            private final String group;
            private final List<Integer> grades;
            private final List<String> subjects;

            public Student(String name, String group, List<Integer> grades, List<String> subjects) {
                this.name = name;
                this.group = group;
                this.grades = grades;
                this.subjects = subjects;
            }

            public String getGroup() { return group; }
            public List<Integer> getGrades() { return grades; }
            public List<String> getSubjects() { return subjects; }

            public double getAverageGrade() {
                return grades.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);
            }
        }

        List<Student> students = List.of(
                new Student("Иван", "Группа1", List.of(5, 4, 5), List.of("Математика", "Физика")),
                new Student("Петр", "Группа1", List.of(4, 5, 5), List.of("Математика", "Химия")),
                new Student("Сергей", "Группа1", List.of(3, 4, 4), List.of("Физика", "Химия")),
                new Student("Анна", "Группа2", List.of(5, 5, 5), List.of("Математика", "Информатика")),
                new Student("Мария", "Группа2", List.of(5, 4, 5), List.of("Математика", "Физика")),
                new Student("Дмитрий", "Группа2", List.of(5, 5, 4), List.of("Информатика", "Физика")),
                new Student("Елена", "Группа3", List.of(3, 3, 4), List.of("Химия", "Биология"))
        );

        Map<String, Map<String, Object>> groupStats = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGroup,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    long totalStudents = list.size();
                                    long successfulStudents = list.stream()
                                            .filter(s -> s.getAverageGrade() > 4.0)
                                            .count();

                                    if ((double) successfulStudents / totalStudents > 0.7) {
                                        double groupAvg = list.stream()
                                                .flatMapToDouble(s -> DoubleStream.of(s.getAverageGrade()))
                                                .average()
                                                .orElse(0.0);


                                        String popularSubject = list.stream()
                                                .flatMap(s -> s.getSubjects().stream())
                                                .collect(Collectors.groupingBy(
                                                        subject -> subject,
                                                        Collectors.counting()
                                                ))
                                                .entrySet().stream()
                                                .max(Map.Entry.comparingByValue())
                                                .map(Map.Entry::getKey)
                                                .orElse("Нет данных");

                                        Map<String, Object> stats = new HashMap<>();
                                        stats.put("Количество студентов", totalStudents);
                                        stats.put("Средний балл группы", groupAvg);
                                        stats.put("Самый популярный предмет", popularSubject);
                                        return stats;
                                    }
                                    return null;
                                }
                        )
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        groupStats.forEach((group, stats) -> {
            System.out.println("\nГруппа: " + group);
            stats.forEach((key, value) ->
                    System.out.println(key + ": " + value));
        });

        class Event {
            private final String eventId;
            private final String userId;
            private final String eventType;
            private final Instant timestamp;
            private final Map<String, Object> data;

            public Event(String eventId, String userId, String eventType,
                         Instant timestamp, Map<String, Object> data) {
                this.eventId = eventId;
                this.userId = userId;
                this.eventType = eventType;
                this.timestamp = timestamp;
                this.data = data;
            }

            public String getUserId() { return userId; }
            public String getEventType() { return eventType; }
            public Instant getTimestamp() { return timestamp; }
            public Map<String, Object> getData() { return data; }
        }

        List<Event> events = List.of(
                new Event("1", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(5)),
                        Map.of("amount", 1500, "product", "Laptop")),
                new Event("2", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(10)),
                        Map.of("amount", 800, "product", "Phone")),
                new Event("3", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(15)),
                        Map.of("amount", 2500, "product", "Tablet")),
                new Event("4", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(20)),
                        Map.of("amount", 300, "product", "Accessory")),
                new Event("5", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(25)),
                        Map.of("amount", 1200, "product", "Monitor")),
                new Event("6", "user1", "PURCHASE", Instant.now().minus(Duration.ofDays(28)),
                        Map.of("amount", 500, "product", "Mouse")),
                new Event("7", "user2", "PURCHASE", Instant.now().minus(Duration.ofDays(2)),
                        Map.of("amount", 700, "product", "Keyboard")),
                new Event("8", "user2", "PURCHASE", Instant.now().minus(Duration.ofDays(7)),
                        Map.of("amount", 1800, "product", "PC")),
                new Event("9", "user2", "VIEW", Instant.now().minus(Duration.ofDays(1)),
                        Map.of("product", "Laptop")),
                new Event("10", "user3", "PURCHASE", Instant.now().minus(Duration.ofDays(29)),
                        Map.of("amount", 3500, "product", "TV"))
        );

        Map<String, Long> result = events.stream()
                .filter(e -> "PURCHASE".equals(e.getEventType()))
                .filter(e -> e.getTimestamp().isAfter(Instant.now().minus(Duration.ofDays(30))))
                .collect(Collectors.teeing(
                        // Первый коллектор: считаем покупки по пользователям
                        Collectors.groupingBy(
                                Event::getUserId,
                                Collectors.counting()
                        ),
                        // Второй коллектор: собираем сумму покупок по пользователям
                        Collectors.groupingBy(
                                Event::getUserId,
                                Collectors.summingDouble(e -> ((Number) e.getData().getOrDefault("amount", 0)).doubleValue())
                        ),
                        (purchaseCounts, purchaseSums) -> purchaseCounts.entrySet().stream()
                                .filter(e -> e.getValue() > 5)
                                .map(e -> {
                                    String userId = e.getKey();
                                    double total = purchaseSums.getOrDefault(userId, 0.0);
                                    int group = (int) (total / 1000) * 1000;
                                    return String.format("%d-%d", group, group + 999);
                                })
                                .collect(Collectors.groupingBy(
                                        range -> range,
                                        Collectors.counting()
                                ))
                ));

        System.out.println("Количество пользователей по группам:");
        result.forEach((range, count) ->
                System.out.println(range + ": " + count + " пользователей"));

        class Book {
            private final String title;
            private final List<String> authors;
            private final String genre;
            private final int publishYear;
            private final double rating;
            private final double price;

            public Book(String title, List<String> authors, String genre,
                        int publishYear, double rating, double price) {
                this.title = title;
                this.authors = authors;
                this.genre = genre;
                this.publishYear = publishYear;
                this.rating = rating;
                this.price = price;
            }

            public String getTitle() { return title; }
            public List<String> getAuthors() { return authors; }
            public String getGenre() { return genre; }
            public int getPublishYear() { return publishYear; }
            public double getRating() { return rating; }
            public double getPrice() { return price; }
        }


        List<Book> books = List.of(
                new Book("Book1", List.of("Author1"), "Fantasy", 2005, 4.5, 15.99),
                new Book("Book2", List.of("Author2"), "Fantasy", 2008, 4.2, 12.99),
                new Book("Book3", List.of("Author3"), "Fantasy", 2003, 3.9, 10.99),
                new Book("Book4", List.of("Author4"), "Fantasy", 2012, 4.8, 18.99),
                new Book("Book5", List.of("Author5"), "Sci-Fi", 2015, 4.1, 14.99),
                new Book("Book6", List.of("Author6"), "Sci-Fi", 2018, 4.6, 16.99),
                new Book("Book7", List.of("Author7"), "Sci-Fi", 2011, 3.8, 11.99),
                new Book("Book8", List.of("Author8"), "Mystery", 1995, 4.3, 9.99),
                new Book("Book9", List.of("Author9"), "Mystery", 1998, 4.7, 13.99),
                new Book("Book10", List.of("Author10"), "Mystery", 2002, 4.0, 12.99)
        );

        System.out.println(books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.groupingBy(
                                book -> (book.getPublishYear() / 10) * 10 + "s",
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .filter(book -> book.getRating() > 4.0)
                                                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                                                .limit(3)
                                                .collect(Collectors.toList())
                                )
                        )
                )));






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