package com.gft.spingboot.controller;

import com.gft.spingboot.entity.Tester;
import com.gft.spingboot.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tester")
public class TesterController {
    @Autowired
    TesterService testerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Tester> getAllTesters() {
        return testerService.getAllTesters();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Tester addNewTester(@RequestBody Tester tester) {
        return this.testerService.addTester(tester);
    }
}
