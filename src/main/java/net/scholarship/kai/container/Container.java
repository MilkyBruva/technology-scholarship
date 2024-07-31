package net.scholarship.kai.container;

import imgui.ImGui;
import net.scholarship.kai.App;

public final class Container {
    
    public int x;
    public int y;
    public int contentX;
    public int contentY;
    public int width;
    public int height;
    public int realX;
    public int realY;
    public int realWidth;
    public int realHeight;
    public int contentWidth;
    public int contentHeight;
    public int padding;
    public ImGuiContents imGuiContents;

    public static final int HALF = 0;
    public static final int LEFT = -1;
    public static final int RIGHT = -2;
    public static final int TOP = -3;
    public static final int BOTTOM = -4;

    private App app;

    public Container(int x, int y, int width, int height, int padding, ImGuiContents imGuiContents, 
        App app) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.padding = padding;
        this.imGuiContents = imGuiContents;
        this.app = app;

        this.setDimensions();
        this.imGuiContents.init();

    }

    public final void setDimensions() {

        if (this.width == Container.HALF) { this.realWidth = this.app.windowWidth / 2; }
        if (this.height == Container.HALF) { this.realHeight = this.app.windowHeight / 2; }
        if (this.x == Container.LEFT) { this.realX = 0; }
        if (this.x == Container.RIGHT) { this.realX = this.app.windowWidth - this.realWidth; }
        if (this.y == Container.TOP) { this.realY = 0; }
        if (this.y == Container.BOTTOM) { this.realY = this.app.windowHeight - this.realHeight; }
        this.contentX = this.realX + this.padding;
        this.contentY = this.realY + this.padding;
        this.contentWidth = this.realWidth - (this.padding * 2);
        this.contentWidth = this.realHeight - (this.padding * 2);

    }

    public void update() {

        this.setDimensions();
        ImGui.setNextWindowPos(this.contentX, this.contentY);
        ImGui.setNextWindowSize(this.contentWidth, this.contentHeight);
        this.imGuiContents.update();

    }

}
