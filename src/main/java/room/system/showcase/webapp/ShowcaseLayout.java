package room.system.showcase.webapp;

import java.util.Collection;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.extensions.model.layout.LayoutOptions;

@ApplicationScoped
@ManagedBean(eager = true, name = "fulllayout")
public class ShowcaseLayout {

    private LayoutOptions layoutOptions = new LayoutOptions();
    private String options;

    public ShowcaseLayout() {
        // super();
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @PostConstruct
    protected void initialize() {
        //super.initialize(); //To change body of generated methods, choose Tools | Templates.
        
        initp_temp();
        initp_north();
        initp_south();
        initp_center();
        initp_west();
        initp_east();
        options = layoutOptions.toJson();
    }

    private void initp_temp() {

        LayoutOptions panes = new LayoutOptions();
        panes.addOption("resizable", true);
        panes.addOption("closable", true);
        panes.addOption("slidable", false);
        panes.addOption("resizeWithWindow", false);
        panes.addOption("resizeWhileDragging", true);
        layoutOptions.setPanesOptions(panes);


        layoutOptions.setPanesOptions(panes);

         
    }

    private void initp_north() {

        // north pane
        LayoutOptions north = new LayoutOptions();
        north.addOption("resizable", false);
        north.addOption("closable", false);
        north.addOption("size", 60);
        north.addOption("spacing_open", 0);
        layoutOptions.setNorthOptions(north);

        System.out.println("options = " + options);

    }

    private void initp_south() {
        // south pane
        LayoutOptions south = new LayoutOptions();
        south.addOption("resizable", false);
        south.addOption("closable", false);
        south.addOption("size", 28);
        south.addOption("spacing_open", 0);
        layoutOptions.setSouthOptions(south);

    }

    private void initp_center() {
        // center pane
        LayoutOptions center = new LayoutOptions();
        center.addOption("resizable", false);
        center.addOption("closable", false);
        center.addOption("resizeWhileDragging", false);
        center.addOption("minWidth", 100); // 200 -> 100 
        center.addOption("minHeight", 60);
        layoutOptions.setCenterOptions(center);
    }

    private void initp_west() {
        // west pane
        LayoutOptions west = new LayoutOptions();
        west.addOption("size", 210);
        west.addOption("minSize", 180);
        west.addOption("maxSize", 900); // 500 ->  900
        layoutOptions.setWestOptions(west);

    }

    private void initp_east() {
        // east pane
        LayoutOptions east = new LayoutOptions();
        east.addOption("size", 448);
        east.addOption("minSize", 100); // 180 -> 100 
        east.addOption("maxSize", 650);
        layoutOptions.setEastOptions(east);

        // nested east layout
        LayoutOptions childEastOptions = new LayoutOptions();
        east.setChildOptions(childEastOptions);

        // east-center pane
        LayoutOptions eastCenter = new LayoutOptions();
        eastCenter.addOption("minHeight", 60);
        childEastOptions.setCenterOptions(eastCenter);

        // south-center pane
        LayoutOptions southCenter = new LayoutOptions();
        southCenter.addOption("size", "70%");
        southCenter.addOption("minSize", 60);
        childEastOptions.setSouthOptions(southCenter);
    }

    private void initpanel() {


        // options for all panes
        LayoutOptions panes = new LayoutOptions();
        panes.addOption("slidable", false);
        panes.addOption("resizeWhileDragging", false);
        layoutOptions.setPanesOptions(panes);

        // options for center pane
        LayoutOptions center = new LayoutOptions();
        layoutOptions.setCenterOptions(center);

        // options for nested center layout
        LayoutOptions childCenterOptions = new LayoutOptions();
        center.setChildOptions(childCenterOptions);

        // options for center-north pane
        LayoutOptions centerNorth = new LayoutOptions();
        centerNorth.addOption("size", "50%");
        childCenterOptions.setNorthOptions(centerNorth);

        // options for center-center pane
        LayoutOptions centerCenter = new LayoutOptions();
        centerCenter.addOption("minHeight", 60);
        childCenterOptions.setCenterOptions(centerCenter);

        // options for west pane
        LayoutOptions west = new LayoutOptions();
        west.addOption("size", 200);
        layoutOptions.setWestOptions(west);

        // options for nested west layout
        LayoutOptions childWestOptions = new LayoutOptions();
        west.setChildOptions(childWestOptions);

        // options for west-north pane
        LayoutOptions westNorth = new LayoutOptions();
        westNorth.addOption("size", "33%");
        childWestOptions.setNorthOptions(westNorth);

        // options for west-center pane
        LayoutOptions westCenter = new LayoutOptions();
        westCenter.addOption("minHeight", "60");
        childWestOptions.setCenterOptions(westCenter);

        // options for west-south pane
        LayoutOptions westSouth = new LayoutOptions();
        westSouth.addOption("size", "33%");
        childWestOptions.setSouthOptions(westSouth);

        // options for east pane
        LayoutOptions east = new LayoutOptions();
        east.addOption("size", 200);
        layoutOptions.setEastOptions(east);

        // options for south pane
        LayoutOptions south = new LayoutOptions();
        south.addOption("size", 80);
        layoutOptions.setSouthOptions(south);
    }
}
