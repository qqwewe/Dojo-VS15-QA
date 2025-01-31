package automationexercise.factory.data;

import automationexercise.data.UserDto;
import automationexercise.util.DataFakerGeneretor;

public class SignUpData {

    public static UserDto createSignUpDto(){
        UserDto signUpDto = new UserDto();
        signUpDto.setEmail(DataFakerGeneretor.gerarEmailAleatorio());
        signUpDto.setFirstName(DataFakerGeneretor.gerarPrimeiroNomeAleatorio());
        signUpDto.setLastName(DataFakerGeneretor.gerarUltimoNomeAleatorio());
        signUpDto.setPassword(DataFakerGeneretor.gerarSenhaAleatorio());
        if(DataFakerGeneretor.gerarBooleanAleatorio()){
            signUpDto.setTitle("Mr");
        }else {
            signUpDto.setTitle("Mrs");
        }
        signUpDto.setDay(DataFakerGeneretor.gerarDiaAleatorio());
        signUpDto.setMonth(DataFakerGeneretor.gerarMesAleatorio());
        signUpDto.setYear(DataFakerGeneretor.gerarAnoAleatorio());
        return signUpDto;
    }

}
