package com.learning.springboot.springbootpostgresql.repository;

import org.springframework.stereotype.Repository;

import com.learning.springboot.springbootpostgresql.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
