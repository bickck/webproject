package com.pro.coloso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value ="/roadmap")
public class RoadMapController {
	
	@GetMapping(value = "/roadmap_hair")
	public String hair() {
		return null;
	}
	@GetMapping(value = "/roadmap_illust")
	public String illust() {
		return null;
	}
	@GetMapping(value = "/roadmap_mediadesign")
	public String mediadesign() {
		return null;
	}
	
	@GetMapping(value = "/roadmap_baking")
	public String baking() {
		return null;
	}
	

}
