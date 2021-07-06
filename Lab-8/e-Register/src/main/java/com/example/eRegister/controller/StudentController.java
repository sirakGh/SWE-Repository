package com.example.eRegister.controller;

import com.example.eRegister.service.IStudentService;
import com.example.eRegister.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping(value="/students")
    public ModelAndView getStudents(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", studentService.getAllStudents());
        modelAndView.setViewName("customer/students");
        return modelAndView;
    }

    @GetMapping(value="/student/new")
    public String getStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "customer/studentForm";
    }

    @PostMapping(value="/student/save")
    public String saveStudent(@RequestBody @ModelAttribute("student") Student newStudent, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("error",result.getAllErrors());
           result.getAllErrors().stream().forEach(System.out::println);
            return "customer/studentForm";
        }
        System.out.println("not suppose to be here");
        studentService.save(newStudent);
        return "redirect:/students";
    }

    @GetMapping(value="/student/delete/{studentId}")
    public String deleteStudent(@PathVariable("studentId") Long studentId, Model model){
        Student student=studentService.findStudentById(studentId);
        if(student !=null){
            studentService.deleteStudent(student);
            return "redirect:/students";
        }
        return "customer/students";
    }

    @GetMapping(value="/student/edit/{studentId}")
    public String editStudent(@PathVariable("studentId") Long studentId, Model model){
        Student student=studentService.findStudentById(studentId);
        if(student !=null){
            model.addAttribute("student",student);
            return "student/studentForm";
        }
        return "student/students";
    }


}
