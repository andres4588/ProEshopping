/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andres
 */
public class CategoriaTest {
    
 

    /**
     * Test of setId method, of class Categoria.
     */
    @org.junit.Test (expected = IllegalArgumentException .class)
    public void testSetId() {
     
        Integer id = 0;
  
        Categoria instance = new Categoria();
        instance.setId(id);
        

      
    }
    
     @org.junit.Test (expected = NullPointerException .class)
    public void IdNull() {
     
        Object id = null;
       
        
        
        Categoria instance = new Categoria();
        instance.setId((Integer) id);
        
        

      
    }

    /**
     * Test of getNombre method, of class Categoria.
     */
    @org.junit.Test
    public void testGetNombre() {

         String nombre="sewr";
         String descripcion="";
         Integer id=5;
          Categoria instance = new Categoria();
          instance.setNombre(nombre);
          instance.setDescripcion(descripcion);
          instance.setId(id);
          
     
          assertTrue("",instance.getNombre()!=null &&
                  instance.getDescripcion()!=null &&
                  instance.getId()!=null );
  
          
          
        
        
    }

    /**
     * Test of setNombre method, of class Categoria.
     */
    @org.junit.Test (expected = IllegalArgumentException .class)
    public void testSetNombre() {
        
    
        String nom = "";
       
     
        Categoria instance = new Categoria();
        instance.setNombre(nom);

       
    }
    
    
     @org.junit.Test (expected = IllegalArgumentException .class)
    public void NombreTresCaracteres() {
        
    
        String nom = "11";
       
     
        Categoria instance = new Categoria();
        instance.setNombre(nom);

       
    }
    
    
     @org.junit.Test (expected = NullPointerException .class)
    public void NombreNull() {
      Object nombre = null;
    
        
  
        Categoria instance = new Categoria();
        instance.setNombre((String) nombre);

       
    }    
}
