/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.serviceImpl;

import com.example.demo.entity.Autor;
import com.example.demo.repository.AutorMyBatisRepository;
import com.example.demo.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImpl implements AutorService{
    
    @Autowired
    private AutorMyBatisRepository autorMyBatisRepository;
    
    @Override
    public List<Autor> findAll() {
        return autorMyBatisRepository.findAll();
    }

    @Override
    public Autor findById(long id) {
        return autorMyBatisRepository.findById(id);
    }

    @Override
    public int deleteById(long id) {
        return autorMyBatisRepository.delete(id);
    }

    @Override
    public int insert(Autor autor) {
        return autorMyBatisRepository.insert(autor);
    }

    @Override
    public int update(Autor autor) {
        return autorMyBatisRepository.update(autor);
    }
    
}
