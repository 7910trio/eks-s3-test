package com.example.app_with_argocd.controller;

import com.example.app_with_argocd.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RestController
public class S3FileController {

    private final S3Service s3Service;

    @PostMapping(value = "/api/s3/files")
    public void uploadS3File(@RequestPart(value = "file", required = false) MultipartFile file) {
        try {
            s3Service.uploadS3File(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/api/s3/files/{fileNo}")
    public ResponseEntity<Resource> downloadS3File(@PathVariable("fileNo") long fileNo) throws Exception {
        return s3Service.downloadS3File(fileNo);
    }
}


