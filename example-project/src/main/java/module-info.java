module com.example.demo {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.webEmpty;
    requires org.seleniumhq.selenium.firefox_driver;
    requires org.seleniumhq.selenium.chrome_driver;
    requires org.seleniumhq.selenium.support;

    requires com.github.kwhat.jnativehook;
    requires org.xerial.sqlitejdbc;
    requires org.apache.commons.io;
    requires mysql.connector.java;
    requires com.zaxxer.hikari;
    requires org.bouncycastle.provider;
    requires tess4j;

    requires java.desktop;
    requires java.sql;

    exports com;

    exports com.form;
    opens com.form to javafx.fxml;
    opens com;

}