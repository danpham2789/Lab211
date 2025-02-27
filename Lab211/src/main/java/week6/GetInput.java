/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import week5.*;
import week4.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GetInput {
    
    static Scanner sc = new Scanner(System.in);
    
    public static String get(String msg){   
        System.out.print(msg);
        while (true){
            String temp = sc.nextLine();
            try{
                if (temp == null) throw new Exception("Input mustn't be empty");
                return temp;
            }catch (Exception e){
                System.out.println("Error input: " + e);
            }
        }
    }
    
    public static Date checkDate(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            String input = get(msg);
            try {
                Date date = dateFormat.parse(input);
                if (date.getYear() >= Year.now().getValue()) throw new Exception("Invalid year");
                return date;
            } catch (Exception e) {
                System.out.println("Error input date: " + e);
            }
        }
    }
    
    public static String getStringDate(String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            String input = get(msg);
            try {
                return dateFormat.format(dateFormat.parse(input));
            } catch (ParseException e) {
                System.out.println("Error input date: " + e);
            }
        }
    }

    public static int checkInt(String msg){
        int num = 0;
        while (true){
            try {
                num = Integer.parseInt(get(msg));
                if (num < 0) throw new Exception("Number must greater than 0");
                return num;
            } catch (Exception e) {
                System.out.println("Error input int: " + e);
            }
        }
    }
        public static int checkInt(String msg, int n){
        int num = 0;
        while (true){
            try {
                num = Integer.parseInt(get(msg));
                if (num < 0 && num > n) throw new Exception("Invalid number");
                return num;
            } catch (Exception e) {
                System.out.println("Error input int: " + e);
            }
        }
    }
    
    public static double checkDouble(String msg){
        double num = 0;
        while (true){
            try {
                if (num < 0) throw new Exception("Number must greater than 0");
                num = Double.parseDouble(get(msg));
                return num;
            } catch (Exception e) {
                System.out.println("Error input int: " + e);
            }
        }
    }
    
    public static boolean checkBool(String msg){
        while (true){
            String check = get(msg).toLowerCase();
            try {
                if (check.equals("true")) return true;
                else if (check.equals("false")) return false;
                else throw new Exception("Value must be \"TRUE\" or \"FALSE\"");
            } catch (Exception e){
                System.out.println("Error input boolean: " + e);
            }
        }
    }
    
    public static char checkOperator(String msg){
        String operator;
        while (true){
            try {
                operator = get(msg).trim();
                if (!"+".equals(operator) && !"-".equals(operator) && !"*".equals(operator) && !"/".equals(operator) && !"^".equals(operator) && !"=".equals(operator))
                    throw new Exception("Invalid operator");
                return operator.charAt(0);
            } catch (Exception e){
                    System.out.println("Error input: " + e);
            }
        }
    }
    
    public static String check(String msg, String t, String f){
        while (true){
            String check = get(msg);
            try {
                if (check.equals(t)) return t;
                else if (check.equals(f)) return f;
                else throw new Exception("Value must be " + t + " or " + f);
            } catch (Exception e){
                System.out.println("Error input boolean: " + e);
            }
        }
    }
    
    public static String getWithRegex(String msg, String pattern){
        while (true){
            String check = get(msg);
            try{
                if (check.matches(pattern)) return check;
            } catch (Exception e){
                System.out.println("Error input");
            }
        }
    }
}
