package in.rajujangra.resume_enhancer.controller;

import in.rajujangra.resume_enhancer.service.FileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {
    private final FileService service;

    public FileController(FileService service) {
        this.service = service;
    }

    @PostMapping
    public void uploadFile(final MultipartFile file) throws IOException {
        service.uploadFile(file);
        System.out.println("File uploaded successfully: " + file.getOriginalFilename());
    }
}
