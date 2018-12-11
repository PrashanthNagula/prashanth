package com.practise1;
public class SwitchMonthExample {  
public static void main(String[] args) {  
    int month=7;  
    String name = null;
    switch(month){  
    case 1: name="1 - January";
    break;  
    case 2: name="2 - February";
    break;  
    case 3: name="3 - March";
    break;  
    case 4: name="4 - April";
    break;  
    case 5: name="5 - May";
    break;  
    case 6: name="6 - June";
    break;  
    case 7: name="7 - July";
    break;  
    case 8: name="8 - August";
    break;  
    case 9: name="9 - September";
    break;  
    case 10: name="10 - October";
    break;  
    case 11: name="11 - November";
    break;  
    case 12: name="12 - December";
    break;  
    default:System.out.println("Invalid Month");  
    }  
    System.out.println(name);
}  
} 