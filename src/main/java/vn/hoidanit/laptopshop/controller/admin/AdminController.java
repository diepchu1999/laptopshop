package vn.hoidanit.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping({ "/admin", "/" })
    public String getHomePage() {
        return "admin/dashboard/show";
    }
}
