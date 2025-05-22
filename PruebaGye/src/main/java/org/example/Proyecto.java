package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;


public class Proyecto {
    public Proyecto() {
    }

    public static void main(String[] args) throws InterruptedException

    {
        Scanner scanner = new Scanner(System.in);
        // Establece la propiedad del sistema para ChromeDriver
        System.setProperty("webdriver.chrome.driver", "CHROME\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("Ingresar la opcion: ");
        int opcion = scanner.nextInt();


        do {
        System.out.println("Ingresar la opción (1-5): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Registro(driver);
                break;
            case 2:
                Llenarregistro(driver);
                break;
            case 3:
                Logueo(driver);
                break;
            case 4:
                Transferencia(driver);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 5.");
        }
    } while (opcion != 5);








    }

    public static void Registro (WebDriver driver)
    {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();


    }
    public static void Llenarregistro (WebDriver driver)
    {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Pedro");

        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("carrillo");

        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Acacias y piedraita");

        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Guayaquil");

        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Guayas");

        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("090405");

        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("0900451245");

        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("0900445");

        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("carrillo1");

        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("123456");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();





    }

    public static void Logueo (WebDriver driver)
    {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys("carrillo1");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys("123456");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();




    }

    public static void Transferencia (WebDriver driver)
    {
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")).sendKeys("carrillo1");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")).sendKeys("123456");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"amount\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("150");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/div[2]/input")).click();


    }
}







