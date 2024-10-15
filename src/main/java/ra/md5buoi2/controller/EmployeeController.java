package ra.md5buoi2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ra.md5buoi2.model.Employee;
import ra.md5buoi2.service.department.DepartmentService;
import ra.md5buoi2.service.employee.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", employeeService.findAll());
        return "employees/listEmployee"; // The view name is 'employee/create'
    }


    @GetMapping("/add")
    public String addEmployee(Model model, @ModelAttribute Employee employee) {
        model.addAttribute("departments", departmentService.findAll());
        model.addAttribute("employee", new Employee());
        return "employees/addEmployee"; // The view name is 'employee/create'
    }

    @PostMapping("/add")
    public String doAdd(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteById(id);
        return "redirect:/employee";
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.findById(id).orElse(null));
        model.addAttribute("departments", departmentService.findAll());
        return "employees/editEmployee";
    }

    @PostMapping("/update")
    public String doEdit(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }
}
