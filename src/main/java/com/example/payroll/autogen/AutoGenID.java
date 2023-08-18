package com.example.payroll.autogen;

public class AutoGenID {
    static String randomNumber(){
        String result = "";
        int count = 0;

        while(count < 5){
            result += Math.floor(Math.random() * 100);
            count++;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(randomNumber());
    }
}
