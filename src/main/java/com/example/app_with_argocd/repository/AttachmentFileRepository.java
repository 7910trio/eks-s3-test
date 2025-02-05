package com.example.app_with_argocd.repository;

import com.example.app_with_argocd.entity.AttachmentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttachmentFileRepository extends JpaRepository<AttachmentFile, Long>{

}
