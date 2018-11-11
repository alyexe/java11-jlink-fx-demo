module com.altran.igjava.demo.fx.application {

    requires javafx.graphics;
    requires javafx.controls;

    opens com.altran.igjava.openjfx.demo to javafx.graphics;
}