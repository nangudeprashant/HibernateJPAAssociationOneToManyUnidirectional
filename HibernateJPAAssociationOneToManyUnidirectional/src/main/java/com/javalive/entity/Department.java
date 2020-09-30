package com.javalive.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author javalive.com
 */
@Entity
@Table(name = "DEPARTMENT1")
public class Department {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "DPT_ID")
   private long id;

   @Column(name = "NAME", nullable = false, unique = true)
   private String name;

   @OneToMany(cascade = CascadeType.ALL)//Comment these two line and uncomment lines in Employee.java to activate 
   //@JoinColumn(name="DEPT_ID")
   private List<Employee> employees = new ArrayList<Employee>();// unidirectional ManyToOne association

   public Department() {
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Employee> getEmployees() {
      return employees;
   }

   public void setEmployees(List<Employee> employees) {
      this.employees = employees;
   }
}
