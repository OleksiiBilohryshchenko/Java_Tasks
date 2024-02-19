package com.example.task;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);


        printDoubled(items);


        System.out.println("***********************");

        FootballPlayer Joe = new FootballPlayer("Joe");
        BaseballPlayer Mark = new BaseballPlayer("Mark");
        SoccerPlayer Bob = new SoccerPlayer("Bob");

        Teams<SoccerPlayer> Unio = new Teams<>("Unio"); //Team accepting any object



        Unio.addPlayer(Bob);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer i : items){
            System.out.println(i*2);
        }
    }

}
