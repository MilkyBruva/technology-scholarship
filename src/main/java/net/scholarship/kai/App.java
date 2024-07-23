package net.scholarship.kai;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;

public class App extends Application {
    public static void main( String[] args ) {
        
        launch(new App());

    }

    @Override
    protected void configure(Configuration config) {

        config.setTitle("Test Window");

    }

    @Override
    public void process() {
        
        ImGui.text("This is come text");

    }
}
