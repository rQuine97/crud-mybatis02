/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Autor;
import com.example.demo.service.AutorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rquin
 */
@RestController
@RequestMapping("/autor")
public class AutorRestController {
    
    @Autowired
    private AutorService autorService;
    
    @GetMapping("/all")
    public List<Autor> getAutor() {
        return autorService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutor(@PathVariable int id) {
        Autor autor = autorService.findById(id);
        return ResponseEntity.ok(autor);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable int id) {        
        autorService.deleteById(id);
    }
    @PostMapping("/add")
    public int addAutor(@RequestBody Autor autor) {  
        return autorService.insert(autor);
    }
    @PutMapping("/edit")
    public int editAutor(@RequestBody Autor autor) {  
        Autor aut = new Autor(autor.getIdautor(),autor.getNombre(),autor.getApellido(), autor.getCorreo());
        return autorService.update(autor);
    }
}
