package service;

import org.springframework.stereotype.Service;
import vo.Firstdirectory;
import vo.Seconddirectory;


import java.util.ArrayList;


@Service
public interface DirectoryService {

    ArrayList<Firstdirectory> getAllFirstDirectory();

    ArrayList<Seconddirectory> getAllSecondDirectory(int f_id);

}
