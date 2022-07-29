package homeWork.collection;

import javax.swing.*;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        List<FootballTeamMember> player = new ArrayList<>();
        player.add(new FootballTeamMember(13, "Lev"));
        player.add(new FootballTeamMember(12, "Raul"));
        player.add(new FootballTeamMember(14, "Ram"));
        player.add(new FootballTeamMember(16, "Carlos"));
        player.add(new FootballTeamMember(10, "Pele"));
        System.out.println("\n" + createFootballTeam(player));
        System.out.println("------------------------");
        Map<Integer, String> memberMap = new HashMap<>();
        memberMap.put(20, "Henry Benites");
        memberMap.put(15, "Rodrigo Menites");
        memberMap.put(71, "Sergio Bartes");
        memberMap.put(22, "Roberto Lutes");
        memberMap.put(18, "Ronaldo Pites");
        memberMap.put(45, "Reygan Ronald");
        memberMap.put(4, "Valeria Bayden");
        memberMap.put(5, "Antonio Herid");
        memberMap.put(9, "Bertuccio Valisio");
        memberMap.put(1, "Messi Luion");
        memberMap.put(33, "Indigo Hertes");
        memberMap.put(77, "Vasily Bites");
        System.out.println("Full list of football team players");
        printAllMembers(memberMap);
        System.out.println("----------------------");
        System.out.println("if player number exist's, method remove by number returns true, else false ");
        System.out.println(removeFromMap(memberMap, 15));
        System.out.println("------------------");
        printAllMemberNames(memberMap);
        System.out.println("--------------------");
        printAllMembers(memberMap);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Map<Integer, String> teamPlayer = new HashMap<>();
        for (FootballTeamMember member : members) {
            teamPlayer.put(member.getNumber(), member.getName());
            if (teamPlayer.size() == members.size()) {
                return teamPlayer;
            }
        }
        return null;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        for (Integer integer : memberMap.keySet()) {
            if (integer.equals(removedNumber)) {
                memberMap.remove(integer);
                return true;
            }
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        for (String value : memberMap.values()) {
            System.out.println(value);
        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Map.Entry<Integer, String> integerStringEntry : memberMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue());
        }
    }

    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}