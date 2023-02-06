package it.trekkete.amcharts.vaadin.layout;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import it.trekkete.amcharts.Am5Chart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChartLayout extends VerticalLayout {

    private final Logger log = LogManager.getLogger(ChartLayout.class);

    public ChartLayout(Am5Chart chart) {

        String js = chart.render();

        log.error(js);

        Div chartContainer = new Div();
        chartContainer.setSizeFull();
        chartContainer.setId(chart.getName());

        UI.getCurrent().getPage().executeJs(js);

        add(chartContainer);

    }
}
