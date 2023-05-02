package com.example.servletjsp.mybatis;

import com.example.servletjsp.mybatis.dto.Festival;
import com.example.servletjsp.mybatis.mapper.FestivalMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTemplate {

    private static SqlSession sqlSession;

    static {
        try {
            sqlSession = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream("mybatis/MyBatisConfig.xml"))
                    .openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 1. 조회만 해보기
     */
    public List<Map<String, Object>> findFestivalList() {
        return sqlSession.selectList("com.example.servletjsp.mybatis.mapper.FestivalMapper.findFestivalList");
    }

    /**
     * 2. 파라미터를 바인딩 해보기
     */
    public List<Map<String,Object>> findFestivalListBy(
            List<Integer> contentStatusList,
            List<Integer> areaCodeList,
            LocalDate createDateFrom) {
        Map<String,Object > parametest = new HashMap<>();
        parametest.put("contentStatusList", contentStatusList);
        parametest.put("areaCodeList", areaCodeList);
        parametest.put("createDateFrom", createDateFrom);
        return sqlSession.selectList("com.example.servletjsp.mybatis.mapper.FestivalMapper.findFestivalListBy",parametest);
    }

    /**
     * 3. 반환타입을 DTO로 받기
     */
    public List<Festival> findFestivalDtoList() {
        return sqlSession.selectList("com.example.servletjsp.mybatis.mapper.FestivalMapper.findFestivalDtoList");
    }

    /**
     * 4. 반환타입을 ResultMap을 활용한 Dto로 받기
     */
   public List<Festival> findFestivalMapDtoList() {
        return sqlSession.selectList("com.example.servletjsp.mybatis.mapper.FestivalMapper.findFestivalMapDtoList");
    }

    /**
     *  5. 반환타입을 ResultMap을 활용한 연관관계 맵핑된 dto로 받기
     */
    public List<Festival> findFestivalRelationList() {
        return sqlSession.selectList("com.example.servletjsp.mybatis.mapper.FestivalMapper.findFestivalRelationList");
    }

    /**
     * 6. 인터페이스를 활용한 mapper로 조회하기
     */
    public List<Festival> findFestivalInterfaceList(List<Integer> areaCodeList) {
        FestivalMapper festivalMapper = sqlSession.getMapper(FestivalMapper.class);
        return festivalMapper.findFestivalInterfaceList(areaCodeList);
    }

}
