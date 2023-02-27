package com.example.servletjsp.mybatis;

import com.example.servletjsp.mybatis.dto.Festival;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MyBatisTemplateTests {

    public static void main(String[] args) {
        step6();
    }

    public static void step1() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();

        List<Map<String, Object>> findFestivalList = myBatisTemplate.findFestivalList();
        System.out.println("findFestivalList --> " + findFestivalList);

    }

    public static void step2() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();


        List<Integer> areaCodeList = Arrays.asList(2);
        List<Integer> contentStatusList = Arrays.asList(1, 2);
        LocalDate createDateFrom = LocalDate.of(2022, 1, 1);

        List<Map<String, Object>> findFestivalList = myBatisTemplate.findFestivalList(contentStatusList, areaCodeList, createDateFrom);

        System.out.println("findFestivalList --> " + findFestivalList);
    }


    public static void step3() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();

        List<Festival> findFestivalDtoList = myBatisTemplate.findFestivalDtoList();
        System.out.println("findFestivalDtoList --> " + findFestivalDtoList);

    }

    public static void step4() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();

        List<Festival> findFestivalMapDtoList = myBatisTemplate.findFestivalMapDtoList();
        System.out.println("findFestivalMapDtoList --> " + findFestivalMapDtoList);
    }

    public static void step5() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();
        List<Festival> festivalsList = myBatisTemplate.findFestivalRelationList();
        System.out.println("festivalsList --> " + festivalsList);
    }

    public static void step6() {
        MyBatisTemplate myBatisTemplate = new MyBatisTemplate();

        List<Festival> findFestivalRelationList = myBatisTemplate
                .findFestivalInterfaceList(Arrays.asList(1,2));
        System.out.println("fetivalList --> " + findFestivalRelationList);
    }

}


