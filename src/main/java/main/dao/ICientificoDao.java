package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Cientifico;

public interface ICientificoDao extends JpaRepository<Cientifico, String> {

}