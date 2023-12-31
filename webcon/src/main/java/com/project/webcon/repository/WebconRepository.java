package com.project.webcon.repository;

import com.project.webcon.entity.Board;
import com.project.webcon.entity.Webcon;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebconRepository extends JpaRepository<Webcon, String> {
    List<Webcon> findAllByOrderByTitleAsc();

    List<Webcon> findByTitleContaining(String searchKeyword);
}
