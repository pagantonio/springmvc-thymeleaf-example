package br.com.incubadoras2it.springmvctutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by PEDRO on 07/05/2018.
 */
@Controller
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute Student student, Model model) {
        studentRepository.save(student);
        return studentsPage(model);
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String studentsPage(Model model) {
        List<Student> students = studentRepository.findAll();

        model.addAttribute("student", new Student());
        model.addAttribute("students", students);
        return "students";
    }
}
