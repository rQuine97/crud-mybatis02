/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Autor;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author rquin
 */
@Mapper
public interface AutorMyBatisRepository {
    @Insert("INSERT INTO autor(nombre,apellido,correo) VALUES(#{nombre},#{apellido},#{correo})")
    public int insert(Autor autor);
    
    @Insert("UPDATE autor SET nombre=#{nombre}, apellido=#{apellido}, correo=#{correo} WHERE idautor=#{idautor}")
    public int update(Autor autor);
    
    @Delete("DELETE FROM autor WHERE idautor=#{id}")
    public int delete(Autor autor);
    
    @Select("SELECT * FROM autor WHERE idautor=#{id}")
    public Autor findById(Autor autor);
    
    @Select("SELECT * FROM autor")
    public List<Autor> findAll();

    public int delete(long id);

    public Autor findById(long id);
}
