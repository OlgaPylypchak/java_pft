package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{


  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Hola", "Mola", "+380936532124", "hola.mola@gmail.com"));
    submitContactCreation();
  }


}
