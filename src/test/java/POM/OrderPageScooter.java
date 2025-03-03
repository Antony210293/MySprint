package POM;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.core.Is.is;

public class OrderPageScooter {

    private WebDriver driver;

    //Локатор заголовка страницы заказа
    private final By orderHeadline = By.className("Order_Header__BZXOb");
    // Заголовок страницы заказа (текст)
    public static final String orderHeadlineText = "Для кого самокат";
    //Имя
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    // Фамилия
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    // Адрес: куда привезти заказ
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Селектор со списком станций метро
    private By subwayField = By.xpath(".//input[@placeholder='* Станция метро']");
    // Телефон: на него позвонит курьер
    private final By phoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка Далее
    private final By orderNextButton = By.xpath(".//button[text()='Далее']");
    // Когда привезти самокат
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Поле Срок аренды
    private final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");
    // Комментарий для курьера
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка Заказать
    private final By orderCreateButton = By.xpath("//div[contains(@class,'Order_Buttons')]/button[text()='Заказать']");
    // Кнопка подтверждения заказа
    private final By orderConfirmButton = By.xpath(".//button[text()='Да']");



    // Метод для проверки открытия страницы после нажатия на кнопку "Заказать"
    public void isPageOpen(String headlineText, String text) {
        MatcherAssert.assertThat(headlineText, is(text));
    }

    // Метод для получения текста заголовка страницы создания заказа
    public String getOrderHeadline() {
        return driver.findElement(orderHeadline).getText();
    }

    public OrderPageScooter(WebDriver driver){
        this.driver = driver;
        }

        //Метод для указания Имени
    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    // Метод для указания Фамилии
    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    // Метод для указания поля Адрес
    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    // Метод для выбора станции метро
    public void setSubway(String subway) {
        driver.findElement(subwayField).click();
        driver.findElement(By.xpath(".//div[text()='" + subway + "']")).click();
    }

    // Метод для указания номера телефона
    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    // Метод для перехода ко второй странице создания заказа
    public void clickOrderNextButton() {
        driver.findElement(orderNextButton).click();
    }

    // Метод для указания даты дотсавки
    public void setDate(String date) {
        driver.findElement(dateField).sendKeys(date);
    }

    // Метод для указания срока аренды
    public void setRentalPeriod(String rentalPeriod) {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(".//div[text()='" + rentalPeriod + "']")).click();
    }

    // Метод для выбора цвета
    public void setColor(String color) {
        driver.findElement(By.xpath(".//label[text()='" + color + "']")).click();
    }

    // Метод указания комментария
    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    // Метод для перехода к подтверждению заказа
    public void clickOrderCreateButton() {
        driver.findElement(orderCreateButton).click();
    }

    // Метод для подтверждения заказа
    public void clickOrderConfirmButton() {
        driver.findElement(orderConfirmButton).click();
    }


}
