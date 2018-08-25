package com.company;

import java.util.Scanner;

public class Main {

    public static int[][] unitMatrix(int number){
        int[][] table = new int[number][number];
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table[i].length;j++){
                if (i==j){
                    table[i][j]=1;
                } else{
                    table[i][j]=0;
                }
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość kolumn i wierszy w macierzy kwadratowej: ");
        int number = scanner.nextInt();
        int[][] table = unitMatrix(number);
        System.out.println("Macierz jednostkowa to: ");
        for (int i=0; i< table.length;i++) {
            for (int j=0; j<table[i].length;j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }

    }
}
