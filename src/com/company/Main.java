package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>movies = new ArrayList<>();

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your favorite movies and Q to quit: ");
            String keyboard = input.next();

            if(keyboard.charAt(0) == 'Q'|| keyboard.charAt(0) == 'q'){
                break;
            }

            movies.add(keyboard);
        }

        for(String movie: movies){
            System.out.println(movie);
        }
    }
}
