package automationexercise.factory.data;

import automationexercise.data.AddressDto;
import automationexercise.util.DataFakerGeneretor;

public class AddressData {

    static DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();

    public static AddressDto createAddressData(){

        AddressDto addressDto = new AddressDto();
        addressDto.setAddress(dataFakerGeneretor.gerarEndereco());
        addressDto.setCity(dataFakerGeneretor.gerarCidade());
        addressDto.setState(dataFakerGeneretor.gerarEstadoAleatorio());
        addressDto.setZipCode(dataFakerGeneretor.gerarZipCode());
        addressDto.setPhoneHome(dataFakerGeneretor.gerarTelefoneDeCasa());
        addressDto.setPhoneMobile(dataFakerGeneretor.gerarTelefoneCelular());
        return addressDto;
    }
}
