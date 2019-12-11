package com.crud.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model){
		List<Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showAddStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student",student);
		
		return "add_student";
	}
	
	@RequestMapping("/view/{roll}")
	public String viewStudent(@PathVariable(name="roll") Long roll, Model model) {
		Student student=studentService.getStudent(roll);
		model.addAttribute("student",student);
		return "view_student";
	}
	
	@RequestMapping("/edit/{roll}")
	public String getStudent(@PathVariable(name="roll") Long roll, Model model) {
		Student student=studentService.getStudent(roll);
		model.addAttribute("student",student);
		return "edit_student";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/save")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{roll}")
	public String deleteStudent(@PathVariable(name="roll") Long roll) {
		studentService.deleteStudent(roll);
		
		return "redirect:/";
	}

}
