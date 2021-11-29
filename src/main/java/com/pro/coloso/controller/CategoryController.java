package com.pro.coloso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value ="/category")
public class CategoryController {


	@GetMapping(value = "/event-list")
	public String eventList() {
		return "/cateory/event-list";
	}
	
	@GetMapping(value ="/lifestyle")
	public String lifestyle() {
		return "/cateory/lifestyle";
	}
	
	@GetMapping(value ="/game")
	public String game() {
		return "/cateory/game";
	}
	
	@GetMapping(value ="/graphicdesign")
	public String graphicDesign() {
		return "/cateory/graphicDesign";
	}
	@GetMapping(value ="/webtoon")
	public String webtoon() {
		return "/cateory/webtoon";
	}
	
	@GetMapping(value = "/category_creative")
	public String category_creative() {
		return "/cateory/category_creative";
	}
}
