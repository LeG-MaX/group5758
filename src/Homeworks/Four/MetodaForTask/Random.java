package Homeworks.Four.MetodaForTask;

import java.util.Arrays;
import java.util.Scanner;

public class Random {

    public int[] createArray (int size){
        return new int[size];
    }
    public void randomArray(int[] chisla, int range) {

        for (int i=0; i < chisla.length; i++){
            chisla[i] = (int) (Math.random()*range);
            System.out.print(chisla[i]+", ");
        }
    }
    public void randomArrayMinMax(int[] chisla, int rangeMax, int rangeMin) {

        for (int i=0; i < chisla.length; i++){
            chisla[i] = (int) (rangeMin + (Math.random()*rangeMax-rangeMin));
            System.out.print(chisla[i]+", ");
        }
    }

}
