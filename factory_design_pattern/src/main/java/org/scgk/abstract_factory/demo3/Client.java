package org.scgk.abstract_factory.demo3;



public class Client {

    public static void main(String[] args) {

        SkinFactory factory =  new SpringSkinFactory();
        Button button;
        TextField textField;
        ComboBox comboBox;

        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();


    }

}
