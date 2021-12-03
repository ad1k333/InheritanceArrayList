package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Inheritence.Person;
import Inheritence.Student;
import Inheritence.Teacher;

public class Main {

    public static void main(String[] args) {
        Person person2 = new Teacher("Kuanysh", 19, "kuka@email.com", "56 school");
        Person person3 = new Student("Zhomart", 20, "zhomay@email.com", "79 school");
        Person person4 = new Student("Adil", 25, "adik@email.com", "14 school");
        Person person5 = new Student("Amir", 32, "amir@email.com", "56 school");
        //мұрагерлік тобын толтырамыз

        List<Person> people = new ArrayList<>(); //ArrayList құрдық
        people.add(person2); // Person класстарын ArrayList-қа кіргіздік
        people.add(person3);
        people.add(person4);
        people.add(person5);
        String a;
        String b;
        Person c;
        Person d;

        for (int i = 0; i < people.size(); i++) {    //1-ші Цикл құрамыз

            for (int j = 0; j < people.size() - i - 1; j++) {  //2-ші Цикл құрамыз

                a = people.get(j).getName().toUpperCase();
                b = people.get(j + 1).getName().toUpperCase();
                //Name бойынша салыстырамыз
                c = people.get(j);
                d = people.get(j + 1);

                if (a.compareTo(b) > 0) { //сompare aрқылы bubble sort құрдық

                    Person temp = d;
                    people.set(j + 1, c);
                    people.set(j, temp);
                    // bubble sort арқылы орындарын ауыстырамыз
                }
            }
        }
        for (Person pers : people) {
            System.out.println(pers.getInfo()); //информацияны экранға шығарамыз
        }
    }
}
