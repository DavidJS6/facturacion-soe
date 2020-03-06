package bo.edu.uagrm.soe.facturacionsoe.usecases.ports.cqrs;

public interface RequestHandler<TRequest, TResponse> {
    TResponse handleRequest(TRequest request);
}
