import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.GoodsLocationService;
import service.GoodsService;
import service.PayUnitService;
import vo.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    GoodsLocationService goodsLocationService;
    @Autowired
    PayUnitService service;
    @Autowired
    GoodsService goodsService;

    @Test
    public void test01(){
        System.out.println(goodsService.insertGoods(new Goods("123","123","123",2,2,2,2)));
    }
}
