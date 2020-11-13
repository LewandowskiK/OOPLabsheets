package labsheet11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList{
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));


        while (true){
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Please select an option\n" +
                    "\n1.Add a Product\n2.Amend a Product\n3.Remove a Product\n" +
                    "4.View all Products\n5,Quit\n\nPlease enter your choice"));
            switch (choice){
                case 1:
                    addProduct(allProducts);
                    break;
                case 2:
                    amendProduct(allProducts);
                    break;
                case 3:
                    removeProduct(allProducts);
                    break;
                case 4:
                    viewProducts(allProducts);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Thank you for using the system","Quitting",JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Choice must be between 1 and 5 inclusive!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void addProduct(ArrayList<Product> allProducts){
        boolean valid = false;
        int id = 0;
        String name = "", description = "";
        while(!valid){
            id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the ID of the item"));
            name = JOptionPane.showInputDialog("Please enter name of next item");
            description = JOptionPane.showInputDialog("Please enter description of next item");
            int amountChecked = 0;
            for(Product p : allProducts){
                if (id != p.getId())
                    amountChecked++;
            }
            if(amountChecked==allProducts.size())
                valid = true;
            else
                JOptionPane.showMessageDialog(null,"Product with that ID already exists","Error",JOptionPane.ERROR_MESSAGE);
        }
        allProducts.add(new Product(id,name,description));
        JOptionPane.showMessageDialog(null,"Product now created in the array!","Product Added",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void amendProduct(ArrayList<Product> allProducts){
        String searchQuery = JOptionPane.showInputDialog("Please enter the name of the item you wish to amend");

        ArrayList<Product> searchedProducts = new ArrayList<Product>();

        for(Product p:allProducts){
            if(p.getName().toLowerCase().contains(searchQuery.toLowerCase()))
                searchedProducts.add(p);
        }

        if(searchedProducts.size()==0){
            JOptionPane.showMessageDialog(null,"No products similar to that search query were found!","No Products Found",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(searchedProducts.size()==1){
            String output = "The details of the product you wish to amend are:\n\n" +
                    searchedProducts + "\n\n1.Amend Name\n2.Amend Description\n3.Cancel Amendment";

            int id = searchedProducts.get(0).getId();
            boolean finished = false;
            int choice = Integer.parseInt(JOptionPane.showInputDialog(output + "\n\nPlease enter your choice"));
            while (!finished){
                switch (choice){
                    case 1:
                        String name = JOptionPane.showInputDialog("Please enter the new name of the product");
                        allProducts.set(0,new Product(id,name,allProducts.get(0).getDescription()));
                        JOptionPane.showMessageDialog(null,"Name amended successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    case 2:
                        String description = JOptionPane.showInputDialog("Please enter the new description of the product");
                        allProducts.set(0,new Product(id,allProducts.get(0).getName(),description));
                        JOptionPane.showMessageDialog(null,"Description amended successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Cancelling amendment!","Cancelling",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    default:
                        choice = Integer.parseInt(JOptionPane.showInputDialog(output + "\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive!"));
                }
            }
        }
        else
        {
            String output = "Multiple Products similar to search query found!\n\n";
            for(Product p : searchedProducts)
                output+=p+"\n";
            output+="\n\nPlease enter the ID of the product you wish to amend";

            int id = Integer.parseInt(JOptionPane.showInputDialog(output));

            output = "The details of the product you wish to amend are:\n\n";

            for(Product p : searchedProducts)
                if (p.getId()==id)
                    output += p;

            output += "\n\n1.Amend Name\n2.Amend Description\n3.Cancel Amendment";

            boolean finished = false;
            int choice = Integer.parseInt(JOptionPane.showInputDialog(output + "\n\nPlease enter your choice"));
            while (!finished){
                switch (choice){
                    case 1:
                        String name = JOptionPane.showInputDialog("Please enter the new name of the product");
                        allProducts.set(id-1,new Product(id,name,allProducts.get(id-1).getDescription()));
                        JOptionPane.showMessageDialog(null,"Name amended successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    case 2:
                        String description = JOptionPane.showInputDialog("Please enter the new description of the product");
                        allProducts.set(id-1,new Product(id,allProducts.get(id-1).getName(),description));
                        JOptionPane.showMessageDialog(null,"Description amended successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Cancelling amendment!","Cancelling",JOptionPane.INFORMATION_MESSAGE);
                        finished = true;
                        break;
                    default:
                        choice = Integer.parseInt(JOptionPane.showInputDialog(output + "\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive!"));
                }
            }
        }
    }

    public static void removeProduct(ArrayList<Product> allProducts){
        String searchQuery = JOptionPane.showInputDialog("Please enter the name of the item you wish to amend");

        ArrayList<Product> searchedProducts = new ArrayList<Product>();

        for(Product p:allProducts){
            if(p.getName().toLowerCase().contains(searchQuery.toLowerCase()))
                searchedProducts.add(p);
        }

        if(searchedProducts.size()==0){
            JOptionPane.showMessageDialog(null,"No products similar to that search query were found!","No Products Found",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(searchedProducts.size()==1){

            if(JOptionPane.showConfirmDialog(null,"Product Found, details below:\n\n" + searchedProducts + "\n\nAre you sure you wish to remove this product?","Are you sure",JOptionPane.YES_NO_CANCEL_OPTION)==0){
                int id = searchedProducts.get(0).getId();
                allProducts.remove(id-1);
                JOptionPane.showMessageDialog(null,"Product has been removed!","Success",JOptionPane.INFORMATION_MESSAGE);
            }

        }
        else {
            String output = "Multiple Products similar to search query found!\n\n";
            for (Product p : searchedProducts)
                output += p + "\n";
            output += "\n\nPlease enter the ID of the product you wish to remove";

            int id = Integer.parseInt(JOptionPane.showInputDialog(output));

            if(JOptionPane.showConfirmDialog(null,"Product details below\n\n" + allProducts.get(id-1) + "\n\nAre you sure you want to remove this product?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION)==0){
                allProducts.remove(id-1);
                JOptionPane.showMessageDialog(null,"Product ow removed from the array!","Product Removed",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void viewProducts(ArrayList<Product> allProducts){
        String output = "Displaying all of the Products:\n\n";

        for (Product p:allProducts)
            output += p + "\n";

        JOptionPane.showMessageDialog(null,output,"All Products",JOptionPane.INFORMATION_MESSAGE);
    }
}