package net.scholarship.kai;

import imgui.ImGui;
import imgui.flag.ImGuiWindowFlags;
import imgui.type.ImBoolean;
import net.scholarship.kai.container.ImGuiContents;

public class TestContent implements ImGuiContents {

    private ImBoolean checked;

    @Override
    public void init() {
        
        this.checked = new ImBoolean(false);

    }

    @Override
    public void update() {
        
        ImGui.begin("test container", ImGuiWindowFlags.NoResize | 
            ImGuiWindowFlags.NoCollapse | ImGuiWindowFlags.NoDecoration | ImGuiWindowFlags.NoMove);
        ImGui.checkbox("checked", this.checked);
        ImGui.end();

    }
    
}
