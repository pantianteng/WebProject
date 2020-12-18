package service.service.impl;

import dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsService;
import vo.Goods;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao dao;

    public int insertGoods(Goods goods) {
        return dao.insert(goods);
    }
}
