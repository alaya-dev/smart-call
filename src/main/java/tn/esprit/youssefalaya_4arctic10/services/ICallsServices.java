package tn.esprit.youssefalaya_4arctic10.services;

import tn.esprit.youssefalaya_4arctic10.entities.Calls;

import java.util.List;

public interface ICallsServices {

    Calls addCalls(Calls calls);
    Calls updateCalls(Calls calls);
    void deleteCallsById(Long id);
    Calls getByID(Long id);
    List<Calls> getAllCalls();








}
