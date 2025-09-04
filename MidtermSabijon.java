/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermsabijon;
public class MidtermSabijon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vegetables[] Vegetable = new Vegetables[100];
        
        Array arr = new Array(Vegetable);
        
        arr.addElement("Cabbage", 95.00, 5.00, 1);
        arr.addElement("Potato", 90.00, 4.00, 3);
        arr.addElement("cucumber", 80.00, 3.00, 1);
        arr.addElement("Carrot", 93.00, 3.00, 2);
        
        arr.showAllElement();
        
        int i = arr.findElement("Potato");
        arr.addElements("Lettuce", i);
        
        System.out.println("UPDATED LISTS");
        arr.showAllElement();
        arr.delete();
        System.out.println("UPDATED LISTS");
        arr.showAllElement();
    }

}
