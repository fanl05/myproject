package com.vip.vavr.collections;

import io.vavr.collection.List;
import io.vavr.collection.Map;

/**
 * @author Ryland
 */
public class TestList {

    /**
     * list
     */
    public static void main(String[] args) {

        List<String> list1 = List.of("1", "12", "123");
        System.out.println("list1: " + list1);

        List<String> list2 = list1.append("1234");
        System.out.println("list2: " + list2);

        List<String> list3 = list2.appendAll(List.of("123456"));
        System.out.println("list3: " + list3);

        User user1 = new User("user1", 22);
        User user2 = new User("user2", 22);
        User user3 = new User("user3", 21);
        User user4 = new User("user4", 20);

        List<User> users = List.of(user1, user2, user3, user4);
        Map<Integer, List<String>> usernamesGroupByAge = users.groupBy(User::getAge).mapValues(userGroup -> userGroup.map(User::getName));
        System.out.println(usernamesGroupByAge);

    }

    static class User{

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
