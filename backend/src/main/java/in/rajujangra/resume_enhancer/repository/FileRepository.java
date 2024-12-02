package in.rajujangra.resume_enhancer.repository;

import in.rajujangra.resume_enhancer.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
