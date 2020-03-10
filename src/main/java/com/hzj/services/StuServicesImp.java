package com.hzj.services;

import com.hzj.dao.StuDao;

public class StuServicesImp  implements StuServices {



    StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    public void findByAll() {

        System.out.println("StuServicesImp>>>>>>>>>"+stuDao);

    }
}
