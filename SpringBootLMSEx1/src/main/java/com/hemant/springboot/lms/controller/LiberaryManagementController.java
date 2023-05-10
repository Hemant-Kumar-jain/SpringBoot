package com.hemant.springboot.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.springboot.lms.model.LiberaryManagement;
import com.hemant.springboot.lms.repository.LiberaryManagementRepository;

@RestController
@RequestMapping("/book")
public class LiberaryManagementController {
	@Autowired
	LiberaryManagementRepository bmr;
	@PostMapping("/save")
	public void saveBook(@RequestBody LiberaryManagement bm) {
		bmr.save(bm);
	}
	@RequestMapping("/details")
	public List<LiberaryManagement> getBooks(){
		return bmr.findAll();
	}
	@RequestMapping("/update/{id}/{bookName}")
	public void UpdateBook(@PathVariable("id")Long id,@PathVariable("bookName")String bname) {
		LiberaryManagement bmt=bmr.findById(id).get();
		bmt.setBookName(bname);
		bmr.save(bmt);
	}
	@RequestMapping("/details/{id}")
	public LiberaryManagement getById(@PathVariable("id")Long id) {
		return bmr.findById(id).get();
	}
	@RequestMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id")Long id) {
		bmr.deleteById(id);
	}
}
