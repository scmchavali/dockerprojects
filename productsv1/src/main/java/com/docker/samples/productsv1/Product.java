package com.docker.samples.productsv1;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "product")
public class Product implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String name;
   private int quantity;
  
   public Product(){}

   public Product(int id, String name, int quantity){
      this.id = id;
      this.name = name;
      this.quantity=quantity;
     }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   @XmlElement
      public void setName(String name) {
      this.name = name;
   }
   public int getQuantity() {
      return quantity;
   }
   @XmlElement
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }
   
   
}
