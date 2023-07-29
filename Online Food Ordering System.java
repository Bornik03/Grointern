import java.util.*;

class FOOD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=1,i=0,total=0;
        int price[]={150,120,150,180,140,160,120,180,220,280,110,130,150,180,180,180,200,10,15,25,25,30,50,50,50,40,80,100};
        int Food[]=new int[30];
        int no[]=new int[30];
        System.out.println("         Starters      ");
        System.out.println();
        System.out.println("1.  Baby Corn Tandoor ----- 150");
        System.out.println("2.  Veg Kebab ----- 120");
        System.out.println("3.  Chicken Kebab ----- 150");
        System.out.println("4.  Chicken Tandoor ----- 180");
        System.out.println("5.  Veg Chowmein ----- 140");
        System.out.println("6.  Chicken Chowmein ----- 160");
        System.out.println();
        System.out.println("        Main Course   ");
        System.out.println();
        System.out.println("7.  Veg Biryani ----- 120");
        System.out.println("8.  Chicken Biryani ----- 180");
        System.out.println("9.  Mutton Biryani ----- 220");
        System.out.println("10. Chef's Special Mutton Biryani ----- 280");
        System.out.println("11. Steam Fried Rice ----- 110");
        System.out.println("12. Egg Fried Rice ----- 130");
        System.out.println("13. Egg Chicken Fried Rice ----- 150");
        System.out.println("14. Chilli Chicken(8 pcs) ----- 180");
        System.out.println("15. Honey Chicken(6 pcs) ----- 180");
        System.out.println("16. Shezwan Chicken(8 pcs) ----- 180");
        System.out.println("17. Hong Kong Chicken(8 pcs) ----- 200");
        System.out.println();
        System.out.println("         Roti and Breads  ");
        System.out.println("18. PLain Roti ----- 10");
        System.out.println("19. Tandoori Roti ----- 15");
        System.out.println("20. Butter Tandoori Roti ----- 25");
        System.out.println("21. Plain Naan ----- 25");
        System.out.println("22. Butter Naan ----- 30");
        System.out.println();
        System.out.println("         Desert and Beverages");
        System.out.println();
        System.out.println("23. Strawberry Ice-Cream ----- 50");
        System.out.println("24. Chocolate Ice-Cream ----- 50");
        System.out.println("25. Butter scotch Ice-Cream ----- 50");
        System.out.println("26. Coca Cola ----- 40");
        System.out.println("27. Blue Lagoon ----- 80");
        System.out.println("28. Mojito ----- 100");
        System.out.println();
        for(;;)
        {
        System.out.println("Enter the food number you want to have and its quantity");
        Food[i]=sc.nextInt();
        no[i]=sc.nextInt();
        System.out.println("Enter 0 to exit or 1 to continue adding");
        a=sc.nextInt();
        if(a==0)
        break;
        i++;
        }
        while(i>=0)
        {
        total=total+(price[Food[i]-1]*no[i]);
        i--;
        }
        System.out.println("Your Grand Total is :"+ total);
        System.out.println("Thank You");
    }
}