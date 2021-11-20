package com.torryharris.drive.repository;


import com.torryharris.drive.model.Train;
import org.springframework.data.repository.CrudRepository;

public interface MyRepo extends CrudRepository<Train,Integer> {
}
