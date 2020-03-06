package bo.edu.uagrm.soe.facturacionsoe.adapters.controllers.services;

import java.util.List;

public interface CrudService<TRequest, TResponse, TException extends Exception> {
    List<TResponse> findAll();

    TResponse findById(Long id) throws TException;

    TResponse update(Long id, TRequest request) throws TException;

    TResponse store(TRequest request) throws TException;

    void delete(Long id) throws TException;
}