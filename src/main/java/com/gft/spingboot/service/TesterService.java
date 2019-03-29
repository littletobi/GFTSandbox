package com.gft.spingboot.service;

import com.gft.spingboot.dao.ContactDataDao;
import com.gft.spingboot.dao.TesterDao;
import com.gft.spingboot.entity.ContactData;
import com.gft.spingboot.entity.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesterService {

    @Autowired
    TesterDao testerDao;

    @Autowired
    ContactDataDao contactDataDao;

    public List<Tester> getAllTesters() {
        return testerDao.findAll();
    }

    public Tester addTester(Tester tester) {
        return testerDao.save(tester);
    }

//    public List<ContactData> getAllContactData(int id) {
//        return testerDao.getAllContactData(id);
//    }



//    public void delete(int id) {
//        List<ContactData> contactDataList = getAllContactData(id);
//        contactDataList.stream((forEach(user);
//    }
}