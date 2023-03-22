package cours.apprentissage.bankgrpcservice.grpc.client;

import cours.apprentissage.bankgrpcservice.grpc.stub.Bank;
import cours.apprentissage.bankgrpcservice.grpc.stub.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

public class GrpcClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",9999)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub=BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrencyRequest.Builder builder= Bank.ConvertCurrencyRequest.newBuilder();
        builder.setCurrencyForm("USD");
        builder.setCurrencyTo("CFA");
        builder.setAmount(2000);
        Bank.ConvertCurrencyRequest convertCurrencyRequest=builder.build();
        Bank.ConvertCurrencyResponse convertCurrencyResponse=bankServiceBlockingStub.convertCurrency(convertCurrencyRequest);
        System.out.printf("************************************************* \n");
        System.out.printf(String.format("%f en %s => %f en %s",convertCurrencyResponse.getAmount(),
                convertCurrencyResponse.getCurrencyForm(),
                convertCurrencyResponse.getConversionResult(),convertCurrencyResponse.getCurrencyTo()));
        System.out.printf("\n ********************");
        System.in.read(); /*Permet de faire attendre l'application pour ne pas qu'elle quitte*/
    }
}
