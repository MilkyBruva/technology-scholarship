package net.scholarship.kai;

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
import imgui.type.ImBoolean;
import net.scholarship.kai.container.Container;

public class App extends Application {

    public ImBoolean checked = new ImBoolean(false);
    public int windowWidth = 500;
    public int windowHeight = 500;
    public TestContent testContent = new TestContent();
    public Container testContainer;

    public static void main(String[] args) {
        
        launch(new App());

    }

    @Override
    protected void configure(Configuration config) {
        
        config.setTitle("Test Window");
        config.setWidth(this.windowWidth);
        config.setHeight(this.windowHeight);

        this.testContainer = new Container(Container.RIGHT, Container.LEFT, Container.HALF, Container.HALF, 
            10, testContent, this);
        
    }

    @Override
    public void process() {

        this.testContainer.update();

    }
}
