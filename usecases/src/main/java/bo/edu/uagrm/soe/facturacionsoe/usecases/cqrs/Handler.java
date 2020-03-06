package bo.edu.uagrm.soe.facturacionsoe.usecases.cqrs;

public interface Handler<TRequest, TResponse> {
    TResponse handleRequest(TRequest request);
}
