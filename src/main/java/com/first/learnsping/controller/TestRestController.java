package com.first.learnsping.controller;

import com.first.learnsping.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class TestRestController {

    @GetMapping("/hi")
    public String getHi(){
        return "Hi";
    }

    @PostMapping("/showEmployee")
    public Employee getEmployeeDetails(@RequestBody Employee employ){
        //This is to create new employee object
        Employee employee = new Employee();
        employee.setId("employee id is :"+employ.getId() +" new Id");
        employee.setName("employee name is :"+employ.getName() + "  new Name");
        return employee;



    }
    @GetMapping("/villageName")
    public String getVillageName(){
        return "chavatagunta";
    }
    @PostMapping("/villageDetails")
    public VillageInfo getVillageInfo(@RequestBody VillageInfo village){
        VillageInfo villageInfo = new VillageInfo();
        villageInfo.setVillageName("village name is :"+village.getVillageName());
        villageInfo.setStreetName("Street name is:"+village.getStreetName());
        return villageInfo;

        }
    @GetMapping("/myName")
    public String getMyName()
    {
        return "Ravi";
    }


}
