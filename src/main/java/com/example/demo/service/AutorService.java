/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.entity.Autor;
import java.util.List;


public interface AutorService {
    
    public List<Autor> findAll();
    public Autor findById(long id);
    public int deleteById(long id);
    public int insert(Autor autor);
    public int update(Autor autor);
}
