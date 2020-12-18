package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsLocationService;
import vo.Goodslocation;

import java.util.ArrayList;

@Controller
public class GoodsLocationController {

    @Autowired
    private GoodsLocationService goodsLocationService;

    @RequestMapping(value = "/getLocation.do",method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Goodslocation> getAllLocation(){

        System.out.println("Locations");

        return goodsLocationService.getLocationList();
    }
}
