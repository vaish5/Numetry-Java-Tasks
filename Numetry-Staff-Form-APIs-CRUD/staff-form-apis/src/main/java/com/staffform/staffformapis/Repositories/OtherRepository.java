package com.staffform.staffformapis.Repositories;

import com.staffform.staffformapis.Models.Other;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherRepository extends JpaRepository<Other, Long> {
}
