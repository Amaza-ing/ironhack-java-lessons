package com.ironhack.w1d4;

public class Main {
    public static void main(String[] args) {
        Player player = new WebPlayer(0.5, 1);
        WebPlayer webPlayer = new WebPlayer(0.9, 2);
        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getCurrentTrack());
    }
}
