package Lessons.Lessons6.LessonCode.Methods;

import Lessons.Lessons6.LessonCode.Methods.Converter;

public class TempConverterDemo {

    public static void main(String[] args) {

        Converter converter = new Converter();
        Double tempK = converter.converterCelsiumToKelvin(21);
        //converter.printConverter("Convert temp from", 21, "Celsium in Kelvin");
    }
}
