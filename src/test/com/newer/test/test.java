package com.newer.test;

import com.newer.domain.Checkins;
import com.newer.mapper.CheckinsMapper;
import com.newer.mapper.RoomsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {

@Test
    public  void  testFind(){
        SqlSession sqlSession =SqlSessionUtil.getSqlSession();
        RoomsMapper roomsMapper =((SqlSession) sqlSession).getMapper(RoomsMapper.class);

        roomsMapper.findTypes().forEach(roomstype->System.out.println(roomstype));

    }
    @Test
    public  void  testFind1(){
        SqlSession sqlSession =SqlSessionUtil.getSqlSession();
        RoomsMapper roomsMapper =((SqlSession) sqlSession).getMapper(RoomsMapper.class);

       List<Integer>list= roomsMapper.findRoomid("双人间");
        System.out.println(list);

    }

    @Test
    public  void  testFind2(){
        SqlSession sqlSession =SqlSessionUtil.getSqlSession();
        CheckinsMapper checkinsMapper=sqlSession.getMapper(CheckinsMapper.class);

        List<Checkins>list= checkinsMapper.selectCheckins();
        System.out.println(list);

    }
    @Test
    public  void  testFind3(){
        System.out.println("ssss");

    }

}
