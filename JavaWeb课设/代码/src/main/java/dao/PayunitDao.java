package dao;

import vo.Payunit;

import java.util.ArrayList;

public interface PayunitDao {

    ArrayList<Payunit> getAllUnit();

    int deleteByPrimaryKey(Integer id);

    int insert(Payunit record);

    int insertSelective(Payunit record);

    Payunit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payunit record);

    int updateByPrimaryKey(Payunit record);
}