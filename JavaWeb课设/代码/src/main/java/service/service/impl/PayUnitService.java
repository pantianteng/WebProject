package service.service.impl;

import dao.PayunitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.Payunit;

import java.util.ArrayList;

@Service
public class PayUnitService implements service.PayUnitService {

    @Autowired
    private PayunitDao dao;


    public ArrayList<Payunit> getAllUnit() {
        return dao.getAllUnit();
    }
}
