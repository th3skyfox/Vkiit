package com.vishal.vkiit.repository;

import com.vishal.vkiit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
