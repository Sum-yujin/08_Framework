package edu.kh.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import edu.kh.test.dto.Student;


@Controller
public class StudentController {

	@PostMapping("/student/select")
	public String selectStudent(Model model, @ModelAttribute Student student) {
		model.addAttribute("stdName", student.getStdName());
		model.addAttribute("stdAge", student.getStdAge());
		model.addAttribute("stdAddress", student.getStdAddress());
		return "/student/select";
	}
	
}