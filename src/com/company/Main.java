package com.company;

import com.company.scooters.KingSongDS11;
import com.company.scooters.KugooG2Pro;
import com.company.scooters.MaxPower;
import com.company.scooters.XiaomiM365;

public class Main {

    public static void main(String[] args) {
        XiaomiM365 xiaomiM365 = new XiaomiM365(36);
        KugooG2Pro kugooG2Pro = new KugooG2Pro(48);
        KingSongDS11 kingSongDS11 = new KingSongDS11(60);


        printPower(xiaomiM365);
        printPower(kugooG2Pro);
        printPower(kingSongDS11);

    }
    public static void printPower(MaxPower maxPower) {
        System.out.println(maxPower.getPower());
    }
}
