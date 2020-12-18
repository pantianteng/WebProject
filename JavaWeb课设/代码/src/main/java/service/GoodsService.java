package service;

import org.springframework.stereotype.Service;
import vo.Goods;

@Service
public interface GoodsService {
    int insertGoods(Goods goods);
}
