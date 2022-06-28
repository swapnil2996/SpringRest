package com.springrest.springrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {

	@GetMapping("/std")
	public student stdd() {
		return new student("swapnil",01);
	}
	@GetMapping("/stdlist")
	 public List<student> getstd(){
		 List<student> students = new ArrayList<>(); 
		 students.add(new student("swapnil",01));
		 students.add(new student("swapnil1",02));
		 students.add(new student("swapnil2",03));
		 students.add(new student("swapnil3",04));
		 students.add(new student("swapnil4",05));
		 return students;
	 }
	 
	 @GetMapping("/stdlist/{firstname}/{rollno}")
	 public student getpathvariable(@PathVariable("firstname") String firstname, @PathVariable("rollno") Integer rollno) {
		 return new student(firstname,rollno);
	 }
	 @GetMapping("/stdlist/Query")
	 public student getQueryParam(@RequestParam(name="firstname")String firstname, 
			 @RequestParam(name="rollno") Integer rollno) {
		 return new student(firstname,rollno);
	 }
	 
	 
	
}
