package dao;

import org.apache.ibatis.annotations.Param;
import vo.Seconddirectory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface SeconddirectoryDao {

    ArrayList<Seconddirectory> getAllSecondDirectory(@Param("f_id") int f_id);

    int deleteByPrimaryKey(Integer id);

    int insert(Seconddirectory record);

    int insertSelective(Seconddirectory record);

    Seconddirectory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Seconddirectory record);

    int updateByPrimaryKey(Seconddirectory record);
}