package it.trekkete.amcharts.vaadin;

import com.vaadin.flow.component.UI;

public class Configurator {

    public static void init() {

        UI.getCurrent().getPage().addJavaScript("https://cdn.amcharts.com/lib/5/index.js");
        UI.getCurrent().getPage().addJavaScript("https://cdn.amcharts.com/lib/5/xy.js");
        UI.getCurrent().getPage().addJavaScript("https://cdn.amcharts.com/lib/5/themes/Animated.js");

    }

}