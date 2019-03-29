package com.gft.spingboot.controller;

import com.gft.spingboot.entity.ContactData;
import com.gft.spingboot.service.ContactDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact-data")
public class ContactDataController {

    @Autowired
    ContactDataService contactDataService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<ContactData> getContactData() {
        return contactDataService.getAllContacts();
    }

//    @RequestMapping(value = "/add/{id}", method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody()
//    public ContactData addNewContact(@RequestBody ContactData contactData, @PathVariable(value = "id") int id) {
//        return this.contactDataService.addNewContactData(contactData, id);
//    }
}