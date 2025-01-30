package automationexercise.factory.data;

import automationexercise.data.SignUpDto;
import automationexercise.util.DataFakerGeneretor;



public class SignUpData {

    public static SignUpDto createSignUpDto(){
        SignUpDto signUpDto = new SignUpDto();
        signUpDto.setEmail(DataFakerGeneretor.gerarEmailAleatorio());
        signUpDto.setFirstName(DataFakerGeneretor.gerarPrimeiroNomeAleatorio());
        signUpDto.setLastName(DataFakerGeneretor.gerarUltimoNomeAleatorio());
        signUpDto.setPassword(DataFakerGeneretor.gerarSenhaAleatorio());
        if(DataFakerGeneretor.gerarBooleanAleatorio()){
            signUpDto.setTitle("Mr");
        }else {
            signUpDto.setTitle("Mrs");
        }
        return signUpDto;
    }
}
