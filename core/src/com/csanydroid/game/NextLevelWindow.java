package com.csanydroid.game;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;

/**
 * Created by tanarur on 2016.01.17..
 */
public class NextLevelWindow extends MyWindow {
    public NextLevelWindow() {
        super();
        setTitle("Gratulálok!");
        Label label = new Label("Lorem ipsum dolor sit amet, consectetur consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", labelStyle);
        label.setWrap(true);
        label.setAlignment(Align.topLeft, Align.bottomLeft);
        label.setPosition(10, 350);
        label.setWidth(getWidth() - 20);
        label.setFontScale(0.6f);

        MazeActor mazeActor = new MazeActor(Maze.findMaze("1"));
        mazeActor.setSize(200,200);
        mazeActor.setPosition(getWidth()/2-100,20);

        addActor(label);
        addActor(mazeActor);
        addListener(new ClickListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                remove();
                return super.touchDown(event, x, y, pointer, button);
            }
        });
    }
}
