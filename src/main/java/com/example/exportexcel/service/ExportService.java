package com.example.exportexcel.service;


import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.example.exportexcel.Domain.User;
import com.example.exportexcel.mapper.UserMapper;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class ExportService {


    @Autowired
    UserMapper userMapper;

    public void exportDataService(HttpServletResponse response) throws IOException {
        Long startTime = System.currentTimeMillis();

        List<User> userList = userMapper.selectList(null);
        log.info("DONE -> userlist {} ms", System.currentTimeMillis() - startTime);

        String fileNameExport = "data-user-" + System.currentTimeMillis() + ".xlsx";

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;filename*=utf-8''" + fileNameExport);

        ExcelWriterBuilder excelWriterBuilder = EasyExcelFactory.write(response.getOutputStream(), User.class);
        excelWriterBuilder.registerWriteHandler(new WriteHandler() {}).excelType(ExcelTypeEnum.XLSX).sheet().doWrite(userList);

        log.info("DONE -> EXPORT {} ms ", System.currentTimeMillis() - startTime);
    }
}
