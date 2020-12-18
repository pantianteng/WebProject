package dao;

import vo.Firstdirectory;

import java.util.ArrayList;

public interface FirstdirectoryDao {

    ArrayList<Firstdirectory> getAllFirstDirectory();

    int deleteByPrimaryKey(Integer id);

    int insert(Firstdirectory record);

    int insertSelective(Firstdirectory record);

    Firstdirectory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Firstdirectory record);

    int updateByPrimaryKey(Firstdirectory record);
}