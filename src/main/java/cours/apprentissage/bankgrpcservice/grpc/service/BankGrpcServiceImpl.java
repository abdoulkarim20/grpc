package cours.apprentissage.bankgrpcservice.grpc.service;

import cours.apprentissage.bankgrpcservice.grpc.stub.Bank;
import cours.apprentissage.bankgrpcservice.grpc.stub.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getBankAccount(Bank.GetBankAccoutRequest request, StreamObserver<Bank.GetBankAccoutResponse> responseObserver) {
        super.getBankAccount(request, responseObserver);
    }

    @Override
    public void getListAccounts(Bank.GetListsAccountRequest request, StreamObserver<Bank.GetListsAccountResponse> responseObserver) {
        super.getListAccounts(request, responseObserver);
    }

    @Override
    public void convertCurrency(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        /*les donnees du request*/
        String from=request.getCurrencyForm();
        String to=request.getCurrencyTo();
        double amount=request.getAmount();
        double result=amount*10.8;
        /*les donnees du response*/
        Bank.ConvertCurrencyResponse convertCurrencyResponse= Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyForm(from)
                .setCurrencyTo(to)
                .setAmount(amount)
                .setConversionResult(result)
                .build();
        /*On envoi la reponse*/
        responseObserver.onNext(convertCurrencyResponse);/*envoi la reponse au client*/
        responseObserver.onCompleted();/*indique au client ou serveur que la response est terminer*/
    }
}
