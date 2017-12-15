package sepr.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import javax.xml.soap.Text;

/**
 * Created by Dom's Surface Mark 2 on 28/11/2017.
 */
public class WidgetFactory {
    private static Texture basicButtonTexture;
    private static Texture mainMenuTopBarTexture;
    private static Texture bottomBarTexture;
    private static Texture mapGraphicTexture;
    private static Texture labelTexture;
    private static Texture optionsGraphicTexture;

    private static Texture sliderBarTexture;
    private static Texture sliderKnobTexture;

    private static Texture onSwitchTexture;
    private static Texture offSwitchTexture;

    private static Texture playerLabelTexture;
    private static Texture playerLeftBtnTexture;
    private static Texture playerRightBtnTexture;
    private static Texture menuBtnLabelTexture;
    private static Texture collegeLeftBtnTexture;
    private static Texture collegeRightBtnTexture;
    private static Texture startGameBtnTexture;
    private static Texture nameBoxLabelTexture;

    private static Texture alcuinLogoTexture;
    private static Texture derwentLogoTexture;
    private static Texture halifaxLogoTexture;
    private static Texture hesEastLogoTexture;
    private static Texture jamesLogoTexture;
    private static Texture uniOfYorkLogoTexture;
    private static Texture vanbrughLogoTexture;
    public static Texture wentworthLogoTexture;


    public WidgetFactory() {
        basicButtonTexture = new Texture("ui/HD-assets/Menu-Button-Full.png");
        mainMenuTopBarTexture = new Texture("ui/HD-assets/Main-Menu-Top-Bar.png");
        bottomBarTexture = new Texture("ui/HD-assets/Bottom-Bar.png");
        mapGraphicTexture = new Texture("ui/HD-assets/Main-Menu-Map.png");
        labelTexture = new Texture("ui/HD-assets/Menu-Button.png");
        optionsGraphicTexture = new Texture("ui/HD-assets/General-Jack.png");

        sliderBarTexture = new Texture("ui/sliderBar.png");
        sliderKnobTexture = new Texture("ui/sliderKnob.png");

        onSwitchTexture = new Texture("ui/onSwitch.png");
        offSwitchTexture = new Texture("ui/offSwitch.png");

        playerLabelTexture = new Texture("ui/HD-assets/Player-Label.png");
        playerLeftBtnTexture = new Texture("ui/HD-assets/Player-Left-Button-Full.png");
        playerRightBtnTexture = new Texture("ui/HD-assets/Player-Right-Button-Full.png");
        menuBtnLabelTexture = new Texture("ui/HD-assets/Menu-Button.png");
        collegeLeftBtnTexture = new Texture("ui/HD-assets/College-Left-Button.png");
        collegeRightBtnTexture = new Texture("ui/HD-assets/College-Right-Button.png");
        startGameBtnTexture = new Texture("ui/HD-assets/Start-Game-Button-Full.png");
        nameBoxLabelTexture = new Texture("ui/HD-assets/Game-Setup-Name-Box.png");

        alcuinLogoTexture = new Texture("ui/HD-assets/alcuin-logo.png");
        derwentLogoTexture = new Texture("ui/HD-assets/derwent-logo.png");
        halifaxLogoTexture = new Texture("ui/HD-assets/halifax-logo.png");
        hesEastLogoTexture = new Texture("ui/HD-assets/hes-east-logo.png");
        jamesLogoTexture = new Texture("ui/HD-assets/james-logo.png");
        uniOfYorkLogoTexture = new Texture("ui/HD-assets/uni-of-york-logo.png");
        vanbrughLogoTexture = new Texture("ui/HD-assets/vanbrugh-logo.png");
        wentworthLogoTexture = new Texture("ui/HD-assets/wentworth-logo.png");


    }

    public static TextButton genBasicButton(String buttonText) {
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle(); // create style for buttons to use
        style.up = new TextureRegionDrawable(new TextureRegion(basicButtonTexture, 0, 0, 857, 123)); // image for button to use in default state
        style.down = new TextureRegionDrawable(new TextureRegion(basicButtonTexture, 0, 123, 857, 123)); // image for button to use when pressed down
        style.font = new BitmapFont(); // set button font to the default Bitmap Font

        return new TextButton(buttonText, style);
    }

    public static Image genMainMenuTopBarGraphic() {
        return new Image(mainMenuTopBarTexture);
    }

    public static Image genBottomBarGraphic() {
        return new Image(bottomBarTexture);
    }

    public static Image genMapGraphic() {
        return new Image(mapGraphicTexture);
    }

    public static Image genOptionsGraphic() {
        return new Image(optionsGraphicTexture);
    }

    public static Image genAlcuinLogo() {return new Image(alcuinLogoTexture);}
    public static Image genDerwentLogo() {return new Image(derwentLogoTexture);}
    public static Image genHalifaxLogo() {return new Image(halifaxLogoTexture); }
    //public static Image genHesEastLogo() {return new Image(hesEastLogoTexture);}
    public static Image genJamesLogo() {return new Image(jamesLogoTexture);}
    public static Image genUniOfYorkLogo() {return new Image(uniOfYorkLogoTexture);}
    public static Image genVanbrughtLogo() {return new Image(vanbrughLogoTexture);}
    public static Image genWentworthLogo() {return new Image(wentworthLogoTexture);}

    /** OUTDATED
    public static Label genCollegeLogo(String collegeName){
        Label.LabelStyle style = new Label.LabelStyle();
        style.font = new BitmapFont();
        if(collegeName.equals("ALCUIN")){
            style.background = new TextureRegionDrawable((new TextureRegion(alcuinLogoTexture)));
        }else if(collegeName.equals("DERWENT")){
            style.background = new TextureRegionDrawable((new TextureRegion(derwentLogoTexture)));
        }else if(collegeName.equals("HALIFAX")){
            style.background = new TextureRegionDrawable((new TextureRegion(halifaxLogoTexture)));
        }else if(collegeName.equals("JAMES")){
            style.background = new TextureRegionDrawable((new TextureRegion(jamesLogoTexture)));
        }else if(collegeName.equals("UNIVERSITY OF YORK")){
            style.background = new TextureRegionDrawable((new TextureRegion(uniOfYorkLogoTexture)));
        }else if(collegeName.equals("VANBRUGH")){
            style.background = new TextureRegionDrawable((new TextureRegion(vanbrughLogoTexture)));
        }else if(collegeName.equals("WENTWORTH")){
            style.background = new TextureRegionDrawable((new TextureRegion(wentworthLogoTexture)));
        }else{
            System.out.println("ERROR");
            return null;
        }
        return new Label("", style);
    }
    **/

    public static Label.LabelStyle genCollegeLabelStyle(String collegeName){
        Label.LabelStyle style = new Label.LabelStyle();
        style.font = new BitmapFont();

        if(collegeName.equals("ALCUIN")){
            style.background = new TextureRegionDrawable((new TextureRegion(alcuinLogoTexture)));
        }else if(collegeName.equals("DERWENT")){
            style.background = new TextureRegionDrawable((new TextureRegion(derwentLogoTexture)));
        }else if(collegeName.equals("HALIFAX")){
            style.background = new TextureRegionDrawable((new TextureRegion(halifaxLogoTexture)));
        }else if(collegeName.equals("HESLINGTON EAST")){
            style.background = new TextureRegionDrawable((new TextureRegion(hesEastLogoTexture)));
        }else if(collegeName.equals("JAMES")){
            style.background = new TextureRegionDrawable((new TextureRegion(jamesLogoTexture)));
        }else if(collegeName.equals("UNIVERSITY OF YORK")){
            style.background = new TextureRegionDrawable((new TextureRegion(uniOfYorkLogoTexture)));
        }else if(collegeName.equals("VANBRUGH")){
            style.background = new TextureRegionDrawable((new TextureRegion(vanbrughLogoTexture)));
        }else if(collegeName.equals("WENTWORTH")){
            style.background = new TextureRegionDrawable((new TextureRegion(wentworthLogoTexture)));
        }else{
            System.out.println("ERROR");
            return null;
        }
        return new Label.LabelStyle(style);
    }


    public static Label genPlayerLabel(String labelText) {
        Label.LabelStyle style = new Label.LabelStyle();
        style.font = new BitmapFont();
        style.background = new TextureRegionDrawable(new TextureRegion(playerLabelTexture));

        return new Label(labelText, style);
    }

    public static Label genMenuBtnLabel(String labelText) {
        Label.LabelStyle style = new Label.LabelStyle();
        style.font = new BitmapFont();
        style.background = new TextureRegionDrawable(new TextureRegion(menuBtnLabelTexture));

        return new Label(labelText, style);
    }

    public static Label genNameBoxLabel(String labelText) {
        Label.LabelStyle style = new Label.LabelStyle();
        style.font = new BitmapFont();

        return new Label(labelText, style);
    }

    public static TextField playerNameTextField(String name){
        TextField.TextFieldStyle  style = new TextField.TextFieldStyle();
        style.font = new BitmapFont();
        style.fontColor = new Color(Color.WHITE);

        return new TextField(name, style);
    }

    public static Button genPlayerLeftButton() {
        Button.ButtonStyle style = new Button.ButtonStyle();
        style.up = new TextureRegionDrawable(new TextureRegion(playerLeftBtnTexture, 0, 0, 111, 123));
        style.down = new TextureRegionDrawable(new TextureRegion(playerLeftBtnTexture, 0, 123, 111, 123));

        return new Button(style);
    }

    public static Button genPlayerRightButton() {
        Button.ButtonStyle style = new Button.ButtonStyle();
        style.up = new TextureRegionDrawable(new TextureRegion(playerRightBtnTexture, 0, 0, 111, 123));
        style.down = new TextureRegionDrawable(new TextureRegion(playerRightBtnTexture, 0, 123, 111, 123));

        return new Button(style);
    }

    public static Button genCollegeLeftButton() {
        Button.ButtonStyle style = new Button.ButtonStyle();
        style.up = new TextureRegionDrawable(new TextureRegion(collegeLeftBtnTexture));
        style.down = new TextureRegionDrawable(new TextureRegion(collegeLeftBtnTexture));

        return new Button(style);
    }

    public static Button genCollegeRightButton() {
        Button.ButtonStyle style = new Button.ButtonStyle();
        style.up = new TextureRegionDrawable(new TextureRegion(collegeRightBtnTexture));
        style.down = new TextureRegionDrawable(new TextureRegion(collegeRightBtnTexture));

        return new Button(style);
    }

    public static TextButton genStartGameButton(String buttonText) {
        TextButton.TextButtonStyle style = new TextButton.TextButtonStyle();
        style.up = new TextureRegionDrawable(new TextureRegion(startGameBtnTexture, 0, 0, 723, 123));
        style.down = new TextureRegionDrawable(new TextureRegion(startGameBtnTexture, 0, 123, 723, 123));
        style.font = new BitmapFont();

        return new TextButton(buttonText,style);
    }


    /**
     *
     * @param items the list of items that may be selected
     * @return a selector widget styled and using the items provided
     */
    public static SelectBox<String> genStyledSelectBox(String[] items) {
        SelectBox.SelectBoxStyle style = new SelectBox.SelectBoxStyle();
        style.font = new BitmapFont();
        style.listStyle = new List.ListStyle(new BitmapFont(), Color.BLACK, Color.BROWN, new TextureRegionDrawable(new TextureRegion(sliderBarTexture)));
        style.scrollStyle = new ScrollPane.ScrollPaneStyle(new TextureRegionDrawable(new TextureRegion(sliderKnobTexture)), new TextureRegionDrawable(new TextureRegion(sliderKnobTexture)), new TextureRegionDrawable(new TextureRegion(sliderKnobTexture)), new TextureRegionDrawable(new TextureRegion(sliderKnobTexture)), new TextureRegionDrawable(new TextureRegion(sliderKnobTexture)));

        SelectBox<String> selectBox = new SelectBox<String>(style);
        selectBox.setItems(items);
        return selectBox;
    }

    /**
     *
     * @return a toggleable on off switch widget
     */
    public static CheckBox genOnOffSwitch() {
        CheckBox.CheckBoxStyle style = new CheckBox.CheckBoxStyle();
        style.font = new BitmapFont();
        style.checkboxOn = new TextureRegionDrawable(new TextureRegion(onSwitchTexture));
        style.checkboxOff = new TextureRegionDrawable(new TextureRegion(offSwitchTexture));


        return new CheckBox(null, style);
    }

    /**
     * Generates a slider widget that is styled for use in the options screen
     * @return a slider
     */
    public static Slider genStyledSlider() {
        Slider.SliderStyle style = new Slider.SliderStyle();
        style.background = new TextureRegionDrawable(new TextureRegion(sliderBarTexture));
        style.knob = new TextureRegionDrawable(new TextureRegion(sliderKnobTexture));
        style.knobDown = new TextureRegionDrawable(new TextureRegion(sliderKnobTexture));
        style.knobOver = new TextureRegionDrawable(new TextureRegion(sliderKnobTexture));

        return new Slider(0f, 1f, 0.01f, false, style);
    }
}
