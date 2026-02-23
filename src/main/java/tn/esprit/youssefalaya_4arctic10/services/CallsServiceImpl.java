package tn.esprit.youssefalaya_4arctic10.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.youssefalaya_4arctic10.entities.Calls;
import tn.esprit.youssefalaya_4arctic10.repositories.IAgentsRepository;
import tn.esprit.youssefalaya_4arctic10.repositories.ICallsRepository;

import java.util.List;
    @RequiredArgsConstructor
    @Component
    public class CallsServiceImpl implements ICallsServices{

    private ICallsRepository callsRepository;
    private IAgentsRepository agentsRepository;


    @Override
    public Calls addCalls(Calls calls) {
        return callsRepository.save(calls);
    }

    @Override
    public Calls updateCalls(Calls calls) {
        return callsRepository.save(calls);
    }

    @Override
    public void deleteCallsById(Long id) {
        callsRepository.deleteById(id);

    }

    @Override
    public Calls getByID(Long id) {
        return callsRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Calls with id " + id + " not found"));
    }

    @Override
    public List<Calls> getAllCalls() {
        return callsRepository.findAll();
    }
}
