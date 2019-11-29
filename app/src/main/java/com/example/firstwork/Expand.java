package com.example.firstwork;

public class Expand {
    String[][] strings = new String[MainInterface.size * 2][2];
    public String[][] Expand() {
        for (int index = 0; index < MainInterface.size; index++) {
            strings[index] = MainInterface.user[index];
        }
        return strings;
    }
}
