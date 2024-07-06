package alura.converter;

public class typeOfCurrency {

    String typeOfCurrency;
    String currency;

    public typeOfCurrency(int opcion, double cantidad) {
        switch (opcion){
            case 1:
                typeOfCurrency = "USD";
                currency = "ARS";

                new Request(typeOfCurrency, currency, cantidad);


                break;

                case 2:
                    typeOfCurrency = "ARS";
                    currency = "USD";

                    new Request(typeOfCurrency, currency, cantidad);

                    break;

                    case 3:
                        typeOfCurrency = "USD";
                        currency = "BRL";
                        new Request(typeOfCurrency, currency, cantidad);

                        break;

                        case 4:
                            typeOfCurrency = "BRL";
                            currency = "USD";
                            new Request(typeOfCurrency, currency, cantidad);

                            break;

                            case 5:
                                typeOfCurrency = "USD";
                                currency = "COP";
                                new Request(typeOfCurrency, currency, cantidad);

                                break;

                                case 6:
                                    typeOfCurrency = "COP";
                                    currency = "USD";
                                    new Request(typeOfCurrency, currency, cantidad);

                                    break;
        }
    }
}
