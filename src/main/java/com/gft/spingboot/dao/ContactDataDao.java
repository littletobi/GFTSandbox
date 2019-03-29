package com.gft.spingboot.dao;

import com.gft.spingboot.entity.ContactData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDataDao extends JpaRepository<ContactData, Integer> {
}
