package com.gft.spingboot.service;

import com.gft.spingboot.dao.ContactDataDao;
import com.gft.spingboot.dao.TesterDao;
import com.gft.spingboot.entity.ContactData;
import com.gft.spingboot.entity.Tester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDataService {

    @Autowired
    ContactDataDao contactDataDao;

    @Autowired
    TesterDao testerDao;

    public List<ContactData> getAllContacts() {
        return contactDataDao.findAll();
    }

//    public ContactData addNewContactData(ContactData contactData, int userId) {
//        Tester tester = testerDao.findTesterById(userId);
//        contactData.setTester(tester);
//        return contactDataDao.save(contactData);
//    }

    public void delete(int id) {
        contactDataDao.deleteById(id);
    }
}