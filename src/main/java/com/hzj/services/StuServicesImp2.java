package com.hzj.services;

import com.hzj.dao.StuDao;

public class StuServicesImp2 implements  StuServices {


    StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    public void findByAll() {
        System.out.println("StuServicesImp2>>>>>>>>>"+stuDao);
    }
}
