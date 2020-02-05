package com.newer.service;

import com.newer.mapper.RoomsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoomsService {
   private  RoomsMapper roomsMapper;
    private SqlSession sqlSession;

    public void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        roomsMapper=sqlSession.getMapper(RoomsMapper.class);
    }

    public List<String> findTypes(){
        init();
        List<String> list=roomsMapper.findTypes();
        SqlSessionUtil.close(sqlSession);
        return list;
    }

    public List<Integer> findRoomid(String roomtype){
        init();
        List<Integer> list=roomsMapper.findRoomid(roomtype);
        SqlSessionUtil.close(sqlSession);
        return list;
    }

}
