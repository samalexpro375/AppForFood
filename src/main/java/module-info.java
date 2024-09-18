module dev.samalexx.appforfood {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.samalexx.appforfood to javafx.fxml;
    exports dev.samalexx.appforfood;
}