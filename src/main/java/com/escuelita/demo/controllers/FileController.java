package com.escuelita.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.escuelita.demo.services.interfaces.IFileService;

@RestController
@RequestMapping("file")
public class FileController {
    @Autowired
    private IFileService service;

    @PostMapping
    public String upload(@RequestParam MultipartFile file) {
        return service.upload(file);
    }
}
