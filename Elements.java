package week1.day2;

public class Elements {
    public static void main(String[] args) {
        
        // Button object
        Button btn = new Button();
        btn.click();     // inherited from WebElement
        btn.submit();    // its own method

        // TextField object
        TextField tf = new TextField();
        tf.setText("Hello");  // inherited from WebElement
        tf.getText();         // its own method

        // CheckBoxButton object
        CheckBoxButton cb = new CheckBoxButton();
        cb.click();             // from WebElement
        cb.submit();            // from Button
        cb.clickCheckButton();  // its own method

        // RadioButton object
        RadioButton rb = new RadioButton();
        rb.click();              // from WebElement
        rb.submit();             // from Button
        rb.selectRadioButton();  // its own method
    }
}
