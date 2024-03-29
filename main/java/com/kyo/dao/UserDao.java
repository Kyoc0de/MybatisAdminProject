package com.kyo.dao;

import com.kyo.entity.Users;
import com.kyo.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;


import java.util.List;

public class UserDao {

    private SqlSession sqlSession ;
    private List<Users> list;
    private Users user;

    private SqlSession getSqlSession(){
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
    }
    public List<Users> findAll(){
        try {
            list = getSqlSession().selectList("findUsers");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return list;
    }

    public Users findById(Integer id){
        try {
            user = getSqlSession().selectOne("findUsers",new Users(id));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return user;
    }

    public Users addUser(Users user){
        try {
           getSqlSession().insert("addUser",user);
           sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

        return user;
    }
}
