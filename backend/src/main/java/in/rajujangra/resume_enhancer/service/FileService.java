package in.rajujangra.resume_enhancer.service;

import in.rajujangra.resume_enhancer.entity.File;
import in.rajujangra.resume_enhancer.repository.FileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileService {
    private final FileRepository repository;

    public FileService(FileRepository repository) {
        this.repository = repository;
    }

    public void uploadFile(final MultipartFile file) throws IOException {
        File entity = new File();
        entity.setName(file.getOriginalFilename());
        entity.setType(file.getContentType());
        entity.setData(file.getBytes());
        repository.save(entity);
    }
}
