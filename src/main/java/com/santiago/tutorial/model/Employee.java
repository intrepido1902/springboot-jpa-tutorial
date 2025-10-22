package com.santiago.tutorial.model;

import jakarta.persistence.*;

@Entity @Table(name="employees")
public class Employee {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String correo;
  private String cargo;
  private Double salario;

  public Employee() {}
  public Employee(String n,String c,String g,Double s){nombre=n;correo=c;cargo=g;salario=s;}

  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getNombre(){return nombre;} public void setNombre(String v){this.nombre=v;}
  public String getCorreo(){return correo;} public void setCorreo(String v){this.correo=v;}
  public String getCargo(){return cargo;} public void setCargo(String v){this.cargo=v;}
  public Double getSalario(){return salario;} public void setSalario(Double v){this.salario=v;}
}
