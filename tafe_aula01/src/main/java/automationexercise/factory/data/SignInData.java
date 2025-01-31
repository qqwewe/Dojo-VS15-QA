package automationexercise.factory.data;

import automationexercise.data.UserDto;
import automationexercise.util.DataFakerGeneretor;
import com.github.javafaker.Faker;

public class SignInData {


    public static UserDto createSignInDto(){
        UserDto user = new UserDto();

        user.setEmail("testevalido@teste.com");
        user.setPassword("teste123");

        return user;
    }

    public static UserDto createSignInvalid(){
        UserDto user = new UserDto();

        user.setEmail(DataFakerGeneretor.gerarEmailAleatorio());
        user.setPassword(DataFakerGeneretor.gerarSenhaAleatorio());

        return user;
    }

}
