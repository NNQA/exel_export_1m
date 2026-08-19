package com.example.exportexcel.Controller;


import com.example.exportexcel.service.ExportService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/export")
public class ExportController {

    final ExportService exportService;

    public ExportController(ExportService e) {
        this.exportService = e;
    }

    @GetMapping("/file-user")
    public void exportData(HttpServletResponse response) throws IOException {
        exportService.exportDataService(response);
    }

}
