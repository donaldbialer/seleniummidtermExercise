package foodList.a;

//test
//Display the third and fifth item from the above list. Your output should be:
//        Applesauce, unsweetened
//        Juice, Cranberry-apple drink


//1 - Open up page
//2 - Locate locator for 3rd item from list
//3 - Locate locator for 5th item from list
//Print out 3rd item
//Print out 5th item

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class GetFoodItems {

    @Test
    public void DisplayFoodItems() {

        WebElement line3 = getDriver().findElements(By.xpath("[@id=\"tsf\"]/div[2]/descendant::input[5]"));
        String food1 = line3.getText();
        WebElement line5 = getDriver().findElements(By.xpath("[@id=\"tsf\"]/div[2]/descendant::input[9]"));
        String food2 = line5.getText();
        System.out.println("3rd item on the list is " + food1);
        System.out.println("5th item on the list is " + food2);
    }
}


