package cours.apprentissage.bankgrpcservice.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Declaration de l'interface du service distant
 *c'est dans cette interface que nous allons declarer les operation dont on a besoin
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> getGetBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBankAccount",
      requestType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest.class,
      responseType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> getGetBankAccountMethod() {
    io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> getGetBankAccountMethod;
    if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
          BankServiceGrpc.getGetBankAccountMethod = getGetBankAccountMethod = 
              io.grpc.MethodDescriptor.<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBankAccount"))
                  .build();
          }
        }
     }
     return getGetBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest.class,
      responseType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.class,
      responseType = cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod = 
              io.grpc.MethodDescriptor.<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
                  .build();
          }
        }
     }
     return getConvertCurrencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Declaration de l'interface du service distant
   *c'est dans cette interface que nous allons declarer les operation dont on a besoin
   * </pre>
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBankAccount(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     */
    public void convertCurrency(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest,
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse>(
                  this, METHODID_GET_BANK_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest,
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getConvertCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
                cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_CURRENCY)))
          .build();
    }
  }

  /**
   * <pre>
   *Declaration de l'interface du service distant
   *c'est dans cette interface que nous allons declarer les operation dont on a besoin
   * </pre>
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBankAccount(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertCurrency(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Declaration de l'interface du service distant
   *c'est dans cette interface que nous allons declarer les operation dont on a besoin
   * </pre>
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse getBankAccount(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse getListAccounts(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse convertCurrency(cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Declaration de l'interface du service distant
   *c'est dans cette interface que nous allons declarer les operation dont on a besoin
   * </pre>
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse> getBankAccount(
        cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse> getListAccounts(
        cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> convertCurrency(
        cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_ACCOUNT = 0;
  private static final int METHODID_GET_LIST_ACCOUNTS = 1;
  private static final int METHODID_CONVERT_CURRENCY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_ACCOUNT:
          serviceImpl.getBankAccount((cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutRequest) request,
              (io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetBankAccoutResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountRequest) request,
              (io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.GetListsAccountResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<cours.apprentissage.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cours.apprentissage.bankgrpcservice.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBankAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getConvertCurrencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
