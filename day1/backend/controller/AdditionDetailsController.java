package com.example.billingbackend.controller;

import com.example.billingbackend.entity.AdditionalDetailsEntity;
import com.example.billingbackend.entity.EmployeeEntity;
import com.example.billingbackend.service.AdditionalDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class AdditionDetailsController {

    AdditionalDetailsService AdditionalDetailsService;

    @GetMapping("api/getDetails")
    public ResponseEntity<List<AdditionalDetailsEntity>> getDeatails(){
        List<AdditionalDetailsEntity> details = AdditionalDetailsService.getDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    }


    @PostMapping("api/createDetails")
    public ResponseEntity<AdditionalDetailsEntity> createDetails(@RequestBody AdditionalDetailsEntity request){
        AdditionalDetailsEntity res = AdditionalDetailsService.addDetails(request);
        return new ResponseEntity<> (res,HttpStatus.CREATED);
    }
}
