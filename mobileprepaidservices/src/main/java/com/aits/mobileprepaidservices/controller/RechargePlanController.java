package com.aits.mobileprepaidservices.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.mobileprepaidservices.entity.RechargePlan;
import com.aits.mobileprepaidservices.service.RechargePlanService;

@RestController
@RequestMapping("/plans")
public class RechargePlanController {
	private final RechargePlanService service;
	public RechargePlanController(RechargePlanService service) {
		this.service=service;
	}
		@GetMapping
	    public List<RechargePlan> getAllPlans() {
	        return service.getAllPlans();
	    }
	 
	    @GetMapping("/{category}")
	    public List<RechargePlan> getByCategory(@PathVariable String category) {
	        return service.getPlansByCategory(category);
	    }
	    
	    @PostMapping
	    public RechargePlan insert(@RequestBody RechargePlan rechargeplan) {
	    	return service.insert(rechargeplan);	
	    }
	}