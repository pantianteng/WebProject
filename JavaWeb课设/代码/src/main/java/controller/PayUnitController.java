package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.PayUnitService;
import vo.Payunit;

import java.util.ArrayList;

@Controller
public class PayUnitController {
    @Autowired
    private PayUnitService payUnitService;

    @RequestMapping(value = "/getAllPayUnit.do",method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Payunit> getAllPayUnit(){
        System.out.println("PayUnit");
        return payUnitService.getAllUnit();
    }
}
