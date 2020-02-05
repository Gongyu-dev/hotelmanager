package com.newer.service;

import com.newer.domain.Checkins;
import com.newer.mapper.CheckinsMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CheckinsService {
    private SqlSession sqlSession;

    private CheckinsMapper checkinsMapper;

    private void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        checkinsMapper=sqlSession.getMapper(CheckinsMapper.class);

    }

    /**
     *添加入住信息
     * @param checkins
     * @return
     */
    public int addCheckins(Checkins checkins){
        init();
        int rows=checkinsMapper.addCheckins(checkins);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        return rows;
    }

    public List<Checkins> selectCheckins(){
        init();
        List<Checkins> list=checkinsMapper.selectCheckins();
        SqlSessionUtil.close(sqlSession);
        return list;

    }
}
