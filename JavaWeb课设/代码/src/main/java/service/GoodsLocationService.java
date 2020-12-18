package service;

import org.springframework.stereotype.Service;
import vo.Goodslocation;

import java.util.ArrayList;

@Service
public interface GoodsLocationService {
    ArrayList<Goodslocation> getLocationList();
}
