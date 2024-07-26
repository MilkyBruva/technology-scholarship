package net.scholarship.kai;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
import imgui.flag.ImGuiWindowFlags;
import imgui.type.ImBoolean;

public class App extends Application {

    public ImBoolean checked = new ImBoolean(false);

    public static void main( String[] args ) {
        
        launch(new App());

    }

    @Override
    protected void configure(Configuration config) {
        
        config.setTitle("Test Window");
        
    }

    @Override
    public void process() {

        ImGui.setNextWindowPos(25, 25);
        ImGui.setNextWindowSize(100, 100);
        ImGui.begin("test container", ImGuiWindowFlags.NoResize | 
            ImGuiWindowFlags.NoCollapse | ImGuiWindowFlags.NoDecoration | ImGuiWindowFlags.NoMove);
        ImGui.checkbox("checked", checked);
        ImGui.end();

    }
}
