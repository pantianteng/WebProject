package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsService;
import vo.Goods;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/insertGoods.do",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertGoods(String goodsid,
                                          String goodscode,
                                          String goodschrname,
                                          int goodslocation,
                                          int payunit,
                                          int firstdirectory,
                                          int seconddirectory){
        Map<String,Object> map = new HashMap<String, Object>();
        int flag = goodsService.insertGoods(
                new Goods(goodsid,
                        goodscode,
                        goodschrname,
                        goodslocation,
                        payunit,
                        firstdirectory,
                        seconddirectory));
        if(flag == 1){
            map.put("code",0);
            map.put("msg","添加成功");
        }else{
            map.put("code",-1);
            map.put("msg","添加失败");
        }
        return map;
    }
}
