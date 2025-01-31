package automationexercise.util;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DataFakerGeneretor {

    static Faker faker = new Faker(Locale.US);

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

    public static Integer gerarMesAleatorio(){
        return faker.number().numberBetween(1, 12);
    }

    public static Integer gerarAnoAleatorio(){
        return faker.number().numberBetween(1900,2025);
    }

    public static String gerarEndereco(){
        return faker.address().streetAddress();
    }

    public static String gerarCidade(){
        return faker.address().city();
    }

    public static Integer gerarEstadoAleatorio(){
        return faker.number().numberBetween(1,53);
    }

    public static String gerarZipCode(){
        return faker.bothify("#####");
    }

    public static String gerarTelefoneDeCasa() {
        return faker.bothify("####-####");
    }

    public static String gerarTelefoneCelular() {
        return faker.phoneNumber().cellPhone();
    }

    }

