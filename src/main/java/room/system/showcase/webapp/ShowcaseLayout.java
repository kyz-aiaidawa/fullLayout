 
package room.system.showcase.webapp;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


 
@ApplicationScoped
@ManagedBean(eager = true,name = "fulllayout")
public class ShowcaseLayout  extends org.primefaces.extensions.showcase.webapp.ShowcaseLayout{

    public ShowcaseLayout() {
        super();
    }

	 
}
