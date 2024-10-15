package ra.md5buoi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.md5buoi2.model.Department;
import ra.md5buoi2.service.department.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping
    public String showDepartment(Model model) {
        model.addAttribute("departments", departmentService.findAll());
        return "department/listDepartment";
    }


    @RequestMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        departmentService.deleteById(id);
        return "redirect:/department";
    }

    @GetMapping("/add")
    public String formAdd() {
        return "department/addDepartment";
    }

    @PostMapping("/add")
    public String doAdd(Model model, @ModelAttribute Department department) {
        departmentService.save(department);
        return "redirect:/department";
    }

    @GetMapping("/edit/{id}")
    public String formEdit(@PathVariable Long id, Model model) {
        model.addAttribute("department", departmentService.findById(id).orElse(null));
        return "department/editDepartment";

    }
    @PostMapping("/update")
    public String doUpdate(Model model, @ModelAttribute Department department) {
        departmentService.save(department);
        return "redirect:/department";
    }
}
