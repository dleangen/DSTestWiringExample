package dstest.provider;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import dstest.api.I;

@Component(
        name="enroute.C1",
        immediate=true, 
        property = { "param=ignore" }
)
public class C1 implements I {
    @Activate
    void activate()
    {
        System.out.println( "Activated C1" );
    }

    @Override
	public String name() {
		return "C1";
	}
}
