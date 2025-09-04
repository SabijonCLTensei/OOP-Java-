/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermsabijon;

/**
 *
 * @author User
 */
public class Vegetables {
    public Object name;
    public double price;
    public double weight;
    public int toxicity;
    
    public Vegetables(Object name, double price, double weight, int toxicity){
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.toxicity = toxicity;
    }
    
    public Vegetables(){
    
    }
    
    @Override
    public String toString(){
        String info = String.format("Name: %s \n" + "Price: %.2f \n" + "Weight: %.2f\n" + "Toxicity: %d \n", name, price, weight, toxicity);
        return info;
    }
}
