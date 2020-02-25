package bo.edu.uagrm.soe.facturacionsoe.services;

import java.util.List;

public interface CrudService<TRequest, TResponse, TException extends Exception> {
    List<TResponse> findAll();

    TResponse findById(int id) throws TException;

    TResponse update(int id, TRequest request) throws TException;

    TResponse store(TRequest request) throws TException;

    void delete(int id) throws TException;
}