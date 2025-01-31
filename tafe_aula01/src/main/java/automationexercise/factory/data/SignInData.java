package automationexercise.factory.data;

import automationexercise.data.UserDto;

public class SignInData {

    public static UserDto createSignInDto(){
        UserDto user = new UserDto();
        user.setEmail("testevalido@teste.com");
        user.setPassword("teste123");

        return user;
    }

}
