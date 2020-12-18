package service.service.impl;

import dao.GoodslocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsLocationService;
import vo.Goodslocation;

import java.util.ArrayList;

@Service
public class GoodsLocationServiceImpl implements GoodsLocationService {

    @Autowired
    private GoodslocationDao dao;


    public ArrayList<Goodslocation> getLocationList() {
        return dao.selectAllLocation();
    }
}
