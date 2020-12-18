package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DirectoryService;
import vo.Firstdirectory;
import vo.Seconddirectory;

import java.util.ArrayList;

@Controller
public class DirectoryController {

    @Autowired
    private DirectoryService directoryService;


    @RequestMapping(value = "/getFirstDirectory.do",method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Firstdirectory> getFirst(){
       return directoryService.getAllFirstDirectory();
    }

    @RequestMapping(value = "/getSecondDirectory.do",method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<Seconddirectory> getSecond(int f_id){
        return directoryService.getAllSecondDirectory(f_id);
    }

}
