package main;

/**
 * Created by olive on 9/03/2019.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(Math.pow(2, i+1) - (Math.pow(2, i) + 2));
        }
    }
}
