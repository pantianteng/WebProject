package service;

import org.springframework.stereotype.Service;
import vo.Payunit;

import java.util.ArrayList;

@Service
public interface PayUnitService {
    ArrayList<Payunit> getAllUnit();
}
