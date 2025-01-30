package automationexercise.util;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public class DataFakerGeneretor {

    static Faker faker = new Faker();

    public static String gerarEmailAleatorio(){
        return faker.internet().emailAddress();
    }

    public static String gerarPrimeiroNomeAleatorio(){
        return faker.name().firstName();
    }

    public static String gerarUltimoNomeAleatorio(){
        return faker.name().lastName();
    }

    public static String gerarSenhaAleatorio(){
        return faker.internet().password();
    }

    public static Boolean gerarBooleanAleatorio(){
        return faker.bool().bool();
    }

    public static Integer gerarDiaAleatorio(){
        return faker.number().numberBetween(1, 28);
    }

    public static String gerarMesAleatorio(){
        return faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    }

    public static Integer gerarAnoAleatorio(){
        return faker.number().numberBetween(1900,2025);
    }

}
