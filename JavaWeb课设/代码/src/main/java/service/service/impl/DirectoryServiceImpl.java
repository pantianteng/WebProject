package service.service.impl;

import dao.FirstdirectoryDao;
import dao.SeconddirectoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DirectoryService;
import vo.Firstdirectory;
import vo.Seconddirectory;

import java.util.ArrayList;

@Service
public class DirectoryServiceImpl implements DirectoryService {

    @Autowired
    private FirstdirectoryDao firstDao;
    @Autowired
    private SeconddirectoryDao secondDao;

    public ArrayList<Firstdirectory> getAllFirstDirectory() {
        return firstDao.getAllFirstDirectory();
    }

    public ArrayList<Seconddirectory> getAllSecondDirectory(int f_id) {
        return secondDao.getAllSecondDirectory(f_id);
    }
}
