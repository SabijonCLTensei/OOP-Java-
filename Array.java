/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermsabijon;
/**
 *
 * @author User
 */
public class Array {
    Object[] lists;
    int count;

    public Array(Object[] lists) {
        this.lists = lists;
        count = 0;
    }
    
    public void addElement(Object o){
        lists[count] = o;
        count += 1;
    }
    
    public void addElements(Object o, int index){
        if (index == -1) {
            System.out.println("Vegetable cannot be found!");
            return;
        }
        shiftToRight(index);
        lists[index + 1] = o;
        count += 1;
    }
    
    public void delete(){
//        lists[count -1] = null;
        count -= 1;
        lists[count] = null;
    }
    
    public void deleteElementAt(int index){
        lists[index] = null;
        shiftToLeft(index);
        count -= 1;
    }
    
    public void showAllElement(){
        for (Object list : lists) {
            if (list != null){
            System.out.println(list);
            }
        }
    }
    
    public int findElement(Object o){
        for (int i = 0; i < count; i++) {
            if (o == lists[i]){
                return i;
            }
        }
        return -1;
    }

    private void shiftToLeft(int index) {
        for (int i = index; i < count; i++) {
            lists[index] = lists[index +1];
            
        }
    }

    private void shiftToRight(int index) {
        for (int i = count; i > index + 1; i--) {
            lists[i] = lists[i - 1];
        }    
    }

    void addElement(String cabbage, double d, double d0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
